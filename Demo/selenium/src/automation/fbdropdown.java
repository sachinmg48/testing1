package automation;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdropdown {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();     
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.id("day"));
		Select s=new Select(ele);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
	for(WebElement option:options)
	{
		String text = option.getText();
		System.out.println(text);
	}
	}
	
	}

