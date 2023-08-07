
import java.util.Scanner;
// the first 10 Natural Numbers are 1, 2, 3, 4, 5, 6, 7, 8, 9, and 10.
public class N_NATURAL_NO_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number to get sum ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			System.out.println("sum of first "+n +" natural number is "+sum);
		}
	//	System.out.println("sum of first "+n +" natural number is "+sum);
		

	}

}
