/*
 * Author Nawaf Alsufiani
 * class MultipleAnswer extends information from class Question
 * it gives information about how to deal with multiple choices
 */


public class MultipleAnswer extends Question 
{

	 private String  answer;
	 private String  correct;
	 
	
	 public MultipleAnswer(String question,String a,String b,String c)
	 {
		 super.setQuestion(question);
		 
		 this.correct= a+""+b+""+c;//using 3 multiple choices
     }
	 
	 public void printQuestionType()
	 {
		 System.out.println("please select multiple answers");
	 }
	 public void setStudentAnswer(String a,String b,String c)
		{
			
		  this.answer= a+""+b+""+c;//using 3 multiple choices
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
