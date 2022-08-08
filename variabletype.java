package corejavapart1;
import java.util.Scanner;


public class variabletype {

	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int j,i;
		System.out.println("enter the no of line display");
		int rows = sc.nextInt();
		for(i=1;i<= rows;i++)
		{
			for(j=1;j<= i;j++)
			{
		
				
				System.out.println("* ");
		
			
			}
			System.out.println();
		}
			


	}
}

	