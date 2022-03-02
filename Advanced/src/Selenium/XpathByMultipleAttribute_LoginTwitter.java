package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByMultipleAttribute_LoginTwitter
{

	public static void main(String[] args) throws InterruptedException 
		{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("mallikarjunamg21@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='css-18t94o4 css-1dbjc4n r-sdzlij r-1phboty r-rs99b7 r-ywje51 r-usiww2 r-2yi16 r-1qi8awa r-1ny4l3l r-ymttw5 r-o7ynqc r-6416eg r-lrvibr r-13qz1uu']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mallik@21");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='button' and @data-testid='LoginForm_Login_Button']")).click();
		Thread.sleep(2000);
		

	}

}
