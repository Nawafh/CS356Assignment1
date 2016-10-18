import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

/* Author Nawaf Alsufiani 10/12/2016
 this is the main function of the program
 */

public class main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new  Scanner(System.in);
		String selectA,selectB,selectC;
		String singleAnswer;
		System.out.println("please enter 1 for single questions or 2 for multiple answers questions or press any key to exit");
		int menu = scanner.nextInt();
		Person [] student = new Person[4];
        student[0] = new Student("Nawaf",1);
        student[1] = new Student("Gorge",2);
        student[2] = new Student("Ali",3);
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
			System.out.println(singleVote.statistics());
		}
		else if(menu==2)
		{
			MultipleAnswer multi = new MultipleAnswer();
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
			  System.out.println(vote.statistics());
		}
		
		
		
	   
        
    
	}

	
	
	
}
