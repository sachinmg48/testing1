package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollbar2 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		for(int i=1;i<=3;i++)
		{
			jse.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
		}
		for(int i=1;i<=3;i++)
		{
			jse.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(2000);

		}
	}
}
	
