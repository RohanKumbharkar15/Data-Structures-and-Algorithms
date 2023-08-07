import java.util.Scanner;

//Reverse a given number in Java
/*
 * Example
	Input : 123
	Output : 321
 */
public class REVERSE_NO_10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int no=sc.nextInt();
		int rev=0;
		if(no==0)
		{
			System.out.println(no);
		}
		else {
			System.out.println("reverse number is\n");
			while (no!=0)
			{
				rev=no%10;
				System.out.print(rev);
				no=no/10;
			}
		}
	}

}
