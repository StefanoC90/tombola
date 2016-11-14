import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseListener;


class mou  implements MouseListener{   
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){ 
	    
	    int n,i,j,s1=0,s2=0;
	
	    Point p=new Point(e.getX(), e.getY());		
	    if((p.x>330)&&(p.x<408)&&(p.y>16)&&(p.y<40)){   
	
		    Tombola.s.estrazione();
		    n=sacco.es-1;
		    /*tombola.t.repaint();*/
		    try{
		    
		    Tombola.t.repaint(15,445,350,16);}
		    catch(Exception r){
		    	return;
		    }
		    
		    
		    
		    i=n/10;
		    j=n%10;
		    if(i<3)
		    	s2=0;
		    else
		    if(i<6)
		    	s2=10;
		    else
		    if(i<9)
		    	s2=20;
		    if(j<5)
		    	s1=0;
		    else
		    	s1=10;	
		   
		    Tombola.t.repaint(25+j*40+s1, 60+i*40+s2,30,30);
	
	    }
    }
    	
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    
}