package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElement_IsSelected {

	public static void main(String[] args) throws InterruptedException 
	{

		{

			System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
			System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
			WebDriver driver=new FirefoxDriver();
			driver.get("file://///FSCRC1/MGM001$/My%20Documents/AD-SELENIUM%20CLASS/HTML%20FILES/Web_element_test.html");
			WebElement ele = driver.findElement(By.xpath("//input[@type='checkbox']"));
			ele.click();
			Thread.sleep(2000);
			//when checkbox is checked)
			if(ele.isSelected())
			{
				System.out.println("Yes, checkbox is Selected");
			}
			else
			{
				System.out.println("No, Please click the checkbox to select");
			}
		}

	}

}
