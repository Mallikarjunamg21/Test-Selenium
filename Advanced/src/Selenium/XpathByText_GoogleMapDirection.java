package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByText_GoogleMapDirection {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='Directions']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Bengaluru");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='directions-searchbox-0']/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Choose destination, or click on the map...']")).sendKeys("Shivamogga");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='directions-searchbox-1']/button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Details']")).click();
		Thread.sleep(3000);
		driver.getTitle();
		Thread.sleep(3000);
		//driver.close();
		
	}

}
