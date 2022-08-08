package corejavapart1;

import java.util.Scanner;

public class studentmark {
	
	private static Scanner sc;

	public static void main(String[] args) {
	int English ,Marathi ,Computer, Physics;
	float total, Percentage;
	sc= new Scanner (System.in);
	System.out.print("enter your four subject mark: ");
	English = sc.nextInt();
		Marathi	= sc.nextInt();
				Computer	= sc.nextInt();
	Physics	= sc.nextInt();
	total= English+Marathi+Computer+Physics;
	Percentage =(total / 500)*  100;
	System.out.println("Total Marks = :"+ total);
	System.out.println("Marks percentage = " +Percentage);
	if(Percentage >=90)
	{
		
	
	System.out.println("\n Grage A" );
	}
	else if(Percentage >=80)
	{
		
	
	System.out.println("\n Grage B" );
	
	
	}

	else if(Percentage >=70)
	{
		
		
		System.out.println("\n Grage C" );
	}
	else if(Percentage >=60)
	{
		
		
		System.out.println("\n Grage D" );
	}
		
	}
}