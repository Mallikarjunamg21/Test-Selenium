package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooMail_Compose {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//input[@id='login-username']"));
		login.sendKeys("mgmallikarjuna21@yahoo.com");
		Thread.sleep(2000);
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.xpath("//input[@id='login-passwd']"));
		password.sendKeys("Mallik@21");
		Thread.sleep(2000);
		WebElement next = driver.findElement(By.xpath("//button[@id='login-signin']"));
		next.click();
		driver.findElement(By.xpath("//a[@id='ybarMailLink']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("automateselenium21@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Testing Mail from Mallikarjuna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("Hi Selenium, This message is to test mail YahooMail message from mallikarjuna");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Send this email']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
		Thread.sleep(2000);
		// Check Another Mail 
		
		driver.findElement(By.xpath("//span[.='Mail']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/?.intl=us&.lang=en-US&src=ym&activity=ybar-mail&pspid=2023538075&done=https%3A%2F%2Fmail.yahoo.com%2Fd%3Fpspid%3D2023538075%26activity%3Dybar-mail&add=1']")).click();
		Thread.sleep(2000);
		WebElement login2 = driver.findElement(By.xpath("//input[@id='login-username']"));
		login2.sendKeys("automateselenium21@yahoo.com");
		Thread.sleep(2000);
		WebElement submit2 = driver.findElement(By.xpath("//input[@type='submit']"));
		submit2.click();
		Thread.sleep(2000);
		WebElement password2 = driver.findElement(By.xpath("//input[@id='login-passwd']"));
		password2.sendKeys("Automation@21");
		Thread.sleep(2000);
		WebElement next2 = driver.findElement(By.xpath("//button[@id='login-signin']"));
		next2.click();
		driver.findElement(By.xpath("//span[@title='Testing Mail from Mallikarjuna']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='profile-signout-link']")).click();
		Thread.sleep(2000);
		driver.close();
		
		
		
		
	}

}
