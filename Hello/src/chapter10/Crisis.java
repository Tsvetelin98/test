package chapter10;

import java.awt.*;
import javax.swing.*;

public class Crisis extends JFrame{
	/*JButton panicButton;
	JButton dontPanicButton;
	JButton blameButton;
	JButton mediaButton;
	JButton saveButton;*/

	public Crisis() {
		super ("Crisis");
		setLookAndFeel();
		setSize(348,128);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		JButton	panicButton = new JButton("Panic");
		JButton	dontPanicButton = new JButton("Dont Panic");
		JButton	blameButton = new JButton("Blame Others");
		JButton	mediaButton = new JButton("Notify the Media");
		JButton	saveButton = new JButton("Save Yourself");
		add(panicButton);
		add(dontPanicButton);
		add(blameButton);
		add(mediaButton);
		add(saveButton);
		setVisible(true);
		
	}

	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");	
		}
		catch (Exception exc) {}
	}
	public static void main(String[] arguments) {
		Crisis frame = new Crisis();
			
	}
}
