package p1;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frame3 extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public String s[]={"Choose your state","Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmir","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya"
			,"Mizoram"
			,"Nagaland"
			,"Odisha"
			,"Punjab"
			,"Rajasthan"
			,"Sikkim"
			,"Tamil Nadu"
			,"Telangana"
			,"Tripura"
			,"Uttar Pradesh"
			,"Uttarakhand"
			,"West Bengal"
};
JLabel n,k;JFrame J;JTextField a;

	
	JComboBox<String> c;

public frame3()
{ J=new JFrame("Region Selector");
n=new JLabel("please enter your state");
  k=new JLabel("please enter your district");
  a=new JTextField(25);
  
  
	 
	c=new JComboBox<String>(s);
	
	setTitle("FARMERS GUIDE");
	add(k);
	add(a);
	
	add(n);
	add(c);
	
	
	
	c.addItemListener(
			new ItemListener(){
				public void itemStateChanged(ItemEvent event)
				{
					if(event.getStateChange()==ItemEvent.SELECTED&&!(a.getText().isEmpty()))
					{J.dispose();
						try {
						chummaprog ch=new chummaprog();
						ch.senddetails1(c.getSelectedIndex(),a.getText());
						
						
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
						
					}
				}
			});
	
	setLayout(new FlowLayout());
    setVisible(true);
     setSize(2000,2000);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
