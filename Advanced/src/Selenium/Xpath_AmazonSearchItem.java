package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_AmazonSearchItem {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Samsung S21 FE 5G");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(5000);
		//error due to scroll bar issue
		driver.findElement(By.xpath("//a[@href='/Samsung-Unlocked-Smartphone-Intelligent-Graphite/dp/B09BFTMQH9/ref=sr_1_3?crid=3LWRFLEEH2KVS&keywords=SAMSUNG+S21+FE+5G&qid=1642527916&sprefix=samsung+s21+fe+5g%2Caps%2C753&sr=8-3'] | //span[contains(.,'Samsung Galaxy S21 FE 5G Cell Phone, Factory Unlocked ')]")).click();
		Thread.sleep(5000);
	}

}
