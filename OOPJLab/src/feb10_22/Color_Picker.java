package feb10_22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class Color_Picker extends Frame implements ActionListener {
	 
	 JButton button;
	 JPanel panel;
	 Color_Picker(){
		 JFrame frame=new JFrame("ANANDU PRO");
		 frame.setSize(500,500);
		 panel=new JPanel();
		 panel.setLayout(null);
		 button=new JButton("CHANGE MY LOOKS ;)");
		 button.setBounds(130,250,200,50);
		 button.addActionListener(this);
		 panel.add(button);
		 panel.setBackground(Color.cyan);
		 frame.setVisible(true);
		 frame.setContentPane(panel);
	 }
	public void actionPerformed(ActionEvent e) {
		Color c=JColorChooser.showDialog(panel, "Choose a color", panel.getBackground());
		if(c!=null) {
			panel.setBackground(c);
		}
	}
	
	public static void main(String[] args) {
		new Color_Picker();
	}

}
