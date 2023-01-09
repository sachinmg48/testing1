package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script24 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("iphone 12");
		 driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("span[class='a-size-medium a-color-base a-text-normal']")).click();
		 
	}
}
