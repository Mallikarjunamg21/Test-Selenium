package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Ascending {

	public static void main(String[] args) 
	{
	
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement ele = driver.findElement(By.xpath("//select"));
		Select dropdown= new Select(ele);
		ArrayList<String> lis = new ArrayList<String>();
		List<WebElement> options = dropdown.getOptions();
		int count = options.size();
		System.out.println(count);
		for (WebElement opt: options)
		{
			String optList = opt.getText();
			System.out.println(optList);
		}	
	}

}
