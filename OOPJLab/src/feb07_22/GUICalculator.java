package feb07_22;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class GUICalculator extends JFrame implements ActionListener {
	JButton b[]=new JButton[10];
	JButton add,sub,div,mult,result,clear;
	int i,r,n1,n2; char op;
	JTextField res;
	GUICalculator(){
	JFrame f=new JFrame("CALCULATOR");
	setLayout(new BorderLayout());
	JPanel p=new JPanel();
	p.setLayout(new GridLayout(4,4));
	for(i=0;i<10;i++) {
		b[i]=new JButton(i+"");
		 p.add(b[i]);
	     b[i].addActionListener(this);
	}
	add=new JButton("+");
    p.add(add);
    add.addActionListener(this);
    sub=new JButton("-");
    p.add(sub);
    sub.addActionListener(this);
    mult=new JButton("*");
    p.add(mult);
    mult.addActionListener(this);
    div=new JButton("/");
    p.add(div);
    div.addActionListener(this);
    result=new JButton("=");
    p.add(result);
    result.addActionListener(this);
    clear=new JButton("C");
    p.add(clear);
    clear.addActionListener(this);
	res= new JTextField(10);
	res.setSize(20,100);
	add(p,BorderLayout.CENTER);
    add(res,BorderLayout.NORTH);
    setVisible(true);
    setSize(200,200);
	} 
	public void actionPerformed(ActionEvent e) {
		JButton pb=(JButton)e.getSource();
		if(pb==clear)
		{
		 r=n1=n2=0;
		 res.setText("");
		}
		else
			if(pb==result)
			{
	 		 n2=Integer.parseInt(res.getText());
	  		 eval();
	  		 res.setText(""+r);
			}
			else
			{
	 		  boolean opf=false;
	 		  if(pb==add)
				{ op='+';
				  opf=true;
				}
	 		  if(pb==sub)
				{ op='-';opf=true;}
			  if(pb==mult)
				{ op='*';opf=true;}
			  if(pb==div)
				{ op='/';opf=true;}
		
			  if(opf==false)
			  {
	  		   for(i=0;i<10;i++)
			   {
			  	if(pb==b[i])
	     		  	{
	           	   	String t=res.getText();
	           		t+=i;
	            		res.setText(t);
			  	}
			   }
			  }
			  else
			  {
	    			n1=Integer.parseInt(res.getText());
	     			res.setText("");
			  }
			}
	}
	int eval()
	{
		switch(op)
		{
	 	case '+':   r=n1+n2;  break;
	 	case '-':    r=n1-n2;   break;
	 	case '*':    r=n1*n2; break;
	 	case '/':    r=n1/n2; break;
		}
		return 0;
	}
public static void main(String[] args) {
	new GUICalculator();
}
}