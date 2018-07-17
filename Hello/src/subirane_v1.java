

import javax.swing.JOptionPane; 

public class subirane_v1 {
	public static void main(String[] args) throws Exception	
	{
	

	
String firstNumber, 
         secondNumber; 

int number1,     
    number2,   
    sum;             

firstNumber =
JOptionPane.showInputDialog (null, "Въведи първото число " , "Събиране",JOptionPane.PLAIN_MESSAGE);
        	

secondNumber =
JOptionPane.showInputDialog (null, "Въведи второто число " , "Събиране",JOptionPane.PLAIN_MESSAGE);


number1 = Integer.parseInt ( firstNumber);
number2 = Integer.parseInt ( secondNumber);


sum = number1 + number2;


JOptionPane.showMessageDialog (null, "Сбора е " + sum, "Резултат",JOptionPane.PLAIN_MESSAGE);

System.exit ( 0 ); 
}}





