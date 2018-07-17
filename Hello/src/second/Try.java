package second;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;
public class Try {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		
		boolean done=false;
		while (!done)
		{
			try
			{
				System.out.print("Въведи име на файла:");
				String filename=in.next();
				double[] data = readFile(filename);
				double sum=0;
				for (double d:data) {sum=sum+d;}
				System.out.println("Сумата е:"+sum);
				
				done=true;
			}
			catch(FileNotFoundException exception)
			{
				System.out.println("не е намерен");
			}
			catch (NoSuchElementException exception)
			{
				System.out.println("FIle content Invalid.");
			}
			catch (IOException exception)
			{
				exception.printStackTrace();
			}
		}
	}
	public static double[] readFile(String filename) throws IOException
	{
		File inFile=new File(filename);
		Scanner in=new Scanner(inFile);
		try
		{
			return readData(in);
		}
		finally
		{
			in.close();
		}}
	public static double[] readData(Scanner in) throws IOException
	{
		int numberOfValues=in.nextInt();
		double[]data=new double[numberOfValues];
		for(int i=0;i<numberOfValues;i++)
		{
			data[i]=in.nextDouble();
		}
		if (in.hasNext())
		{
			throw new IOException("End of file expected");
		}
		return data;
	}
}


