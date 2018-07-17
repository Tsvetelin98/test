import java.util.Scanner;                 //biblioteka za skanirane 


public class vuvejdave_v2 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);             
		System.out.print("vuvedi R1:");
		int A=in.nextInt();

		Scanner im=new Scanner(System.in);             
		System.out.print("vuvedi R2:");
		int B=in.nextInt();

		Scanner id=new Scanner(System.in);             
		System.out.print("vuvedi R3:");
		int C=in.nextInt();

     
	    double Q=(B+C)/2;
	    double sbor=A+Q;
		
		System.out.print("Sbora e=");
		System.out.print(sbor);
}
}