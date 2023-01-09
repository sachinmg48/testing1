package automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class removedropdown {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	ArrayList<String> a = new ArrayList<String>();
	driver.get("file:///C:/Users/ADMIN/Desktop/dropdown.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
	Select s = new Select(ele);
	List<WebElement> options = s.getOptions();
	for(WebElement option:options)
	{
		String text = option.getText();
		a.add(text);
		}
	/*a.remove("dosa");
	for(String o:a)	
	{
		System.out.println(o);
	}*/
	boolean x = a.contains("idly");
	if(x)
	{
		System.out.println("item is present");
	}
	else
	{
		System.out.println("item is not present");
	}
	}
	}
	
	

