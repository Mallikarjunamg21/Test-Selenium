package Selenium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDescending_ArrayList {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file://fscrc1/MGM001$/My%20Documents/Python%20Docs/Python_Synopsys/Dropdown2.html");
		Thread.sleep(2000);
		ArrayList<String> lis=new ArrayList<String>();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='Meta']"));
		Select sel= new Select(ele);
		List<WebElement> options = sel.getOptions();
		Thread.sleep(2000);
		for (WebElement text : options) 
		{
			String texts = text.getText();
			lis.add(texts);	
		}
		Thread.sleep(2000);
		Collections.sort(lis);
		Collections.reverse(lis);
	    for (String sorted : lis) 
	    {
			System.out.println(sorted);
		}
	    Thread.sleep(2000);
	    driver.close();
		
		

	}

}
