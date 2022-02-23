package feb18_22;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class StudentRecord extends JFrame implements ActionListener {
StudentRecord()
{
	JFrame f =new JFrame("My Student Record");
	JPanel p = new JPanel();
	p.setLayout(new GridLayout(6,2));
	JLabel id,Name,age,branch,batch;
	JTextField fid,fname,fage,fbranch,fbatch;
	JButton Add,Clear;

	id=new JLabel("Std Id : ");
    p.add(id);
    
    fid=new JTextField();
    p.add(fid);
    
    Name=new JLabel("Std Name : ");
    p.add(Name);
    
    fname=new JTextField();
    p.add(fname);
    
    age=new JLabel("Std Age : ");
    p.add(age);
    
    fage=new JTextField(" ");
    p.add(fage);
    
    branch=new JLabel("Std Branch : ");
    p.add(branch);

    fbranch=new JTextField(" ");
    p.add(fbranch);
    
    batch=new JLabel("Std Batch : ");
    p.add(batch);
    
    fbatch=new JTextField(" ");
    p.add(fbatch);
    
    Add=new JButton("Add");
    p.add(Add);
	
    Clear=new JButton("Clear");
    p.add(Clear);
    
    f.setLayout(null);
	 f.setVisible(true);
	 f.setSize(400,600);
	 f.setContentPane(p);
}
	public static void main(String[] args) {
		new StudentRecord();

	}
	public void actionPerformed(ActionEvent e)
	{
		
	}

}
