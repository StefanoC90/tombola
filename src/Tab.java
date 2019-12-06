import java.awt.*; 

public class Tab extends  Canvas {


    private final String NUMBERSTRING = "L'ultimo numero estratto e': ";
    int cont=0;
    public void paint(Graphics g){
	    int i=0,j=0,s1=0,s2=0,n;
	    cont++;
	    
	    if(cont==91)
	    	System.exit(0);
	
	    
	    g.setFont(new Font(Font.MONOSPACED, Font.PLAIN,12));
	    g.setColor(Color.gray);	
	    g.fillRect(0,0,445,480);
	    g.setColor(Color.black);
	    g.drawString("PREMERE IL BOTTONE PER ESTRARRE",10,40);
	    g.drawRect(330,15,80,25);
	    g.setColor(Color.red);
	    g.fillRect(331,16,79,24);   
	    g.setColor(Color.black);
	    g.drawString("ESTRAI!!!",343,35);   
	    g.drawRect(5,5,435,470);
	   
	    try { Thread.sleep(20); } 
	    catch (InterruptedException w) { return; }
	    
	    g.drawLine(225,45,225,440);
	    g.drawLine(5,45,440,45);
	    g.drawLine(5,180,440,180);
	    g.drawLine(5,310,440,310);
	    g.drawLine(5,440,440,440);
	      
	    g.setColor(Color.red);
	    for(n=1; i<9;i++){
		    if(i<3)
		    	s2=0;
		    else
		    if(i<6)
		    	s2=10;
		    else
		    if(i<9)
		    	s2=20;
		    
		    for(j=0;j<10;j++){
			    if(j<5)
			    	s1=0;
			    else
			    	s1=10;		
			    	
			
			    if(Sacco.getA()[n]==false){
			    
			    	g.setColor(Color.white); 
			    } 
			    
			    else	{
			    	g.setColor(Color.red);	
			    } 	
			    
			    g.fillOval(25+j*40+s1, 60+i*40+s2,30,30);
			    g.setColor(Color.black);
			    g.drawOval (25+j*40+s1, 60+i*40+s2,30,30);
			    g.drawString(""+n,35+j*40+s1,80+i*40+s2);/*Va centrato*/
			    n++;
		    }
	    }
	    if(Sacco.getEs()!=0){
	    
		    g.setColor(Color.black);
		    g.setFont(new Font(Font.MONOSPACED, Font.PLAIN,16));
		    g.drawString(NUMBERSTRING + Sacco.getEs(),15,460);
		    g.drawString(NUMBERSTRING + Sacco.getEs(),0,0);
		    
		    
	    }
	    
    }

   
}