package corejavapart1;
import java.util.Scanner;

public class revesenumber {

	public static void main(String[] args)
	{

	
	//Scanner sc = new Scanner(System.in);
	//String revstr;
	//System.out.println("\n plese enter text = ");
	//revstr = sc.nextLine();
	//StringBuilder sb = new StringBuilder(revstr);
	//System.out.println("the result =" +sb.reverse());
		
			// TODO Auto-generated method stub
	       int num, reverse=0;
	       
	       Scanner sc=new Scanner(System.in);
	       
	       System.out.println("Enter Number");
	       num=sc.nextInt();
	       
	       for(;num!=0;num=num/10)
	       {int remainder=num%10;
	       reverse=reverse*10+remainder;
	    	   
	       }
	       System.out.println("The reverse of the given number is"+reverse);

	}

}
