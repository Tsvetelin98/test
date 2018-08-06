package Landscape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

public class Cloud {

	double xCloud;
	double yCloud;
	double hCloud;
	double wCloud;
	
	public Cloud(double xCloud, double yCloud, double wCloud, double hCloud)
	{
		this.xCloud = xCloud;
		this.yCloud = yCloud;
		this.hCloud = hCloud;
		this.wCloud = wCloud;
		
	}
	
	public void paintCloud(Graphics g)
	{
		Graphics2D g2D = (Graphics2D)g;
		g2D.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2D.setColor(Color.BLUE);	
		g2D.fill( new Ellipse2D.Double(xCloud,yCloud,wCloud,hCloud));  
	}
	
/*public void startRaining(Graphics g)
	{
		Graphics2D g2D = (Graphics2D)g;
		g2D.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		
		rain.paintRain(g2D);
	}*/
}
