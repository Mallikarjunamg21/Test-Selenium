package Selenium;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Manage_WindowPosition {

	public static void main(String[] args)	
{
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			Point p = new Point(200,500);
			//p.setLocation(p);
			driver.manage().window().setPosition(p);
}

}
