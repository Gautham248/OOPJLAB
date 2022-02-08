package feb07_22;
import java.awt.*;
import java.awt.event.*;



 class ActionEventDemo extends Frame implements ActionListener{
	 Frame f=new Frame();
	
	 TextField textfield;
		Label mylabel;
		ActionEvent myaction;
		{
			textfield=new TextField("My TextField");
			mylabel=new Label("MY Label");
			mylabel.setBounds(60,50,200,20);
			textfield.setBounds(60,50,200,20);
			Button button=new Button("Say Hello");
			button.setBounds(90,140,75,40);
			button.addActionListener(this);
			
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			textfield.setText("Please practice java");
			mylabel.setText("Hello");
		}
		


 
 public static void main(String[] args) {
	 new ActionEventDemo();
	 
 }
 }
