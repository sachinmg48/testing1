package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class isDISPLAYED {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/TEXT.HTML");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='textfield1']"));
		Thread.sleep(2000);
		boolean d = ele.isDisplayed();
		if(d)
		{
			System.out.println("it is dispalyed");
		}
		else
		{
			System.out.println("it is  not dispalyed");
		}
	}
}
		
		

