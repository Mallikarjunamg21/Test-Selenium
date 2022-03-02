package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://tus.io/demo.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		ele.sendKeys("C://Users/MGM001/Downloads/SeleniumUrl's.txt");
		Thread.sleep(2000);
	}
}
