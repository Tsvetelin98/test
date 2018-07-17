import java.util.Scanner;  
public class razgovor {
    public static void main(String[] args) {
    	
    	
    	Scanner in=new Scanner(System.in);
    	System.out.print("Какво е твоето име?:");
    	String input=in.next();
    	System.out.println("Здравей," +input );
    	
    	System.out.print("На колко си години?:");
    	int y=in.nextInt();
    	
    	System.out.println("През следващата година ти ще си на " +(y+1) );
    	
    	System.out.print("а през кой месец си роден ?(1-12):");
		int month=in.nextInt();
		
		if (month<=3)
		{
			System.out.println("през Зимата ");
		}
		else
		{
			if (month<=6)
			{
				System.out.println("през Пролетта");
			}
			else 
			{
				if (month<=9)
				{
					System.out.println("през Лятото");
				}
				else
				{
					if (month<=12)
					{
						System.out.println("през Есента");
					}
					else System.out.println("няма такъв сезон!");
					  
					

				}}}
		
		System.out.println("Намисли си число  (отговарай  с ок)");
		String im=in.next();
		System.out.println("умножи го х2");
		String iа=in.next();
		System.out.println("прибави към него 12");
		String iб=in.next();
		System.out.println("раздели го на 2");
		String iв=in.next();
		System.out.println("премахни това което си си намислил");
		String iг=in.next();
		System.out.println("получава се 6 :) ");
		
		}}   

   
	
	
	


