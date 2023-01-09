package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class textbox {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/tf.html");
		Thread.sleep(2000);
		List<WebElement> eles = driver.findElements(By.xpath("//input[@type='text']"));
		int size = eles.size();
		System.out.println(size);
		for(WebElement ele:eles)
		{
			ele.sendKeys("hiii");
		}
		for(int i=size-1;i>=0;i--)
		{
			WebElement tf = eles.get(i);
			tf.clear();
			Thread.sleep(2000);
		}
			
		}
}
