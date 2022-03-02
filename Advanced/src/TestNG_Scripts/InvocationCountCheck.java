package TestNG_Scripts;

import org.testng.annotations.Test;

public class InvocationCountCheck 
{
	 @Test(invocationCount = 3)
	  public void Menubar()
	  {
		System.out.println("Checking list of menu");  
	  }
	  
	  @Test(dependsOnMethods = "Profile")
	  public void Settings()
	  {
		  System.out.println("Checking list of controls");
	  }
	  
	  @Test(invocationCount = 5,dependsOnMethods = "Menubar")
	  public void Profile()
	  {
		System.out.println("Checking list of Profiles");  
	  }
}
