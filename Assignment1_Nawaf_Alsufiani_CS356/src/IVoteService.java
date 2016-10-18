import java.util.Hashtable;

public class IVoteService
{
private Person  students;
private Hashtable<Integer,String> table = new Hashtable<>();
private String answer;
private int id;
private String correctAnswer = "";
private int right=0;
private int wrong=0;

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


public void submit(int id,String answer)
{
	this.id=id;
	this.answer=answer;
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
	
	table.put(this.id,this.answer);
	
	if(answer.equals(correctAnswer))
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
	return answer;
}

public String statistics()
{  
	return "Numbers of correct answers:"+right + "Numbers of wrong answers:"+wrong;
}

}
