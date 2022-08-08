package corejavapart1;
import  java.util.Scanner;

public class switchbreak {

	public static void main(String[] args) {
	int a, b;
	char op;
	
	Scanner scanner;
		scanner  = new Scanner(System.in);
		System.out.println("Enter your two interger");
		a= scanner.nextInt();
		b= scanner.nextInt();
		System.out.println("enter your operater");
		op = scanner.next().charAt(0);
		
		switch(op)
		{
		case '+':
			System.out.format("%d + %d  = %d\n", a,b, a+b);
			break;
		case '-':
			System.out.format("%d + %d  = %d\n", a,b, a-b);
			break;
		case '*':
			System.out.format("%d + %d  = %d\n", a,b, a*b);
			
			break;
		case '/':
			System.out.format("%d + %d  = %d\n", a,b, a/b);
			break;
			default:
				
				System.out.println("enter unsuported operation");
			
			
			
			
		}

	}

}
