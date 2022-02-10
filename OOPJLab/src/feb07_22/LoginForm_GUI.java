package feb07_22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginForm_GUI extends Frame implements ActionListener{

	JButton LOGIN;
	JLabel user,passw,success;
	JTextField User;
	JPasswordField Pass;
	LoginForm_GUI(){
		
		JFrame frame= new JFrame("LOGIN FORM");
		frame.setSize(400,300);
		
	    JPanel panel=new JPanel();
		panel.setLayout(null);
		
		user=new JLabel("USER NAME: ");
		user.setBounds(50,85,100,60);
		panel.add(user);
		
		User=new JTextField();
		User.setBounds(150,100,200,30);
		panel.add(User);
		
		Pass=new JPasswordField();
		Pass.setBounds(150,140,200,30);
		panel.add(Pass);
		
		passw=new JLabel("PASSWORD :");
		passw.setBounds(50,125,80,60);
		panel.add(passw);
		
		LOGIN=new JButton("LOGIN");
		LOGIN.setBounds(190,180,100,30);
		LOGIN.addActionListener(this);
		panel.add(LOGIN);
		
		
		success=new JLabel("                  ");
		success.setBounds(180,200,130,40);
		panel.add(success);
		
		frame.setVisible(true);
		frame.setContentPane(panel); 

		
	}
	


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==LOGIN) {
			success.setText("LOGIN SUCCESSFUL!!");
		}
	}

	public static void main(String[] args) {

		new LoginForm_GUI();
		
	}
	
	
	
}
