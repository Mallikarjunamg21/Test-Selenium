package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_getPageSource_bing {

	public static void main(String[] args) throws InterruptedException
	{
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");
		String src = driver.getPageSource();
		System.out.println(src);
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	

		Thread.sleep(2000);
		driver.close();
	}

}
