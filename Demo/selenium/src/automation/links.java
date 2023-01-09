package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class links 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/ADMIN/Desktop/links.html");
		Thread.sleep(2000);
		List<WebElement> link =driver.findElements(By.xpath("//a"));
		int size = link.size();
		for(int i=0;i<size;i++)
		{
			WebElement ele= link.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		}
}
