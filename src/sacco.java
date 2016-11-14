class sacco{

public static int es;
public static boolean a[]=new boolean[91];
   
    public sacco(){
	    int i;
	    for(i=1;i<91;i++)
	    	a[i]=false;        
    }
    
    
   public static void estrazione(){
	   for( ; ; ){	
		   es=(int)(Math.random()*90+1);
		   if(a[es]==false)
			   break;
		}
		a[es]=true;        
    } 
  }   
    