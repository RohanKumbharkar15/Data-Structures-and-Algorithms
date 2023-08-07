import java.util.Scanner;

//Sum of digits of a Number in Java
/*
 * Example
	Input : 1234
	Output : 1 + 2 + 3 + 4 = 10
 */
public class SUM_OF_DIGITS_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		int rem;
		int sum=0;
		while(no != 0)
		{
			rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("sum of digits "+sum);
		

	}

}
