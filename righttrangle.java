package corejavapart1;

import java.util.Scanner;

public class righttrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j,i,count  = 1,k ;
Scanner sc =new Scanner(System.in);
		
		System.out.println("enter the no of line display");
		int n = sc.nextInt();
			

		for(i = 0; i < n; i++)
		{
		for(j = 1;j < n-i; i++) {
			System.out.println(" ");

		}
for(k=0;k<= i;k++)
	
{
	System.out.println(" *");
}
System.out.println();

	}
	}}
