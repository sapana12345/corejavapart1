package corejavapart1;
import java.util.Scanner;
public class arrayprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////int[] a = {1,2,3,4,5};
//System.out.println("first array" +a[0]);
//System.out.println("second array" +a[2]);
		Scanner sc= new Scanner(System.in);
		
		//int num[]=new int[5];
		//int i;
		

		//for( i=0;i<num.length;i++)
		//{
	
			//System.out.println("element in array");
			//for( i=0;i<num.length;i++)
			////{
				//num[i]=sc.nextInt();
//
				//System.out.println(num[i]);
			//}
		//}
		

		int i,j;
		int arr[][]=new int[10][10];
		System.out.println("enter the element");
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				arr[i] [j]=sc.nextInt();}
		}
		int sum=0;
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr.length;j++) {
				if(i==j) {
					sum=sum+arr[i][j];
				}}
			System.out.println(sum);
				}
					

				
		
			}
		
		
		
	}


