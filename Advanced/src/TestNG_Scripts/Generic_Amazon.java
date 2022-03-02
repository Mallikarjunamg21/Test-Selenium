package TestNG_Scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Amazon 
{
	 WebDriver driver;
	 @BeforeMethod
	 public void launch()
	 {
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in");
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
	 }
	 
	 @AfterMethod
	 public void clos()
	 {
		 	driver.close();
	 }
}

