package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame_3 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(2000);	
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);	
		driver.switchTo().frame(0);
		Thread.sleep(2000);	
		WebElement frames = driver.findElement(By.xpath("//p[.='Child Iframe']"));
		String text = frames.getText();
		System.out.println(text);
		Thread.sleep(2000);	
		driver.switchTo().parentFrame();
		WebElement parentvalue = driver.findElement(By.xpath("//body[.='Parent frame']"));
		String parentname = parentvalue.getText();
		System.out.println(parentname);	
		driver.switchTo().defaultContent();
	}

}
