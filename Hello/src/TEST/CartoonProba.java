package TEST;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;
import java.awt.event.*;
import java.util.concurrent.ThreadLocalRandom; 	

public class CartoonProba extends JPanel
{

	GeneralPath mountain = new GeneralPath();
	GeneralPath vane = new GeneralPath();

	int number;
	float size;
	double [] limits = new double[] {0,7,4,-1};

	CartoonProba()
	{
		setPreferredSize(new Dimension(720,500));

	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2D = (Graphics2D)g;
		g2D.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		control_limits(g2D, getWidth(), getHeight(), limits);
		g2D.setColor( new Color(154,243,252) );
		g2D.fillRect(0,0,7,4);                                           //фон
		g2D.setColor(new Color(0,255,0));                            //Цвят на поляната

		g2D.fill(new Rectangle2D.Double(0,-1,7,1));
		g2D.setStroke( new BasicStroke(0.1F, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
				0,new float[] { 0.2F, 0.2F }, 1) );					//Рисува поляна

		g2D.translate(2.5,2.3);                                            //Къде се намира облака

		Cloud cloud = new Cloud(0.5,1,2,0.5);
		cloud.paintCloud(g2D);
		g2D.setColor(Color.red);
		g2D.fill( new Ellipse2D.Double(0,0,0.01,0.1) );
		
		
		/*Cloud cloud2 = new Cloud(-1.5,1,2,0.5);
		cloud2.paintCloud(g2D);
		g2D.setColor(Color.red);
		g2D.fill( new Ellipse2D.Double(0,0,0.01,0.1) );*/
		
		Rain rain = new Rain(10);
		rain.paintComponent(g2D, cloud);
		
		/*double randomX = ThreadLocalRandom.current().nextDouble(cloud.xCloud, cloud.xCloud+cloud.wCloud);
		System.out.println(randomX);
		Drop drop = new Drop(randomX,-3,0.01,0.1);
		drop.paintDrop(g2D, cloud);
		*/
	
	}
	
	void control_limits(Graphics2D g2D, int width, int height, double [] limits)
	{
		double pixel_width = Math.abs(( limits[1] - limits[0] ) / width);
		double pixel_height = Math.abs(( limits[3] - limits[2] ) / height);
		size = (float) Math.min(pixel_width,pixel_height);
		g2D.scale( width / (limits[1]-limits[0]), height / (limits[3]-limits[2]) );
		g2D.translate( -limits[0], -limits[2] );
	}


	public static void main(String[] args)
	{
		JFrame window = new JFrame();
		window.setContentPane(new CartoonProba());
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);

	}
}
