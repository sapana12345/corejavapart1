package corejavapart1;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count,i,j;
		System.out.println("enter the prime number are 50");
		for(i=1; i<=50;i++) {
			count=0;
		for(j=2; j<=Math.sqrt(i); j++)
			if(i% j==0)
			{
				count +=1;
				break;
			}
		if(count ==0 && i !=1)
		{
			System.out.println(i +  "");
		}
			}

	}

}