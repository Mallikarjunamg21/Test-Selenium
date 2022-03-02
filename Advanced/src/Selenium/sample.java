package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://staging-websites.s3-website-ap-southeast-1.amazonaws.com/farmtheory-mobile/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[.='login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter your phone number']")).sendKeys("3456345634");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='enter your password']")).sendKeys("test1234");
		Thread.sleep(2000);
		

	}

}
