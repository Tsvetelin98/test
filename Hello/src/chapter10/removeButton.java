package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.applet.Applet;

public class removeButton extends JFrame
implements ActionListener
{
	JPanel north;
	int i;

	public removeButton()
	{
		super("ЦъкЦък");
		setSize(500,322);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		north = new JPanel();

		for (int i = 1; i < 5; i++)
		{
			JButton button = new JButton(" Отговор " + i);
			button.addActionListener(this);
			north.add(button);
		}

		getContentPane().add(north, BorderLayout.NORTH);
	}

	public void actionPerformed(ActionEvent e)
	{
		Component c = (Component)e.getSource();
		c.setVisible(false);
		((JPanel)c.getParent()).revalidate();
	}






/*	JButton next,exit,otgovor1,otgovor2;


	public Razgovor() {
		super("ЦъкЦък");
		setSize(500,322);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo=new FlowLayout();
		setLayout(flo);
		next =new JButton("Напред");
		add(next);
		exit=new JButton("Затвори");
		add(exit);



		ActionListener act=new ActionListener() {
			public void actionPerformed(ActionEvent event) 
			{



				if (event.getSource() == next) {
					setSize(500,322);
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					FlowLayout flo=new FlowLayout();
					setLayout(flo);
					otgovor1 =new JButton("Отговор1");
					add(otgovor1);
					otgovor2=new JButton("Отговор2");
					add(otgovor2);

					next.setText("");
					exit.setText(""); 

				}
				if (event.getSource() == exit) {
					exit.addActionListener(e -> System.exit(0));
				}	
			}
		};
		next.addActionListener(act);
		exit.addActionListener(act);

		setVisible(true);
	}

 */
public static void main (String[] arguments) throws Exception	 {
	removeButton frame = new removeButton();
	frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
	frame.pack();
	frame.setLocationRelativeTo( null );
	frame.setVisible(true);
}}
