package TestNG_Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic 
{
 WebDriver driver;
 @BeforeMethod
 public void launch()
 {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		//String url1 = "https://www.instagram.com";
	    //String url2 = "https://www.facebook.com";
		
		//driver.get("https://www.instagram.com");
		driver.get("https://www.facebook.com");
		
 }
 
 @AfterMethod
 public void clos()
 {
	 	driver.close();
 }
}
