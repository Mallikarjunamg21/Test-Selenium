package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_BasicTestCase {

		public static void main(String[] args) throws Exception
		{
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("file://fscrc1/MGM001$/Desktop/htmlsample.html");
			
			driver.findElement(By.id("a1")).sendKeys("NAGA");
			Thread.sleep(2000);
			driver.findElement(By.name("n2")).sendKeys("Mg123579");
			Thread.sleep(2000);
			driver.findElement(By.className("radioButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("check")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("submit")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Forgot")).click();
			

	}

}
