
public class Logic {
	public static void main(String args[]){
		
		
		double x=1;
		double y=1;
		int i=0;
		
		do
		{
			y=y/2;         // >>>>0.5>>>0.25>>>>0.125
			x=x+y;         // >>>>1.5>>>1.75>>>>1.875
			i++;
		}
		while (x<1.8);                         //  MAX 1.8
		System.out.print(i);                
	}}
	