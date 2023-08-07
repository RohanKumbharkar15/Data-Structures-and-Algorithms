
import java.util.Scanner;

public class PRIME_NUMBER_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		boolean b=true;
		for(int i=2;i<=number/2;i++)
		{
			if(number%2==0)
			{
				b=false;
				break;
			}
		}
		if(b)
		{
			System.out.println(number+" is prime number");
		}
		else
		{
			System.out.println(number+" is not prime number");
		}
	}

}
