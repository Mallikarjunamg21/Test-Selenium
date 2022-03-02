package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_SendKeysCutPaste {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://///FSCRC1/MGM001$/My%20Documents/AD-SELENIUM%20CLASS/HTML%20FILES/Web_element_test.html");
		WebElement ele = driver.findElement(By.xpath("//input[@value='Java']"));
		ele.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@value='Selenium']"));
		ele1.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
	}

}
