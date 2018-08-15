package Въпроси;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class RadioQuestion extends JPanel implements ActionListener{
	int correctAns;
	Quiz quiz;	
	int selected;
	boolean used;
	//въпроси
	JPanel qPanel=new JPanel();
	//отговори
	JPanel aPanel=new JPanel();
	JRadioButton[] responses;
	ButtonGroup group=new ButtonGroup();
	//бутончета
	JPanel botPanel=new JPanel();
	JButton next=new JButton("Напред");
	JButton finish=new JButton("Изход");
	

	public RadioQuestion(String q, String[] options, int ans, Quiz quiz){
		this.quiz=quiz;
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
		correctAns=ans;
		//Въпроси
		qPanel.add(new JLabel(q));
		add(qPanel);
		//Отговори
		responses=new JRadioButton[options.length];
		for(int i=0;i<options.length;i++){
			responses[i]=new JRadioButton(options[i]);
			responses[i].addActionListener(this);
			group.add(responses[i]);
			aPanel.add(responses[i]);
		}
		add(aPanel);
		next.addActionListener(this);
		finish.addActionListener(this);
		botPanel.add(next);
		botPanel.add(finish);
		add(botPanel);
	}
	
	public void actionPerformed(ActionEvent e){
		Object src=e.getSource();
		//следващия бутон
		if(src.equals(next)){
			showResult();
			if(selected==correctAns){
				used=true;
				quiz.next();
			}
		}
		//бутона за Край
		if(src.equals(finish)){
			quiz.showSummary();
		}
		//радио бутон
		for(int i=0;i<responses.length;i++){
			if(src==responses[i]){
				selected=i;
			}
		}
	}
	
	public void showResult(){
		String text=responses[selected].getText();
		quiz.total++;
		if(selected==correctAns){
			JOptionPane.showMessageDialog(null,text+" е Верен отговор!\nБраво :)");
		}else{
			quiz.wrongs++;
			JOptionPane.showMessageDialog(null,text+" е Грешен отговор!\nПробвай пак");
		}
	}
}