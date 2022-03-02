package Selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DragAndDrop_browser {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.croma.com");
		Thread.sleep(2000);
		//selenium point package
		Point p = new Point(200,300);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		driver.close();
		
	}
}