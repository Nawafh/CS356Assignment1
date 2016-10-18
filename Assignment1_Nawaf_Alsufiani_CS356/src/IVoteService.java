/* Author,Nawaf Alsufiani
 * 
  This is the IVoteService class was writen to procees 
 the students answers and return the statistic about the 
 the answers of the students
 */

import java.util.Hashtable;

public class IVoteService
{
	//data members
private Person  students;
private Hashtable<Integer,String> table = new Hashtable<>();//hash table to store student id and the answer.
private String studentAnswer;//store student's answer
private int id;// an Id of the student is used to get information about the student if he/she resubmit the same question again
private String correctAnswer;//store the correct answer of the question to compare it with student's answer.
private int right=0; //count the number of correct questions
private int wrong=0;//count the number of wrong questions

public 	IVoteService(Person  students,SingleAnswer singleAnswer)
{
	
	this.students=students;
	correctAnswer=singleAnswer.getCorrectAnswer();
	
}
	
public 	IVoteService(Person  students,MultipleAnswer MultipleAnswer)
{
	
	this.students=students;
	correctAnswer=MultipleAnswer.getCorrectAnswer();
	
}


public void submit(int id,String studentAnswer)
{
	this.id=id;
	this.studentAnswer=studentAnswer;
	
	boolean contain = table.containsKey(id);
	
	if(contain==true)
	{
		if(table.get(id).equals(correctAnswer))
		{
			right--;
		}
		else
		{
			wrong--;
		}
		if(right<0)
		{
			right=0;
		}
		if(wrong<0)
		{
			wrong=0;
		}
	}
	
	
	table.put(id,studentAnswer);
	if(studentAnswer.equals(correctAnswer))
	{
		
		right++;
	}
	else
	{
		wrong++;
	}
	
	
}

public String getAnswer()
{
	return this.studentAnswer;
}

public String statistics()
{  
	return "Numbers of correct answers:"+right + "Numbers of wrong answers:"+wrong;
}

 }
