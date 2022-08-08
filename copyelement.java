package corejavapart1;
//import java.util.Arrays;
//import java.util.Scanner;


public class copyelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc = new Scanner(System.in);
//int b[]= Arrays.copyOfRange(a,0,3);
int a[] = {2,3,4};
int b[] = a.clone();
b[0]++;

System.out.println("content of a[]");
for(int i =0; i<a.length; i++)
{
	System.out.println(a[i]+"");
	System.out.println("\n\n content of b[]");
	

}
for(int i=0; i<b.length;i++) 
{
	b[i]++;
	System.out.println(b[i]+ "");

}
}
}