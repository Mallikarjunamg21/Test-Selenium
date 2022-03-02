package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Basic_Facebook 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("mallikarjunamg21@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Shimoga@21");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		

	}

}
