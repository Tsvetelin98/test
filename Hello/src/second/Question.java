package second;

public class Question {
	private String text;
	private String answer;                   //suzdava vuprosa i otgovora

	public Question()
	{
		text="";
		answer="";                 
	}
	public void setText(String questionText)
	{
		text=questionText;
	}
	public void setAnswer(String correctResponse)
	{
		answer=correctResponse;
	}
	public boolean checkAnswer(String response)
	{
		return response.equals(answer);
	}
	public void display()
	{
		System.out.println(text);
	}}	
