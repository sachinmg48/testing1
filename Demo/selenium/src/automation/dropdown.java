package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/dropdown.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
		Select s = new Select(ele);
		Thread.sleep(2000);
		s.selectByIndex(0);
		Thread.sleep(2000);
		s.selectByValue("k");
		Thread.sleep(2000);
		s.selectByVisibleText("vada");
		Thread.sleep(2000);
		s.deselectAll();
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("multi select dropdown");
		}
		else
		{
			System.out.println("single select dropdown");
		}
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
		for(WebElement ela:options)
		{
			String text = ela.getText();
			System.out.println(text);
		}
		}
	}
	
		

