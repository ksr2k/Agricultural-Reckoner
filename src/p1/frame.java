package p1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class frame extends JFrame implements ActionListener{
	
	
	
	private static final long serialVersionUID = 1L;

	JFrame j1;JLabel m,k;JButton next;
	
	public frame()
	{ j1=new JFrame("FARMERS GUIDE");
	 
    m=new JLabel("I believe in the future of agriculture, with a faith born not of words but of deeds.");
   
    //k=new JLabel("Some one has truly said, “India is a land of villages and farmers are the soul of the country.”"+"\n"+" I also feel the same. Farmers are a respected lot and farming is considered a noble profession in our country. They are also called “Annadata”, which means “food provider”.  According to this logic, farmers in India should be a happy and prosperous lot but the irony is that the reality is exactly opposite to it.This is the reason why kids of farmers don’t want to pursue the profession of their parents. According to a government data, around two and a half thousand farmers leave farming and migrate to cities daily in search of livelihood.  If this trend continues, then a time may come when there will no farmers left and our country will turn from “food surplus”, which we are now to “food deficient”.I used to think that when the prices of commodities go up, the farmer benefits but the reality is that most of the money is grabbed by the middle men. So, the farmer is always a looser. When there is a bumper crop, the price of the products fall and at many times he has to sell his produce at a throwaway price to the government or to the middlemen and when there is drought or flood, then we all know what happens to the poor farmer.The condition of the farmers is getting from bad to worse. If something is not done urgently, there will be nothing left to save.");
    next=new JButton("next page");
    
    next.setLocation(20,20);

    add(m);
    
    add(next);
    next.addActionListener(this);
    setLayout(new FlowLayout());
    setVisible(true);
     setSize(2000,2000);
    setTitle("FARMERS GUIDE");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
	}
	
	public void actionPerformed(ActionEvent e) {
		new frame2();
		this.dispose();
		
	}
	
    
}
