package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_IsEnabled {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file://///FSCRC1/MGM001$/My%20Documents/AD-SELENIUM%20CLASS/HTML%20FILES/Web_element_test.html");
		WebElement ele = driver.findElement(By.xpath("//input[@value='Sunday']"));
		//ele.isEnabled();
		if(ele.isEnabled())
		{
			System.out.println("Yes, Is enabled");
		}
		else
		{
			System.out.println("Ohh No, Is disabled");
		}
	}

}
