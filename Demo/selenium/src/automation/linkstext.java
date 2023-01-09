package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkstext {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[.='✕']"));
		Thread.sleep(2000);
		List<WebElement> eles =driver.findElements(By.xpath("//a"));
		int size = eles.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			WebElement ele = eles.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		}
}
