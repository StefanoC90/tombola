import java.awt.*;

class  Tombola{
public static Frame f=new Frame("  TOMBOLA  ");    
public static tab t=new tab();
public static sacco s=new sacco();

	public static void main(String argv[]) {
	         
	     f.setSize(450,510);
	     f.add(t);
	     f.setResizable(false);
	     f.setLocation(400,300);	
	     f.setVisible(true);	    
	     f.addWindowListener(new GestoreFinestra());
	     t.addMouseListener(new mou());
	  
	}
}