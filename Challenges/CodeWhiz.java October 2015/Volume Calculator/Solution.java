import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.security.Permission;

//Solution starts here
class Calculate
{
    Calculate_Volume output;
    BufferedReader br;
    Calculate()
    {
        br = new BufferedReader(new InputStreamReader(System.in));              

        output=new Calculate_Volume();
    }
    static Calculate_Volume get_Vol()
    {
        return new Calculate_Volume();

    }
    public int getINTVal() throws NumberFormatException, IOException
    {
        return Integer.parseInt(br.readLine().trim());
    }
    public double getDoubleVal() throws NumberFormatException, IOException
    {
        return Double.parseDouble(br.readLine());
    }


}
class Calculate_Volume {

    public double main(int a) {
        if(a<-100||a>100)
            throw new NumberFormatException("Out of range");
        if(a<=0){
            //System.exit(0);
            throw new NumberFormatException("All the values must be positive");
        }

        return a*a*a;

    }   

    public double main(double r, double h) {
        if(r<-100||r>100||h<-100||h>100)
            throw new NumberFormatException("Out of range");
        if(r<=0||h<=0)
            throw new NumberFormatException("All the values must be positive");

        return Math.PI*r*r*h;
    }

    public double main(double r) {
        if(r<-100||r>100)
            throw new NumberFormatException("Out of range");
        if(r<=0)
            throw new NumberFormatException("All the values must be positive");
        return ((double)2/3)*Math.PI*r*r*r;
    }

    public double main(int l, int b, int h) {
        if(l<-100||l>100||b<-100||b>100||h<-100||h>100)
            throw new NumberFormatException("Out of range");
        if(l<=0||b<=0||h<=0)
            throw new NumberFormatException("All the values must be positive");
        return l*b*h;
    }
    public void display(double volume) {
        System.out.printf("%.3f\n",volume);

    }

}//ends here

public class Solution
{
	
	public static void main(String[] args) {
		Do_Not_Terminate.forbidExit();		
		try{
			Calculate cal=new Calculate();
			int T=cal.getINTVal();
			while(T-->0){
			double volume = 0.0d;		
			int ch=cal.getINTVal();			
			if(ch==1){
			
				int a=cal.getINTVal();
				volume=Calculate.get_Vol().main(a);
				
				
			}
			else if(ch==2){
			
				int l=cal.getINTVal();
				int b=cal.getINTVal();
				int h=cal.getINTVal();
				volume=Calculate.get_Vol().main(l,b,h);
				
			}
			else if(ch==3){
			
				double r=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r);
				
			}
			else if(ch==4){
			
				double r=cal.getDoubleVal();
				double h=cal.getDoubleVal();
				volume=Calculate.get_Vol().main(r,h);
				
			}
			cal.output.display(volume);
			}
					
		}
		catch (NumberFormatException e) {
			System.out.print(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
		
		
	}
}
/**
 *This class prevents the user from using System.exit(0)
 * from terminating the program abnormally.
 */
class Do_Not_Terminate {
	 
    public static class ExitTrappedException extends SecurityException {
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}//end of Do_Not_Terminate	
	
