import java.util.Scanner;
public class sum {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.printf("n= ");
		int n=input.nextInt();
		int num=1;
		int sum=1;
		System.out.print("Сумата е 1");
		while (num<n)
		{
			num++;
			sum +=num;
			System.out.printf("+%d", num); 
		}
		System.out.printf("=%d%n",sum);
	
}}