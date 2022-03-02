package Selenium;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.common.io.FileUtils;

public class WebDriver_getTitle_Amazon 
{
	public static void main(String[] args) throws InterruptedException
			{
				String key = "webdriver.chrome.driver";
				String value = "./Softwares/chromedriver.exe";
				System.setProperty(key, value);
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.com");
				String src = driver.getPageSource();
				System.out.println(src);
				String title = driver.getTitle();
				System.out.println(title);
				String url = driver.getCurrentUrl();
				System.out.println(url);
				Thread.sleep(2000);
				driver.close();
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src1= ts.getScreenshotAs(OutputType.FILE);
				//File dest= new File(photo+d2+".jpeg");
				FileUtils.copyFile(src1, new File("C:\\test.jpeg"));
				
	}

}
