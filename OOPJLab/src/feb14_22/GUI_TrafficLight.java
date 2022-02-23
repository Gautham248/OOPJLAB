package feb14_22;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class GUI_TrafficLight extends JPanel implements ActionListener {
	
JRadioButton red,yellow,green;
Color red_c,yellow_c,green_c;

	public GUI_TrafficLight(){
		
		JFrame frame=new JFrame("TRAFFIC LIGHTS");
		frame.setSize(300,300);
		JPanel panel=new JPanel();
		panel.setLayout(null);
		
		setBounds(0,0,300,300);
		red=new JRadioButton("RED");
		yellow=new JRadioButton("YELLOW");
		green=new JRadioButton("GREEN");
		red.setSelected(true);
		red_c=Color.red;
		yellow_c=getBackground();
		green_c=getBackground();
		
		ButtonGroup gp=new ButtonGroup();
		gp.add(red);
		gp.add(yellow);
		gp.add(green);
		red.addActionListener(this);
		yellow.addActionListener(this);
		green.addActionListener(this);
		
	 	red.setBounds(10,0,100,100);
		yellow.setBounds(110,0,100,100);
		green.setBounds(210,0,100,100);
		panel.add(red);
		panel.add(yellow);
		panel.add(green);
		frame.setVisible(true);
		frame.setContentPane(panel);
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(50,50,50,50);
		g.drawOval(50,110,50,50);
		g.drawOval(50,170,50,50);
		g.setColor(red_c);
		g.fillOval(50,50,50,50);
		g.setColor(yellow_c);
		g.fillOval(50,110,50,50);
		g.setColor(green_c);
		g.fillOval(50,170,50,50);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(red.isSelected()==true) {
			red_c=Color.red;
			yellow_c=getBackground();
			green_c=getBackground();

		}
		else if(yellow.isSelected()==true) {
			red_c=getBackground();
			yellow_c=Color.yellow;
			green_c=getBackground();
		}
		else if(green.isSelected()==true) {
			red_c=getBackground();
			yellow_c=getBackground();
			green_c=Color.green;

		}
		repaint();
	}
	

	
	public static void main(String[] args) {
		JFrame frame=new JFrame("TRAFFIC LIGHTS");
		frame.setVisible(true);
		frame.setSize(400,400);
		frame.setLayout(null);
		GUI_TrafficLight t=new GUI_TrafficLight();
		frame.add(t);
	}

}
