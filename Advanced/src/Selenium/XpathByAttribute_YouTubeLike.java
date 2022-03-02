package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute_YouTubeLike {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Udupi Hotelu");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@title='Udupi Hotelu|Badava Rascal|Daali Dhananjay|Amrutha Iyengar|Vasuki Vaibhav|Vijay Prakash|Shankar Guru']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']")).click();
		Thread.sleep(2000);
		

	}

}
