package TestNG_Scripts;

import org.testng.annotations.Test;

public class PriorityChecking 
{
  @Test
  public void Menubar()
  {
	System.out.println("Checking list of menu");  
  }
  
  @Test
  public void Settings()
  {
	  System.out.println("Checking list of controls");
  }
  
  @Test
  public void Profile()
  {
	System.out.println("Checking list of Profiles");  
  }
  
}
