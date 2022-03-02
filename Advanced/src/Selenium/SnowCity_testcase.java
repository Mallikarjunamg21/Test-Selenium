package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SnowCity_testcase {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Users\\MGM001\\AppData\\Local\\Mozilla Firefox\\Firefox.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://snowcityblr.com/");
		driver.findElement(By.xpath("(//span[.='Contact Us'])[1]")).click();
		Thread.sleep(2000);
		WebElement dir = driver.findElement(By.xpath("//iframe[@class='neptunus_resize trx_addons_resize']"));
		driver.switchTo().frame(dir);
		Thread.sleep(5000);
		WebElement direction = driver.findElement(By.xpath("//a[@class='navigate-link']"));
		Thread.sleep(2000);
		direction.click();
		
		
		
		
	}

}
