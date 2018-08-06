package Landscape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class Rain {

	int numberDrops;
	
	public Rain(int numberDrops)
	{
		this.numberDrops = numberDrops;
		
	}
	
	public void paintComponent(Graphics g, Cloud cloud)
	{
		Thread t;
		
		for(int i=1; i<=100; i++)
		{
			Graphics2D g2D = (Graphics2D)g;
			g2D.setRenderingHint( RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			
			double randomX = ThreadLocalRandom.current().nextDouble(cloud.xCloud, cloud.xCloud+cloud.wCloud);
			double randomYBegin = ThreadLocalRandom.current().nextDouble( -1, 2.8);
			Drop drop = new Drop(randomX,-randomYBegin,0.01,0.1);
			drop.paintDrop(g2D, cloud);
			
			
			
			System.out.println(randomYBegin);
		
			changeRain(randomX, randomYBegin);
		}
	}

	
	public void changeRain(double curX,double curY)
	{
			double randomYEnd = ThreadLocalRandom.current().nextDouble(2.3,3);
			
			while(curY  > -randomYEnd)             //11:36   6.8.2018
			{
				curY-=0.1;
//				repaint();
				//drop.paintDrop(g2D, cloud);
				
				
				/*try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}*/

			}
			
		}
		
		
	}

