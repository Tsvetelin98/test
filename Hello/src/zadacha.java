

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;                //biblioteki

public class zadacha {
	public static void main(String[] args) throws Exception	
	{
		URL imageLocation = new URL(
				"http://horstmann.com/java4everyone/duke.gif");           //adres ot kydeto da vzeme kartinkata
		JOptionPane.showMessageDialog(null,"Hello","Programka",         //kakvo da izpisva i kakvo da e zaglavieto
				JOptionPane.PLAIN_MESSAGE,new ImageIcon(imageLocation));
	
		
		
	}
	
}
