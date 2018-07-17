import java.util.Scanner;

public class temperatura {
	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);             
		System.out.print("kakva e temperaturata na vodata?:");
		int voda=in.nextInt();
		
		if (voda<0)
		{
			System.out.println("Led");
		}
		else
		{
			if (voda>100)
			{
				System.out.println("Para");
			}
			else
			{
				System.out.println("Technost");
			}
		}
		
	}

}
