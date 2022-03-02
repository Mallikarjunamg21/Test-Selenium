package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_ESPNCricinfoBuilding {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Actions mouse= new Actions(driver);
		WebDriverWait wait= new WebDriverWait(driver, 10);
		if(wait.until(ExpectedConditions.urlContains(".com")))
		{
			 System.out.println("Explicit function Working fine");
			 WebElement edition = driver.findElement(By.xpath("//a[.='Edition IN']"));
			 mouse.moveToElement(edition).perform();
			 driver.findElement(By.xpath("//a[.='India']")).click();
			 WebElement amberger = driver.findElement(By.xpath("//i[@class='espn-icon icon-more-after icon-lg nav-link text-light more-options']"));
			 mouse.moveToElement(amberger).perform();
			 driver.findElement(By.xpath("//a[.='About us']")).click();
			 WebElement textvalue = driver.findElement(By.xpath("//div[@class='ciPhotoContainer']/p[10]"));
			 String text = textvalue.getText();
			 System.out.println(text);
			 System.out.println();
			 WebElement textvalueUS = driver.findElement(By.xpath("//div[@class='ciPhotoContainer']/p[9]"));
			 String textUS = textvalueUS.getText();
			 System.out.println(textUS);
			 System.out.println();
			 WebElement textvalueE = driver.findElement(By.xpath("//div[@class='ciPhotoContainer']/p[11]"));
			 String textE = textvalueE.getText();
			 System.out.println(textE);
		}
	}
}