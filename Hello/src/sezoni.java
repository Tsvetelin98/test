import java.util.Scanner;

public class sezoni {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);             
		System.out.print("vuvedi sezon(1-12):");
		int month=in.nextInt();
		
		if (month<3)
		{
			System.out.println("sezona e Zima");
		}
		else
		{
			if (month<6)
			{
				System.out.println("sezona e Prolet");
			}
			else 
			{
				if (month<9)
				{
					System.out.println("sezona e Lqto");
				}
				else
				{
					if (month<12)
					{
						System.out.println("sezona e Esen");
					}
					else System.out.println("nqma takuv sezon :D");
					
				}
			}
		}
		
	}
}
