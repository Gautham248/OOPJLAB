package feb07_22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyListenerDemo extends Frame implements KeyListener{
	JTextField tf1;
	JLabel label;
	KeyListenerDemo(){
		JFrame frame=new JFrame("KEY LISTENER");
		frame.setSize(400,300);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		
		label=new JLabel("");
		label.setBounds(120,90,100,100);
		label.addKeyListener(this);
		panel.add(label);
		
		tf1=new JTextField();
		tf1.setBounds(100,100,100,30);
		tf1.addKeyListener(this);
		panel.add(tf1);
		
		
		
		frame.setVisible(true);
		frame.setContentPane(panel);
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		label.setText("KEY TYPED");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		label.setText("KEY PRESSED");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		label.setText("KEY RELEASED");
	}

	
	public static void main(String[] args) {
		
		new KeyListenerDemo();

	}


}
