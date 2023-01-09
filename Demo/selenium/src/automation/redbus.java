package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class redbus {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-message='Please enter a destination city']")).sendKeys("mysore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[.='4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Search Buses']")).click();
	}
}
