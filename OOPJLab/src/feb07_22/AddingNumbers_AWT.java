package feb07_22;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

 class AddingNumbers_AWT extends Frame implements ActionListener {
	 JButton add,sub;
	 JTextField num1,num2,result;
	 AddingNumbers_AWT(){
		 JFrame f= new JFrame("Adding Or Subtracting Two Numbers");
		 JPanel p=new JPanel();
		 p.setLayout(new GridLayout(4,2));
		 JLabel l1=new JLabel("Number 1: ");
		 num1=new JTextField();
		 JLabel l2=new JLabel("Number 2: ");
		 num2=new JTextField();
		 JLabel l3=new JLabel("Result");
		 result=new JTextField();
		 add=new JButton("ADD");
		 sub=new JButton("SUB");
		 p.add(l1);
		 p.add(num1);
		 p.add(l2);
		 p.add(num2);
		 p.add(add);
		 p.add(sub);
		 p.add(l3);
		 p.add(result);
		 f.setLayout(null);
		 f.setVisible(true);
		 f.setSize(400,600);
		 f.setContentPane(p);
		 add.addActionListener(this);
		 sub.addActionListener(this);
	 }
	
	public void actionPerformed(ActionEvent e) {
		int c = 0;
		String s1= num1.getText();
		String s2=num2.getText();
		int a= Integer.parseInt(s1);
		int b= Integer.parseInt(s2);
		if(e.getSource()==add)
		{
			c=a+b;
		}
		if(e.getSource()==sub) {
			c=a-b;
		}
		String rs= String.valueOf(c);
		result.setText(rs);
	}


 public static void main(String[] args) {
	 new AddingNumbers_AWT();
 }
 }
		
		
		

	
	