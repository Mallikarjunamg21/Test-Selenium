package TestNG_Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Amazon_SearchItem extends Generic_Amazon
{
	@Test
	public void search()
	{
	driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Samsung S21 FE 5G");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	
	//error due to scroll bar issue
	driver.findElement(By.xpath("//a[@href='/Samsung-Unlocked-Smartphone-Intelligent-Graphite/dp/B09BFTMQH9/ref=sr_1_3?crid=3LWRFLEEH2KVS&keywords=SAMSUNG+S21+FE+5G&qid=1642527916&sprefix=samsung+s21+fe+5g%2Caps%2C753&sr=8-3'] | //span[contains(.,'Samsung Galaxy S21 FE 5G Cell Phone, Factory Unlocked ')]")).click();
	
	}
}
