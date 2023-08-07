import java.util.Scanner;

// Find the Sum of the Numbers in a Given Range
// range 12 ,15
// 12+13+14+15=54
public class Find_the_Sum_of_the_Numbers_in_a_Given_Range_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number to find sum");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int sum=0;
		for(int i=n1;i<=n2;i++)
		{
			sum=sum+i;
			System.out.println("sum is "+sum);

		}
		
	}

}
