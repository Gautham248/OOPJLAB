package feb07_22;
import javax.swing.*;
import java.awt.event.*;
public class ActionEventDemo_UsingSwing {
	public static void main(String[] args) {
		JFrame f=new JFrame("My Frame Title");  
		JPanel p=new JPanel();
 JTextField tf=new JTextField();  
	    tf.setBounds(50,50, 150,20);  
	    JButton b=new JButton("My Press Me Button");  
	    b.setBounds(50,100,200,30);  
	    b.addActionListener(new ActionListener(){  
	public void actionPerformed(ActionEvent e) {
		tf.setText("Please practice java!!.");  
		f.setTitle("Hello");
	}  
	    });  
	    f.add(b);f.add(tf);  
	   // f.setContentPane(b);
	    f.setSize(400,400);  
	//    f.setLayout(null);  
	    f.setVisible(true);   

	}

}
