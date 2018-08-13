package chapter10;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * A one operation calculator.
 * Only handles single digits for basic arithmetic.
 * Trig operations accept values in degrees.
 */

public class BasicCalculator extends JFrame {

	private JPanel panel;					
	private JTextField input;	
	private JButton butt0, butt1, butt2, butt3,
					butt4, butt5, butt6, butt7,
					butt8, butt9, buttSine, buttCosine,
					buttEquals, buttClear, buttAdd,
					buttSubtract, buttMultiply, buttDivide,
					buttTangent;
	private final int WINDOW_WIDTH = 360;	
	private final int WINDOW_HEIGHT = 300;

/*
 * Constructor calls the superclass's constructor and creates the window.
 */
	public BasicCalculator() {
		
		super("Calculate a Simple Expression");
		
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildPanel();
		
		add(panel);
		
		setVisible(true);
		
	}
	
/*
 * Method to put the input box and all the buttons onto the window.
 * 
 * I know, I know, I should've used an array for the buttons.
 */
	private void buildPanel() {
		
		input = new JTextField(16);
		
		buttEquals = new JButton("=");
		buttEquals.addActionListener(new Listener1());
		buttClear = new JButton("AC");
		buttClear.addActionListener(event -> input.setText(""));
		buttAdd = new JButton("+");
		buttAdd.addActionListener(event -> input.setText(input.getText() + " + "));
		buttSubtract = new JButton("-");
		buttSubtract.addActionListener(event -> input.setText(input.getText() + " - "));
		buttMultiply = new JButton("x");
		buttMultiply.addActionListener(event -> input.setText(input.getText() + " x "));
		buttDivide = new JButton("÷");
		buttDivide.addActionListener(event -> input.setText(input.getText() + " ÷ "));
		butt0 = new JButton("0");
		butt0.addActionListener(event -> input.setText(input.getText() + "0"));
		butt1 = new JButton("1");
		butt1.addActionListener(event -> input.setText(input.getText() + "1"));
		butt2 = new JButton("2");
		butt2.addActionListener(event -> input.setText(input.getText() + "2"));
		butt3 = new JButton("3");
		butt3.addActionListener(event -> input.setText(input.getText() + "3"));
		butt4 = new JButton("4");
		butt4.addActionListener(event -> input.setText(input.getText() + "4"));
		butt5 = new JButton("5");
		butt5.addActionListener(event -> input.setText(input.getText() + "5"));
		butt6 = new JButton("6");
		butt6.addActionListener(event -> input.setText(input.getText() + "6"));
		butt7 = new JButton("7");
		butt7.addActionListener(event -> input.setText(input.getText() + "7"));
		butt8 = new JButton("8");
		butt8.addActionListener(event -> input.setText(input.getText() + "8"));
		butt9 = new JButton("9");
		butt9.addActionListener(event -> input.setText(input.getText() + "9"));
		buttSine = new JButton("sin");
		buttSine.addActionListener(event -> input.setText(input.getText() + "sin"));
		buttCosine = new JButton("cos");
		buttCosine.addActionListener(event -> input.setText(input.getText() + "cos"));
		buttTangent = new JButton("tan");
		buttTangent.addActionListener(event -> input.setText(input.getText() + "tan"));
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 30));
	
		panel.add(input);
		
		panel.add(buttEquals);
		panel.add(buttClear);
		panel.add(buttAdd);
		panel.add(buttSubtract);
		panel.add(buttMultiply);
		panel.add(buttDivide);
		panel.add(butt0);
		panel.add(butt1);
		panel.add(butt2);
		panel.add(butt3);
		panel.add(butt4);
		panel.add(butt5);
		panel.add(butt6);
		panel.add(butt7);
		panel.add(butt8);
		panel.add(butt9);
		panel.add(buttSine);
		panel.add(buttCosine);
		panel.add(buttTangent);
		
	}
	
/*
 * Action listener for the "equals" button.
 * All the calculations are done here.
 */
	private class Listener1 implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			String str = input.getText();
			
			double num1, num2, radians, result;
			
			if (str.charAt(0) == 's' || str.charAt(0) == 'c' || str.charAt(0) == 't') 
			{
				radians = Math.toRadians(Double.parseDouble(str.substring(3)));
				
				switch (str.charAt(0)) {
				
					case 's':
						result = Math.sin(radians);
						break;
					case 'c':
						result = Math.cos(radians);
						break;
					case 't':
						result = Math.tan(radians);
						break;
					default:
						result = 0;	
				}
			}	
			else 
			{
				num1 = Double.parseDouble(str.substring(0, 1));
				num2 = Double.parseDouble(str.substring(4, 5));
				
				switch (str.charAt(2)) {
				
					case '+':
						result = num1 + num2;
						break;
					case '-':
						result = num1 - num2;
						break;
					case 'x':
						result = num1 * num2;
						break;
					case '÷':
						result = num1 / num2;
						break;
					default:
						result = 0;
				}
			}

			input.setText(Double.toString(result));	
		}
	}
/*
 * main method
 */
	public static void main(String[] args) {
		
		new BasicCalculator();
	}
	

}