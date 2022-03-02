package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_getText {

			public static void main(String[] args) throws InterruptedException 
			{
				System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/");
				Thread.sleep(2000);
				WebElement ele = driver.findElement(By.xpath("//a[.='తెలుగు']"));
				Thread.sleep(2000);
				String link = ele.getText();
				
				System.out.println(link);

	}

}
