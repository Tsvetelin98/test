package Landscape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

public class Drop{
	
	double xDrop;
	double yDrop;
	double wDrop;
	double hDrop;

	
	public Drop(double xDrop, double yDrop, double wDrop, double hDrop)
	{
		this.xDrop = xDrop;
		this.yDrop = yDrop;
		this.wDrop = wDrop;
		this.hDrop = hDrop;
		
	}
	
	public void paintDrop(Graphics g, Cloud cloud)
	{
		Graphics2D g2D = (Graphics2D)g;
		g2D.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2D.setColor(Color.blue);	
		g2D.fill( new Ellipse2D.Double(xDrop, yDrop, wDrop, hDrop) );
	}
	
}
