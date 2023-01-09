package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childbrowser {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		String pid = driver.getWindowHandle();
		Thread.sleep(2000);
		Set<String> allid = driver.getWindowHandles();
		allid.remove(pid);
		for(String id:allid)
		{
			driver.switchTo().window(id);
			driver.close();
		}
		
	}
}
