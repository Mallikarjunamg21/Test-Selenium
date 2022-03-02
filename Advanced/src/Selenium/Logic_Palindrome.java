package Selenium;

public class Logic_Palindrome
{
	public static void main(String[] args)
	{
		int r;
		int sum=0;
		int temp;
		int n=3223;
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum = (sum*10)+r;
			System.out.println(sum);
			n=n/10;
		}
		System.out.println("print "+sum);
		if (temp==sum)
		{
			System.out.println("Number is palindrome");
		}
	}
}
