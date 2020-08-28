package p1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class chummaprog extends JFrame implements ActionListener{JFrame j;
	
	private static final long serialVersionUID = 1L;

	FileInputStream FIS;XSSFWorkbook w;XSSFSheet sheet;XSSFCell cell;XSSFRow row;
	
	  public chummaprog() throws Exception
	  {File F=new File("C:/Users/SYS TEM/workspace/oops project/oops_project.xlsx");
	 FIS =new FileInputStream(F);
	 w =new XSSFWorkbook(FIS);
	 sheet=w.getSheet("Sheet1");

      row =sheet.getRow(1);
	
	cell=row.getCell(1);
	
	  }
	  public void senddetails1(int num,String place)
	  {XSSFCell cell1,cell2,cell3;
	  XSSFRow row1;
		  j=new JFrame("");
		  JButton g=new JButton("Back");
		  g.addActionListener(this);
		  
	  row1=sheet.getRow(num);
	  cell1=row1.getCell(0);
	  cell2=row1.getCell(1);
	  cell3=row1.getCell(2);
	  String state,soil,climate;
	  state=cell1.getStringCellValue();
	  soil=cell2.getStringCellValue();
	  climate=cell3.getStringCellValue();
	  JLabel a=new JLabel("In your state"+state);
	  JLabel b=new JLabel("and especially in "+place);
	  JLabel c=new JLabel("these are the available soils for agriculture :"+soil);
	  JLabel d=new JLabel("and it has "+climate+" climate");
	  JLabel e=new JLabel("Hope the information is useful. use our applet to find the corresponding crops for the soil");
	  add(g);
	  add(a);
	  add(b);
	  add(c);
	  add(d);
	  add(e);
	  
	  
	  
	  setLayout(new FlowLayout());
	    setVisible(true);
	     setSize(2000,2000);
	    setTitle("FARMERS GUIDE");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
	  
	  }
	  public void senddetails2(int num)
	  {   
		  j=new JFrame("");
		  JButton g=new JButton("Back");
		 sheet=w.getSheet("Sheet2");
	  XSSFCell cell1,cell2;
	  XSSFRow row1;
	  row1=sheet.getRow(num);
	  cell2=row1.getCell(1);
	  cell1=row1.getCell(0);
	  String soil,crops;
	  soil=cell1.getStringCellValue();
	  crops=cell2.getStringCellValue();
	  JLabel a,b,c;
	  a=new JLabel("For the soil entered by you these are some of the crops which could be cultivated");
	  b=new JLabel(soil+":"+crops);
	  c=new JLabel("Hope the information is useful.use our applet to find the soil in your region");
	  add(g);
	  add(a);
	  add(b);
	  add(c);g.addActionListener(this);
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
