package Въпроси;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.util.Random;
import javax.swing.JOptionPane;

public class Quiz extends JFrame{
	JPanel p=new JPanel();
	CardLayout cards=new CardLayout();
	int numQs;
	int wrongs=0;
	int total=0;
	
	String[][] answers={
		{"Николай","Цветелин","Пламен","Маргарита"},
		{"Audi","Golf","Mercedes","Volvo"},
		{"Хелзинки","Осло","Белгад"},
		{"8","10","7","9"},
		{"6","8"},
		{"4","5","6","7"},
		{"Зелен","Син","Жълт","Розов"},
	};
	
	RadioQuestion vuprosi[]={
		
		new RadioQuestion(
			"Кой направи тази програма?",
			answers[0],
			1,this
		),
		new RadioQuestion(
			"Каква марка кола кара Марио?",
			answers[1],
			3,this
		),
		new RadioQuestion(
			"Столицата на Финландия е ?",
			answers[2],
			0,this
		),
		new RadioQuestion(
			"Колко помещения има тук?",
			answers[3],
			1,this
		),
		new RadioQuestion(
			"2+2*2=?",
			answers[4],
			0,this
		),
		new RadioQuestion(
			"Колко струни има стандартната китара?",
			answers[5],
			2,this
		),
		new RadioQuestion(
			"В какъв цвят е логото на Eniware?",
			answers[6],
			1,this
		)
	};

	public static void main(String args[]){
		new Quiz();
	}
	
	public Quiz(){
		super("Цък Цък");
		setResizable(true);
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		p.setLayout(cards);
		numQs=vuprosi.length;
		for(int i=0;i<numQs;i++){
			p.add(vuprosi[i],"q"+i);
		}
		Random r=new Random();
		int i=r.nextInt(numQs);
		cards.show(p,"q"+i);
		add(p);
		setVisible(true);
	}
	
	public void next(){
		if((total-wrongs)==numQs){
			showSummary();
		}else{
			Random r=new Random();
			boolean found=false;
			int i=0;
			while(!found){
				i=r.nextInt(numQs);
				if(!vuprosi[i].used){
					found=true;
				}
			}
			cards.show(p,"q"+i);   
		}
	}
	
	public void showSummary(){
		JOptionPane.showMessageDialog(null,"Поздравления :), резултатите са"+
			"\nГрешни отговори: \t"+wrongs+
			"\nВерни отговори: \t"+(total-wrongs)+
			"\nПроцент Верни: \t\t"+(int)(((total-wrongs)/total)*100.0)+"%"
		);
		System.exit(0);
	}
}