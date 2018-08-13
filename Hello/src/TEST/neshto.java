package TEST;


import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class neshto {

	public static void main( String [] args ) {
		JFrame frame = new JFrame();
		frame.setSize(800, 300);
		final RPanel rPanel=new RPanel();
		frame.add(rPanel);
		frame.setVisible( true );
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				rPanel.stop();
				System.exit(0);

			}
		});
	}
}

class RPanel extends JPanel {
	//*********SETTINGS****************************
	private float mWind = 2.05f;                                 //отклонение (вятър) колко силен да е вятъра
	private float mGravity = 9.8f;                               
	private double mRainChance = 0.99; // from 0 to 1

	private int mRepaintTimeMS = 16;                            //колко бързо да вали
	private float mRainWidth=3;                                 //големина на капката
	private Color mColor=new Color(0, 0, 255);
	//*********************************************

	private ArrayList<Rain> rainV;
	private ArrayList<Drop> dropV;
	private UpdateThread mUpdateThread;

	public RPanel() {
		rainV = new ArrayList<>();
		dropV = new ArrayList<>();

		mUpdateThread=new UpdateThread();
		mUpdateThread.start();
	}

	public void stop() {
		mUpdateThread.stopped=true;
	}

	private class UpdateThread extends Thread {
		public volatile boolean stopped=false;
		@Override
		public void run() {
			while (!stopped) {
				RPanel.this.repaint();
				try {
					Thread.sleep(mRepaintTimeMS);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(mRainWidth));
		g2.setColor(mColor);

		//DRAW DROPS
		Iterator<Drop> iterator2 = dropV.iterator();
		while (iterator2.hasNext()) {
			Drop drop = iterator2.next();



			if (drop.y >= getHeight()) {
				iterator2.remove();
			}
		}

		//DRAW RAIN
		Iterator<Rain> iterator = rainV.iterator();
		while (iterator.hasNext()) {
			Rain rain = iterator.next();
			rain.update();
			rain.draw(g2);

			if (rain.y >= getHeight()) {
				long dropCount = 1 + Math.round(Math.random() * 4);
				for (int i = 0; i < dropCount; i++) {
					dropV.add(new Drop(rain.x, getHeight()));
				}
				iterator.remove();

			}
		}

		//CREATE NEW RAIN
		if (Math.random() < mRainChance) {
			rainV.add(new Rain());
		} 
	}

	//*****************************************
	class Rain {
		float x;
		float y;
		float prevX;
		float prevY;

		public Rain() {
			Random r = new Random();
			x = r.nextInt(getWidth());
			y = 0;
		}

		public void update() {
			prevX = x;
			prevY = y;

			x += mWind;                                  //вятър
			y += mGravity;
		}

		public void draw(Graphics2D g2) {
			Line2D line = new Line2D.Double(x, y, prevX, prevY);
			g2.draw(line);
		}
	}

	//*****************************************
	private class Drop {

		double x;
		double y;

		public Drop(double x0, double y0) {
			super();

		}}}
