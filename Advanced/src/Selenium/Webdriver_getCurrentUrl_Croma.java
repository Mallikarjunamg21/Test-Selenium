package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver_getCurrentUrl_Croma {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.croma.com");
		Thread.sleep(2000);
		String src = driver.getPageSource();
		System.out.println(src);
		Thread.sleep(2000);
		String title = driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
	

		Thread.sleep(2000);
		driver.close();
	}

}
