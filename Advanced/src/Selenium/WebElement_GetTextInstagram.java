package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_GetTextInstagram
{

	public static void main(String[] args) throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.instagram.com/");
			Thread.sleep(2000);
			WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Sign up')]"));
			Thread.sleep(2000);
			String name = ele.getText();
			System.out.println("Name of the Link is "+name);
	}

}
