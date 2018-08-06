package chapter10;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class programkaV2 {
	public static void main(String[] args)
	{
		JFrame frame=new JFrame();

		JButton button=new JButton("Click");
		JLabel label=new JLabel("Hello");

		JPanel panel=new JPanel();
		panel.add(button);
		panel.add(label);
		frame.add(panel);


		final int FRAME_WIDTH=300;
		final int FRAME_HEIGHT=100;
		frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		frame.setTitle("Programka");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}}
