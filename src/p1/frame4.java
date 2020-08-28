package p1;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame4 extends JFrame {

	private static final long serialVersionUID = 1L;
	public String s[]={"PLEASE CHOOSE A SOIL",
			"RED SOIL", 
			"BLACK SOIL",
			"ALLUVIAL SOIL",
			"SANDY/DESERT SOIL"
			,"LOAMY SOIL",
			"LATERITE SOIL"

};
	JComboBox<String> c;
	JLabel n,k;
	JFrame J;
public frame4()
{J=new JFrame("hello");
c=new JComboBox<String>(s);
n=new JLabel("Please Select The Soil For Knowing The crop");
add(n);
add(c);

setTitle("FARMERS GUIDE");
setLayout(new FlowLayout());
setVisible(true);
 setSize(2000,2000);
 c.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent event)
				{
					if(event.getStateChange()==ItemEvent.SELECTED)
					{J.dispose();
						try {
						chummaprog ch=new chummaprog();
						ch.senddetails2(c.getSelectedIndex());
						
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
					}
				}}
			);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
