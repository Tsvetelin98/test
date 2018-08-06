package chapter10;


import javax.swing.*;
import java.awt.*;
							
public class Playback extends JFrame{
public Playback() {
	super("Playback");
	setLookAndFeel();
	setSize(450,200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	FlowLayout flo=new FlowLayout();
	setLayout(flo);
	JButton play=new JButton("Play");
	JButton stop=new JButton("Stop");
	JButton pause=new JButton("Pause");
	add(play);
	add(stop);
	add(pause);
	setVisible(true);
}

private void setLookAndFeel() {
	try {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	}
	catch (Exception exc) {}}
	
public static void main (String[] arguments) {
	Playback frame=new Playback();
}
}


