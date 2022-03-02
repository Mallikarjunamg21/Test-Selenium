package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(2000);	
		WebElement frames = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		Thread.sleep(2000);	
		driver.switchTo().frame(frames);
		WebElement text1 = driver.findElement(By.xpath("//h1[.='This is a sample page']"));
		String text = text1.getText();
		System.out.println(text);
		Thread.sleep(2000);	
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.switchTo().frame("frame2");
		WebElement text2 = driver.findElement(By.xpath("//h1[.='This is a sample page']"));
		String texts = text2.getText();
		System.out.println(texts);
		
		
	}
}
