import java.util.Scanner;
public class golqmoChislo {
	public static void main(String[] args)
	{
    final int LENGTH=100;
    double[] values=new double[LENGTH];
    int currentSize=0;
    
    System.out.println("въведи стойност:");
    Scanner in=new Scanner(System.in);
    while (in.hasNextDouble()&&currentSize<values.length)
    {
    	values[currentSize]=in.nextDouble();
    	currentSize++;
    	
    }
	// търси най-голямата стойност 	
    
    double largest=values[0];
    for (int i=1;i<currentSize;i++)
    {
    	if (values[i]>largest)
    	{
    		largest=values[i];
    	}
    }
		// изписва всички стойности и намира най-голямата 
    
    for (int i=0;i<currentSize;i++)
    {
    	System.out.print(values[i]);
    	if (values[i] == largest)
    	{
    	System.out.print("<<най-голяма стойност");
    }
    System.out.println();
	}}}
