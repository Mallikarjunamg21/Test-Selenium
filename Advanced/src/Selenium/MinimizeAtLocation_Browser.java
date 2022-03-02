package Selenium;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinimizeAtLocation_Browser {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		Dimension d=new Dimension(200,200);
		driver.manage().window().setSize(d);
		Thread.sleep(2000);
		
	}

}
