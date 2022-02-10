package feb10_22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chat_Window extends Frame  implements ActionListener{

	JTextField user1,user2,console;
	JButton send1,send2;
	Chat_Window(){
		JFrame frame=new JFrame("KATTAPANA LE PRO--THE ULTIMATE CHAT UPGRADER VERSION 2.0");
		frame.setSize(700,500);
		JPanel panel=new JPanel();
		panel.setLayout(null);
		
		
		user1=new JTextField();
		user1.setBounds(10,20,200,45);
		panel.add(user1);
		
		user2=new JTextField();
		user2.setBounds(10,80,200,45);
		panel.add(user2);
		
		send1=new JButton("SEND(1)");
		send1.setBounds(250,20,80,45);
		panel.add(send1);
		
		send2=new JButton("SEND(2)");
		send2.setBounds(250,80,80,45);
		panel.add(send2);
		
		frame.setVisible(true);
		frame.setContentPane(panel);
		
		console=new JTextField();
		console.setBounds(10,200,665,250);
		panel.add(console);
	}

	
	public void actionPerformed(ActionEvent e) {
		JButton p=(JButton)e.getSource();
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Chat_Window();
	}

}
