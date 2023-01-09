package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script17 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjY3ODAyMzMwLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		Thread.sleep(2000);
		 driver.findElement(By.id("email")).sendKeys("sachinmg48@gmail.com");
		 driver.findElement(By.id("pass")).sendKeys("sachinmg48");
		 driver.findElement(By.id("loginbutton")).click();
			
			
		
	}
}
		

