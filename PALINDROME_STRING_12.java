
import java.util.Scanner;

public class STRING_PALINDROME_12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		String str=sc.next();// Radar -palindrome
		boolean b=isPalindrome(str.toLowerCase());
		if(b)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}
		
	}

	private static boolean isPalindrome(String str) {
		String reverse=new StringBuilder(str).reverse().toString();
		return reverse.equals(str);
		
	}

}
