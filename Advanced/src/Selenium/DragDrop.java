package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException
	
	{
	
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		WebElement src = driver.findElement(By.xpath("//div[@id='div1']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='div2']"));
		Actions act= new Actions(driver);
		act.dragAndDrop(src, dest);
		
	}

}
