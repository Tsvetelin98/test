package chapter10;

import javax.swing.*;
import java.awt.*;
							
public class Proba extends JFrame{
public Proba() {
	super("Neshto");
	setLookAndFeel();
	setSize(750,200);
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
	
	
	JLabel pageLabel=new JLabel("                Addres:"   ,JLabel.RIGHT);
	JTextField pageAddress=new JTextField(20);
	FlowLayout floo=new FlowLayout();
	setLayout(floo);
	add(pageLabel);
	add(pageAddress);
	
	
	
	
	JComboBox profession=new JComboBox();
	FlowLayout flooo=new FlowLayout();
	profession.addItem("Yes");
	profession.addItem("No");
	profession.addItem("Almost");
	setLayout(flooo);
	add(profession);
}



private void setLookAndFeel() {
	try {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	}
	catch (Exception exc) {}}
	
public static void main (String[] arguments) {
	Proba frame=new Proba();
}
}


