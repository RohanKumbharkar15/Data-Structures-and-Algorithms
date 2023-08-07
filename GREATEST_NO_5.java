import java.util.Scanner;

//Greatest of the Two Numbers
// n1=12 ,n2=8
// n1 is greater
public class Greatest_of_the_Two_Numbers_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two number to find greatest number among them");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		if(n1>n2)
		{
			System.out.println(n1 +" is greater than "+n2);
		}
		else if(n2>n1)
		{
			System.out.println(n2+" is greater than "+n1);
		}
		else
		{
			System.out.println("both are equals");
		}
		

	}

}
