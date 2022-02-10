package feb07_22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WordCounter extends Frame implements ActionListener{
	 JButton COUNT;
	 JTextField tf1;
	 JLabel words,characters;
	 WordCounter(){
		 
		 JFrame frame= new JFrame("WORD COUNTER");
		 frame.setSize(400,400);
		 
		 JPanel panel=new JPanel();
		 panel.setLayout(null);
		 
		 tf1=new JTextField("");
		 tf1.setBounds(40,100,300,80);
		 panel.add(tf1);
		 
		 COUNT=new JButton("COUNT");
		 COUNT.setBounds(140,200,100,50);
		 panel.add(COUNT);
		 COUNT.addActionListener(this);
		 words=new JLabel(" ");
		 characters = new JLabel(" ");
		 words.setBounds(40,40,300,90);
		 characters.setBounds(213,40,300,90);
		 panel.add(words);
		 panel.add(characters);
		 
		 frame.setVisible(true);
		 frame.setContentPane(panel); 
		 
		 
	 }

	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==COUNT) {
			String str;
			str=tf1.getText();
			int count=1;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==' ')
				{
					count++;
				}
				int j=str.length()-count+1;
				characters.setText("CHARACTER COUNT :"+j);
				words.setText("WORD COUNT :"+count);
			}
			
			
			
		}
		
	}


public static void main(String[] args) {
	new WordCounter();
}
}


