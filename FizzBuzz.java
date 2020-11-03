import java.util.Scanner;

class FizzBuzz
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int start=scan.nextInt();   //taking starting value input from user.
		int stop=scan.nextInt();    //taking ending value input from user.
		
		for(int i=start; i<=stop; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
				continue;
			}
			
			else if(i%3==0)
			{
				System.out.println("Fizz");
				continue;
			}
			
			else if(i%5==0)
			{
				System.out.println("Buzz");
				continue;
			}
			
			else
				System.out.println(i);
		}
	}
}