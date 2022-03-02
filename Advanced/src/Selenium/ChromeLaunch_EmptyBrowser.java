package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeLaunch_EmptyBrowser {

	public static void main(String[] args) throws InterruptedException
	{
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
