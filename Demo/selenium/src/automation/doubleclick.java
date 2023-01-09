package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleclick {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		/*WebElement s = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		a.doubleClick(s).perform();
		Thread.sleep(2000);*/
		
		WebElement m = driver.findElement(By.xpath("//span[.='right click me']"));
		a.contextClick(m).perform();
				
	}
}
