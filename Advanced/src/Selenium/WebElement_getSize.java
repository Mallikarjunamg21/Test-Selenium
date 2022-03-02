package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_getSize 
{

			public static void main(String[] args) throws InterruptedException 
			{
				System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				WebElement ele = driver.findElement(By.xpath("//a[.='తెలుగు']"));
				Thread.sleep(2000);
				//getSize() is used instead of getcssValue() 
				 Dimension link = ele.getSize();
				 int height = link.height;
				 int width = link.width;
				
				System.out.println(link+" Where Height is "+height+" and Width is "+width);

	}

}
