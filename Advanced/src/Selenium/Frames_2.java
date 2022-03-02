package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		Thread.sleep(2000);	
		WebElement tab = driver.findElement(By.xpath("//li[@id='iFrame']"));
		tab.click();
		WebElement f = driver.findElement(By.xpath("//iframe[@class=' lazyloaded']"));
		driver.switchTo().frame(f);
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[@name='s']")).sendKeys("MGM");
		driver.switchTo().defaultContent();
	}

}
