import java.util.Scanner;
class RangeofLeapYear 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting year : ");
		int start = sc.nextInt();
		System.out.print("Enter ending year : ");
		int end = sc.nextInt();

		for(int i=start; i<=end; i++)
		{
			if(leapYear(i))
			{
				System.out.print(i + " ");
			}
		}
	}


	public static boolean leapYear(int year)
	{
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			return true;
		}
		return false;
	}
}
