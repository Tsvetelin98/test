package second;

import java.util.Scanner;
public class QuestionDemo1 {
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);

		Question q =new Question();
		q.setText("Кой направи програмата?");
		q.setAnswer("Tsvetelin");
		q.setAnswer("ceco");

		q.display();
		System.out.print("Твоят отговор:");
		String response=in.nextLine();
		System.out.println(q.checkAnswer(response));;



	}
}
