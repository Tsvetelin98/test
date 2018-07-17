import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;



public class chess {
	public static void draw(Graphics g)
	{
		final int width=20;
		g.setColor(Color.black);
		int x=0;
		int y=0;
		for (int i=0;i<10;i++)
		{
			g.fillRect(x, y, width, width);
			x=x+2*width;
		}
		x=width;
		y=width;
		for (int i=0;i<10;i++)
		{
			g.fillRect(x, y, width, width);
			x=x+2*width;
		}
		for (int i=0;i<10;i++)
		{
			g.fillRect(x, y, width, width);
			x=x+2*width;
		}
	}
	public static void main(String[] args)
	{
	JFrame frame=new JFrame();
	final int FRAME_WIDTH=400;
	final int FRAME_HEIGHT=400;
	
	frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	JComponent component=new JComponent()
	{ 
		public void paintComponent(Graphics graph)
			{
		draw(graph);
			}
	};
	frame.add(component);
	frame.setVisible(true);
	}
	
	
	}