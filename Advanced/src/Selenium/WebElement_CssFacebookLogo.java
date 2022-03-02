package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement_CssFacebookLogo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement ele= driver.findElement(By.xpath("//img[@alt='Facebook']"));
		String fontsize = ele.getCssValue("font-size");
		System.out.println("Font size of facebook in login page is "+fontsize);
	}

}
