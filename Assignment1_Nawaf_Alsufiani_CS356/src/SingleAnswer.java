/*
 * Author Nawaf Alsufiani
 * class SingleAnswer extends information from class Question
 * 
 */


public class SingleAnswer extends Question 
{
  
	 private String  answer="";
	 private String  correct;
	
	 public SingleAnswer(String qestion,String correct)
	 {
		 super.setQuestion(qestion);
		 this.correct=correct;
      }
	 
	 public void printQuestionType()
	 {
		 System.out.println("please select Single answer: please enter 'a' 'b' or 'c' and press enter");
	 }
	 
	 public void setStudentAnswer(String answer)
	{
		this.answer=answer;
    }

	 
	public String getStudentAnswer()
	{
		return this.answer;
		
	}
	public void setCorrectAnswer(String correct)
	{
	  this.correct= correct;	
	}

	public String getCorrectAnswer()
	{
		return correct;
	}
	
	


}
