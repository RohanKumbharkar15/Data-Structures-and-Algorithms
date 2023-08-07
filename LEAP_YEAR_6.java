import java.util.Scanner;
//1. year =2020 %4==0
//		2020%100 = not 0 remiander
// 2020 is leap year
// 2. year=1000
// 1000%4==0 but 1000%100 is also 0 
// so it is not leap year
public class LEAP_YEAR_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		
		if( year%4==0 && year%100 !=0)
		{
			System.out.println("leap year - "+year);
		}
		else if(year %400==0)
		{
			System.out.println("leap year -"+year);
		}
		else
		{
			System.out.println(year+" not leap year");
		}

	}

}
