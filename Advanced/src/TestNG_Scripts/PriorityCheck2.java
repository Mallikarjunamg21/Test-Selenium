package TestNG_Scripts;

import org.testng.annotations.Test;

public class PriorityCheck2 

{
  @Test(priority = 2)
  public void Menubar()
  {
	System.out.println("Checking list of menu");  
  }
  
  @Test(priority = 1)
  public void Settings()
  {
	  System.out.println("Checking list of controls");
  }
  
  @Test(priority = 3)
  public void Profile()
  {
	System.out.println("Checking list of Profiles");  
  }
}
  

