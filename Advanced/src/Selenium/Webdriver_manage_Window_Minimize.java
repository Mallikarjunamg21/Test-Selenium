package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_manage_Window_Minimize
{
	public static void main(String[] args)	
	{
				System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com");
				Dimension d = new Dimension(300,300);
				driver.manage().window().setSize(d);		
	}

}


