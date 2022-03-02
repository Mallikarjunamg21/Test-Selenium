package Selenium;

public class Logic_Pseudocode
{
	public static void main(String[] args)
	{
		int c=0;
		int a;
		int temp;
		int n=153;
		temp=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a+a+a);
			System.out.println(c);
		}
		System.out.println("print "+c);
		if (temp==c)
		{
			System.out.println("Number is amstrong");
		}
	}
}

