package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keys {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/TEXT.HTML");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='textfield1']"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"a",Keys.CONTROL+"c");
		Thread.sleep(2000);
		WebElement ale = driver.findElement(By.xpath("//input[@type='textfield2']"));
		ale.sendKeys(Keys.CONTROL+"a",Keys.DELETE, Keys.CONTROL+"v");
	}
}

	