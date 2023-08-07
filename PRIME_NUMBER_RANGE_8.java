// Java Program to print Prime numbers in a given range
// 1 to 10
// 2 , 3 , 5 , 7
public class PRIME_NUMBER_RANGE_8 {

	public static void main(String[] args) {
	
		int n1=1;
		int n2=10;
		for(int i=n1;i<=n2;i++)
		{
			boolean b=primenumber(i);
			if(b)
			{
				System.out.println(i);
			}
		}
	}
	
	static boolean primenumber(int no)
	{
		if(no<2)
		{
			return false;
		}
		else
		{
			for(int i=2;i<=no/2;i++)
			{
				if(no%i ==0)
				{
					return false;
				}
				
			}
		}
		return true;
	}
}
