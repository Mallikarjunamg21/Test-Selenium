package TestNG_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Important_HighLight {

@Test
	public void highlightElement() {
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
        //To launch gmail.com
	driver.get("https://www.facebook.com");
        //Collects the webelement
	WebElement ele = driver.findElement(By.xpath("//input[@id='Email']"));
        //Create object of a JavascriptExecutor interface
	JavascriptExecutor js = (JavascriptExecutor) driver;
        //use executeScript() method and pass the arguments 
        //Here i pass values based on css style. Yellow background color with solid red color border. 
	js.executeScript("border: 1px solid #dddfe2;", ele);
	}
}
