package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartAddToCart {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("samsung");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F22 (Denim Black, 64 GB)']")).click();
		Thread.sleep(2000);
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> indexed = new ArrayList<String>(ids);
		Thread.sleep(2000);
		String samsung = indexed.get(1);
		Thread.sleep(2000);
		driver.switchTo().window(samsung);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']")).sendKeys("560057");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(2000);
		// to close the browser without close method
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_C);
		
	}

}
