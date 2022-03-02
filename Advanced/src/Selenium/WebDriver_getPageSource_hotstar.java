package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_getPageSource_hotstar 
{

	public static void main(String[] args) throws Exception {
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hotstar.com");
		String src = driver.getPageSource();
		System.out.println(src);
		

		Thread.sleep(2000);
		driver.close();

	}

}
