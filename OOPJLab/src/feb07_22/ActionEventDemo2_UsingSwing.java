package feb07_22;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class ActionEventDemo2_UsingSwing {
	public static void main(String[] args) {
		JFrame f=new JFrame("My Frame Title");
		JPanel p=new JPanel();
		JButton b= new JButton("My Press Button");
		b.setBounds(50,100,200,30);  
		p.add(b);
		f.setContentPane(p);
		f.setSize(700,400);
		f.setVisible(true);
		JLabel jl=new JLabel("My Label : ");
		f.add(jl);
		
		JTextField tf=new JTextField("                                            ");  
		 tf.setBounds(50,50, 150,100); 
		    f.add(tf);
		    b.addActionListener(new ActionListener(){  
		    	public void actionPerformed(ActionEvent e) {
		    		tf.setText("Please practice java!!.");  
		    		f.setTitle("Hello");
		    	}  
		    	    });  

}
}
