package chapter10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;


public class CvetniButoni  extends JFrame {
	  protected static final Object Image = "file:///home/eniware/Desktop/0.png";
	JButton red,green,blue,yellow,Eniware;

	public CvetniButoni() {
		super("ЦъкЦък");
		setSize(500,322);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo=new FlowLayout();
		setLayout(flo);
		red =new JButton("Червено");
		add(red);
		green=new JButton("Зелено");
		add(green);
		blue=new JButton("Синьо");
		add(blue);
		yellow=new JButton("Жълто");
		add(yellow);
		Eniware=new JButton("Eniware");
		add(Eniware);

		ActionListener act=new ActionListener() {
			public void actionPerformed(ActionEvent event) 
			{
				if (event.getSource() == red) {
					getContentPane().setBackground(Color.RED);
				}
				if (event.getSource() == green) {
					getContentPane().setBackground(Color.GREEN);
				}	
				if(event.getSource() == blue) {
					getContentPane().setBackground(Color.BLUE);
				}
				if (event.getSource() == yellow) {
					getContentPane().setBackground(Color.YELLOW);
				}
				if (event.getSource() == Eniware){
					
					URL imageLocation = null;
					try {
						imageLocation = new URL("file:///home/eniware/Desktop/0.png");							
					} catch (MalformedURLException e) {}           
					JOptionPane.showMessageDialog(null,"","Programka",         
							JOptionPane.PLAIN_MESSAGE,new ImageIcon(imageLocation));

					
					
				}

			}};
			red.addActionListener(act);
			green.addActionListener(act);
			blue.addActionListener(act);
			yellow.addActionListener(act);
			Eniware.addActionListener(act);
			setVisible(true);
			
			
			
			
		/*	GridLayout grid = new GridLayout(10,10);
			setLayout(grid);*/
			
	}

	
	
	
	public static void main (String[] arguments) throws Exception	 {
		new CvetniButoni();


		/*
		 JFrame frame = new JFrame("Програмка");
	        JLabel label = new JLabel("Работи!");
	        label.setVisible(false);
	        JPanel panel = new JPanel();
	        panel.add(label);

	        JButton btn = new JButton("Цък");
	    btn.addActionListener(e -> {
	        if (!label.isVisible()) {
	            label.setVisible(true);
	        }
	    });
	        panel.add(btn);
	        frame.add(panel);
	        frame.setSize(new Dimension(200, 100));

	        frame.setVisible(true);
		 */


	}}
