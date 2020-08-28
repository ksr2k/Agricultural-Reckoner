package p1;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame2 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	JButton b1,b2;JLabel M;JFrame j;
	public frame2()
	{j=new JFrame("Select Your Guidance");
	b1=new JButton("GET CROP DETAILS");
	b2=new JButton("GET SOIL DETAILS");
	M=new JLabel("PLEASE SELECT YOUR ACTION\n");
 
	add(M);
	add(b1);
	add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	setTitle("FARMERS GUIDE");
		setLayout(new FlowLayout());
	    setVisible(true);
	     setSize(2000,2000);
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			new frame3();
			j.dispose();
		}
		else if(e.getSource()==b2)
		{
			new frame4();
			j.dispose();
			
		}
		
	}

}
