import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
	    Scanner sc =  new Scanner(System.in);
	    int a = sc.nextInt();
	    int i = sc.nextInt();
	    int flag = 1;
	    int dvoi = 0;
	    int cool = 0;
	    int flagint = 1;
	    if(i == 0) System.out.println(a);
	    else
	    {
    	    while(a > 0)
    	    {
    	        dvoi = (a % 2)*flag + dvoi;
    	        flag = flag*10;
    	        a = a / 2;
    	        if((a == 1) || (a == 0)) 
    	        {
    	            dvoi = a*flag + dvoi;
    	            a = -1;
    	        }
    	    }
    	   // System.out.println(dvoi);
    //-------------------------------------------------------------------------------------------------------------	    
    	    while(i > 0)
    	    {
    	        flagint = flagint * 10;
    	        i = i - 1;
    	    }
    //----------------------------------------------------------------------------------------------------------------------	    
    	    dvoi = dvoi / flagint;
    	    dvoi = dvoi * flagint;
    	    flag = 1;
    	    while(dvoi > 0)
    	    {
    	        cool = (dvoi % 10)*flag + cool;
    	        flag = flag*2;
    	        dvoi = dvoi / 10;
    	        if((dvoi == 1) || (dvoi == 0)) 
    	        {
    	            cool = dvoi*flag + cool;
    	            dvoi = -1;
    	        }
    	    }
    		System.out.println(cool);
	    }
	}
}