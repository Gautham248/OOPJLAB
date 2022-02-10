package feb10_22;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class ItemListenerDemo extends Frame  implements ItemListener
{
	
	Label label;
	JCheckBox box1,box2;
	
	ItemListenerDemo()
	{
		JFrame frame=new JFrame("CHECK BOX EXAMPLE");
		frame.setSize(400,400);
		JPanel panel=new JPanel();
		panel.setLayout(null);
		
		
		label=new Label();
		label.setAlignment(Label.CENTER);
		label.setSize(400,100);
		panel.add(label);
		
		
		box1=new JCheckBox("JAVA");
		box1.setBounds(100,100,100,50);
		box1.addItemListener(this);
		panel.add(box1);
		
		
		box2=new JCheckBox("C++");
		box2.setBounds(100,150,50,50);
		box2.addItemListener(this);
		panel.add(box2);
		
		
		frame.setVisible(true);
		frame.setContentPane(panel); 
		
		
	}

	public void itemStateChanged(ItemEvent e) 
	{
		boolean java=false;
		boolean c=false;
		JCheckBox p=(JCheckBox)e.getSource();
		

		if(p==box1) {
			label.setText("JAVA "+(e.getStateChange()==1?"CHECKED":"UNCHECKED"));
		}
		else if(p==box2) {
			label.setText("C++"+(e.getStateChange()==1?"CHECKED":"UNCHECKED"));
		}
		
	
		
	}

	
	public static void main(String[] args) 
	{
		new ItemListenerDemo();
	}
}
