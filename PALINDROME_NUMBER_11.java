import java.util.Scanner;

/*
 * Example
	Input : 121
	Output : Palindrome
 */
public class PALINDROME_NO_11 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number ");
		int no=sc.nextInt();
		int ans=isPlaindrome(no);
		if(ans==no)
		{
			System.out.println("PALINDROME");
		}
		else {
			System.out.println("NOT PALINDROME");
		}
	}

	 static int isPlaindrome(int no) {
		 int rev=0;
		 int ans=0;
		while(no !=0)
		{
			rev = no%10;
			ans=rev+(ans*10);
			no=no/10;
		}
		return ans;
		
	}

}
