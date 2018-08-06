package chapter10;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;

public class CartoonV1 extends JPanel
{
	
	GeneralPath mountain = new GeneralPath();
	GeneralPath vane = new GeneralPath();

	int number;
	float size;
	double [] limits = new double[] {0,7,4,-1};

	CartoonV1()
	{
		setPreferredSize(new Dimension(720,500));
		mountain.moveTo(0,-1);
		mountain.lineTo(0,0.7);
		mountain.lineTo(1.5,1.60);
		mountain.lineTo(1.8,1.3);
		mountain.lineTo(3,2.1);
		mountain.lineTo(4.7,0.7);
		mountain.lineTo(6.1,1.2);
		mountain.lineTo(9,0.8);
		mountain.lineTo(9,-1);
		mountain.closePath();
		vane.moveTo(0,0);
		vane.lineTo(0.5,0.1);
		vane.lineTo(1.5,0);
		vane.lineTo(0.5,-0.1);
		vane.closePath();
		new Timer(30,new ActionListener()
		{
			public void actionPerformed(ActionEvent evt)
			{
				number++;
				repaint();
			}	}).start();
		
	}

	protected void paintComponent(Graphics g)
	{
		Graphics2D g2D = (Graphics2D)g;
		g2D.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		control_limits(g2D, getWidth(), getHeight(), limits);
		g2D.setColor( new Color(154,243,252) );
		g2D.fillRect(0,0,7,4);
		g2D.setColor( new Color(51,204,51) );
		g2D.fill(mountain);
		g2D.setColor(new Color(119,119,165));

		g2D.fill(new Rectangle2D.Double(0,-0.4,7,0.8));
		g2D.setStroke( new BasicStroke(0.1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
				0,new float[] { 0.2F, 0.2F }, 1) );

		g2D.setColor(Color.WHITE);
		g2D.drawLine(0,0,7,0);
		g2D.setStroke( new BasicStroke(size));
		AffineTransform transform = g2D.getTransform();
		g2D.translate(5,3.3);
		paint_sun(g2D);
		g2D.setTransform(transform);
		g2D.translate(10 *(number % 300) / 300.0, 0);
		g2D.scale(0.3,0.3);
		g2D.setTransform(transform);
		g2D.translate(0.9,1);
		g2D.scale(0.6,0.6);
		g2D.setTransform(transform);
		g2D.translate(2.3,1.5);
		g2D.scale(0.4,0.4);	
		g2D.setTransform(transform);
		g2D.translate(4.0,0.8);
		g2D.scale(0.7,0.7);
		

	}

	void control_limits(Graphics2D g2D, int width, int height, double [] limits)
	{
		double pixel_width = Math.abs(( limits[1] - limits[0] ) / width);
		double pixel_height = Math.abs(( limits[3] - limits[2] ) / height);
		size = (float) Math.min(pixel_width,pixel_height);
		g2D.scale( width / (limits[1]-limits[0]), height / (limits[3]-limits[2]) );
		g2D.translate( -limits[0], -limits[2] );
	}

	void paint_sun(Graphics2D g2D)
	{
		g2D.setColor(Color.YELLOW);
		for (int i = 1; i <=100; i++)
		{
			g2D.rotate( 2*Math.PI / 20 );                             //лъчи на слънцето
			g2D.draw( new Line2D.Double(0,0,0.75,0) );
		}
		g2D.fill( new Ellipse2D.Double(-0.5,-0.5,1,1) );         //размери на слънцето
	}


	

	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		window.setContentPane(new CartoonV1());
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}