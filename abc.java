package corejavapart1;
import java.util.Scanner;

public class abc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 int [] arr = new int [] {5, 2, 8, 7, 1};     
	        int temp = 0; 
	    int counter,num,mid,low,high,x;
	               
	        System.out.println("Elements of original array: "); 
	        System.out.println("enter the value search ");   
	         int item = sc.nextInt();
	         int array;
	         
	         for(counter = 0; counter<num; counter++)
	         {
	        	 if([counter]==item) {
	        	 
	        		 System.out.println(item+"is presnt location"+counter+1);
	        		 break;
	        		 
	        	 }
	         }
	         if(counter == num) {
	        	 System.out.println(item+"dosent array is exist ");
	         }
	        mid = (low+high/2);
	        if(x== arr[mid])
	        {
	 
	        	}
	        
	        	else
	        	{
	        		if()
	        		{
	        			x >  arr[mid];
	        					low =mid+1;
	        		}
	        	
	        else {
	        		    				high = mid-1;
	        			
	        				
	        	}
	        	}
	        for (int i = 0; i < arr.length; i++) {     
	            System.out.print(arr[i] + " ");    
	        }    
	               
	        for (int i = 0; i < arr.length; i++) 
	        {     
	            for (int j = i+1; j < arr.length; j++)
	            {     
	               if(arr[i] > arr[j])
	               {    
	                   temp = arr[i];    
	                   
	                   arr[i] = arr[j];    
	                   arr[j] = temp;    
	               }     
	            }     
	        }    
	        System.out.println();   
	       

	        System.out.println("Elements of array sorted in ascending order: ");    
	        for (int i = 0; i < arr.length; i++) 
	        {     
	            System.out.print(arr[i] + " ");    
	        }    
	    }    
	    



	}


