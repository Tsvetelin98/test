package second;

import javax.swing.JOptionPane; 

public class sum {
	public static void main(String[] args) throws Exception	
	{
		int number1,number2, sum;  

		String firstNumber,secondNumber,chose;
		chose=JOptionPane.showInputDialog (null, "Избери действие (+ - * /) " , "Избери ",JOptionPane.PLAIN_MESSAGE);

		switch(chose.charAt(0))	
		{
		case '+':
			firstNumber =
			JOptionPane.showInputDialog (null, "Въведи първото число " , "Събиране",JOptionPane.PLAIN_MESSAGE);

			secondNumber =
					JOptionPane.showInputDialog (null, "Въведи второто число " , "Събиране",JOptionPane.PLAIN_MESSAGE);

			number1 = Integer.parseInt ( firstNumber);
			number2 = Integer.parseInt ( secondNumber);

			sum = number1 + number2;

			JOptionPane.showMessageDialog (null, "Резултата е " + sum, "Резултат",JOptionPane.PLAIN_MESSAGE);
			break;        

		case '-':
			firstNumber =
			JOptionPane.showInputDialog (null, "Въведи първото число " , "Изваждане",JOptionPane.PLAIN_MESSAGE);


			secondNumber =
					JOptionPane.showInputDialog (null, "Въведи второто число " , "Изваждане",JOptionPane.PLAIN_MESSAGE);

			number1 = Integer.parseInt ( firstNumber);
			number2 = Integer.parseInt ( secondNumber);
			sum = number1 - number2;

			JOptionPane.showMessageDialog (null, "Резултата е " + sum, "Резултат",JOptionPane.PLAIN_MESSAGE);
			break;
		case '*':
			firstNumber =
			JOptionPane.showInputDialog (null, "Въведи първото число " , "Умножение",JOptionPane.PLAIN_MESSAGE);


			secondNumber =
					JOptionPane.showInputDialog (null, "Въведи второто число " , "Умножение",JOptionPane.PLAIN_MESSAGE);

			number1 = Integer.parseInt ( firstNumber);
			number2 = Integer.parseInt ( secondNumber);

			sum = number1 * number2;

			JOptionPane.showMessageDialog (null, "Резултата е " + sum, "Резултат",JOptionPane.PLAIN_MESSAGE);
			break;
		case '/':
			firstNumber =
			JOptionPane.showInputDialog (null, "Въведи първото число " , "Деление",JOptionPane.PLAIN_MESSAGE);


			secondNumber =
					JOptionPane.showInputDialog (null, "Въведи второто число " , "Деление",JOptionPane.PLAIN_MESSAGE);

			number1 = Integer.parseInt ( firstNumber);
			number2 = Integer.parseInt ( secondNumber);

			sum = number1 / number2;   

			JOptionPane.showMessageDialog (null, "Резултата е " + sum, "Резултат",JOptionPane.PLAIN_MESSAGE);
			break;
		default:
			System.out.printf("Грешка!");    
		}}}

