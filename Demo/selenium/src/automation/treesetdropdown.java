package automation;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class treesetdropdown {
	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	//TreeSet<String> t=new TreeSet<String>();
	TreeSet<String> t=new TreeSet<String>(Collections.reverseOrder());
	driver.get("file:///C:/Users/ADMIN/Desktop/dropdown.html");
	Thread.sleep(2000);
	WebElement ele = driver.findElement(By.xpath("//select[@id='hotel']"));
	Select s = new Select(ele);
	List<WebElement> options = s.getOptions();
	for(WebElement option:options)
	{
		t.add(option.getText());
	}
    for(String o:t)
    {
    	System.out.println(o);
    }
    }
	}

