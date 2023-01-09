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

public class tabswitch {
	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    WebElement ele = driver.findElement(By.xpath("//span[.='Downloads']"));
	    Actions action = new Actions(driver);
	    Robot r = new Robot();
	    action.contextClick(ele).perform();
	    r.keyPress(KeyEvent.VK_T);
	    r.keyRelease(KeyEvent.VK_T);
	    Thread.sleep(2000);
	    Set<String> allid = driver.getWindowHandles();
	    ArrayList<String> a = new ArrayList<String>(allid);
	    String tab = a.get(1);
	    driver.switchTo().window(tab);
	    r.keyPress(KeyEvent.VK_ALT);
	    r.keyPress(KeyEvent.VK_SPACE);
	    r.keyRelease(KeyEvent.VK_ALT);
	    r.keyRelease(KeyEvent.VK_SPACE);
	    Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_C);
	    r.keyRelease(KeyEvent.VK_C);
	    Thread.sleep(2000);
	   driver.manage().window().maximize();
	   /* Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_ALT);
	    r.keyPress(KeyEvent.VK_SPACE);
	    Thread.sleep(2000);
	    r.keyPress(KeyEvent.VK_C);
	    r.keyRelease(KeyEvent.VK_ALT);
	    r.keyRelease(KeyEvent.VK_SPACE);
	    r.keyRelease(KeyEvent.VK_C);
	    */
	}
}
