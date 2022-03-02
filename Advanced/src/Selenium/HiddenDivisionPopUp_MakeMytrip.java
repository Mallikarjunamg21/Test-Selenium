package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopUp_MakeMytrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='headerOuter']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(("//div[@aria-label='Tue Feb 01 2022']"))).click();
		Thread.sleep(2000);
	}

}
