
public class MultipleAnswer extends Question 
{

	 private String  answer;
	 private String  correct;
	 
	
	 public MultipleAnswer()
	 {
		 
     }
	 
	 public void printQuestionType()
	 {
		 System.out.println("please select multiple answers");
	 }
	 public void setStudentAnswer(String a,String b,String c)
		{
			
		  this.answer= a+""+b+""+c;
        }

	public String getStudentAnswer()
	{
		return this.answer;
		
	}
	public void setCorrectAnswer(String a,String b,String c)
	{
		
	  this.correct= a+""+b+""+c;
	}

	public String getCorrectAnswer()
	{
		return correct;
	}
	
}
