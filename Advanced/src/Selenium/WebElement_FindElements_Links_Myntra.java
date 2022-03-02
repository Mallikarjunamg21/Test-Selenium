package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_FindElements_Links_Myntra
{
public static void main(String[] args) throws InterruptedException
{
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.myntra.com/");
			Thread.sleep(2000);
			List<WebElement> ele = driver.findElements(By.xpath("//a"));
			Thread.sleep(2000);
			int count = ele.size();
			System.out.println(count);
			Thread.sleep(2000);
			for (WebElement li : ele)
			{
				String links = li.getAttribute("href");
				String Name = li.getText();
				System.out.println(Name+" : "+links);
			}
			Thread.sleep(2000);
			driver.close();

	}

}
