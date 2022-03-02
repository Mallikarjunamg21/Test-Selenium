package TestNG_Scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstOne 
{
	@Test
	public void azure()
	{
		Reporter.log("Hi Bengaluru......!!!!!", false);
	}
	
	@Test
	public void Github()
	{
		Reporter.log("Explore City", false);
	}
}
