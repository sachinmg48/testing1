package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script22 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(2000);
		 driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf 2 trailer");
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.cssSelector("yt-formatted-string[class='style-scope ytd-video-renderer']")).click();
	}
}
