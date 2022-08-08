package corejavapart1;

public class primenumber {
	

public static void main (String[]args)
{int n=9;
 

int count = 0;
System.out.println("enetr the number");
// negative numbers, 0 and 1 are not prime
if (n < 2)
{
    System.out.println ("The given is number " + n + " is not prime");
}

// checking the number of divisors b/w [1, n]
for (int i = 1; i <=n ; i++) 
{ 
    if (n % i == 0) 
    {
        count ++; 
} 
}
// if count of divisors greater than 2 then its not prime 
if (count > 2) 
    System.out.println ("The given is number "+ n +" is not prime");  

else
    System.out.println ("The given is number " + n + " is prime");
}
}

