package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script18 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/text1.html");
		Thread.sleep(2000);
		 driver.findElement(By.id("two")).clear();
		 driver.findElement(By.id("two")).sendKeys("XYZ");
		 driver.findElement(By.id("three")).click();
		
	}
}
