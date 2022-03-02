package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_getTooltip 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		Thread.sleep(2000);
		String link = ele.getAttribute("href");
		
		System.out.println(link);

	}

}
