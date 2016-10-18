
/* Author Nawaf Alsufiani 10/12/2016
 this is the main function of the program
 */

import java.util.Scanner;

public class SimulationDriver {

	public static void main(String[] args) 
	{
	
		testTheProgram();
		
	   
        
    
	}

	
	
	public static void testTheProgram()
	{
		Scanner scanner = new  Scanner(System.in);
		String selectA,selectB,selectC;
		String singleAnswer;
		System.out.println("please enter 1 for single questions or 2 for multiple answers questions or press any key to exit");
		int menu = scanner.nextInt();
		Person [] student = new Person[4];
        student[0] = new Student("Nawaf",1);
        student[1] = new Student("Gorge",2);
        student[2] = new Student("Naruto",3);
        student[3] = new Student("Fahd",4);
        
        
		if(menu==1)
		{   SingleAnswer question = new SingleAnswer("who is BilGats?a:rich man  b:loser  c:non of above","a");
			IVoteService singleVote = new IVoteService(student[0], question);
			
			question.setCorrectAnswer("a");
			for(int i=0;i<student.length;i++)
		 {
			 
	         
	         question.printQuestionType();
	         System.out.println(question.getQuestion());
	         
	         singleAnswer = scanner.next();
	         question.setStudentAnswer(singleAnswer);
	         
	         
	         singleVote.submit(student[i].getId(),question.getStudentAnswer());
	         
		 }
			//To check if resubmit the the same question by the student will write the answer
			//the id which is selected is 1 student Nawaf
			 question.printQuestionType();
	         System.out.println(question.getQuestion());
	         
	         singleAnswer = scanner.next();
	         question.setStudentAnswer(singleAnswer);
	         
	         
	         singleVote.submit(student[0].getId(),question.getStudentAnswer());
			
			//show the statistics
			System.out.println(singleVote.statistics());
		}
		else if(menu==2)
		{  
			 MultipleAnswer multi = new MultipleAnswer("which of the folowing is  a sea food? a:tuna b:meat c:caw","a","b","0");
			 IVoteService vote = new IVoteService(student[0], multi);
			
			 multi.setCorrectAnswer("a","b","0");
			 System.out.println(multi.getCorrectAnswer());
			 for(int i=0;i<student.length;i++)
			 {
		    	
			    multi.printQuestionType();
		        multi.setQuestion("which of the folowing is  a sea food? a:tuna b:meat c:caw");
		        multi.setCorrectAnswer("a","b","0");//0 in case the student does't want to select c
		        System.out.println( multi.getQuestion());
		        System.out.println("is a:Correct? if yes, enter 'a' and press enter. if no, enter 0");
		        selectA = scanner.next();
		        System.out.println("is b:Correct? if yes, enter 'b' and press enter. if no, enter 0");
		        selectB = scanner.next();
		        System.out.println("is c:Correct? if yes, enter 'c' and press enter. if no, enter 0");
		        selectC = scanner.next();
		        multi.setStudentAnswer(selectA, selectB, selectC);
		        vote.submit(student[i].getId(),multi.getStudentAnswer());
		            
			 }
			 /*test if code will work if student will resubmit again
			  * selected student Naruto with id 3
			*/ 
			 
			  multi.printQuestionType();
		        multi.setQuestion("which of the folowing is  a sea food? a:tuna b:meat c:caw");
		        multi.setCorrectAnswer("a","b","0");//0 in case the student does't want to select c
		        System.out.println( multi.getQuestion());
		        System.out.println("is a:Correct? if yes, enter 'a' and press enter. if no, enter 0");
		        selectA = scanner.next();
		        System.out.println("is b:Correct? if yes, enter 'b' and press enter. if no, enter 0");
		        selectB = scanner.next();
		        System.out.println("is c:Correct? if yes, enter 'c' and press enter. if no, enter 0");
		        selectC = scanner.next();
		        multi.setStudentAnswer(selectA, selectB, selectC);
		        vote.submit(student[3].getId(),multi.getStudentAnswer());
			 
			 //print the statistic of the results
			  System.out.println(vote.statistics());
		}
		
		
	}
}
