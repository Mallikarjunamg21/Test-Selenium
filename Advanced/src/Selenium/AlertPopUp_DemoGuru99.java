package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUp_DemoGuru99 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		al.accept();
		//a1.dismiss();
		Alert a2 = driver.switchTo().alert();
		a2.accept();
		
	}

}
