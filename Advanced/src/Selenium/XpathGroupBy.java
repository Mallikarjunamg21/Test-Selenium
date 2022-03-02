package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathGroupBy {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("mallikarjunamg21@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(.,'Next')])[1]"));
		Thread.sleep(3000);

	}

}
