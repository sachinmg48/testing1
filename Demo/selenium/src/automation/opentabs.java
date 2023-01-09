package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class opentabs {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		WebElement ele1 = driver.findElement(By.xpath("//span[.='Downloads']"));
		WebElement ele2 = driver.findElement(By.xpath("//span[.='Documentation']"));
		WebElement ele4 = driver.findElement(By.xpath("//span[.='Projects']"));
		ArrayList<WebElement> a=new ArrayList<WebElement>();
		a.add(ele1);
		a.add(ele2);
		a.add(ele4);
		Actions action = new Actions(driver);
		Robot r = new Robot();
		for(WebElement ele:a)
		{
			action.contextClick(ele).perform();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			
		}
	}
}
