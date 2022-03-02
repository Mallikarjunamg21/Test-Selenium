package TestNG_Scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Launching extends Generic
{
	@Test(invocationCount = 0)
	public void insta() throws InterruptedException
	{
	String url1 = "https://www.instagram.com/";
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("mallikarjunamg21@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='password']")).sendKeys("1234567");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(2000);
	}

	@Test(invocationCount = 4)
	public void facebook() throws InterruptedException
	{
		String url2 = "https://www.facebook.com/";
		driver.findElement(By.name("email")).sendKeys("mallikarjunamg21@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("Shimoga@21");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
}
