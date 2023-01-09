package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script28 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=ym&activity=mail-direct&pspid=159600001&done=https%3A%2F%2Fin.mail.yahoo.com%2Fd&add=1");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("sachinmg45");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("4mc15cv048");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='login-signin']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/d/compose/']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("sachinmg45@yahoo.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("i love you");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[.='Send']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@data-test-id='primary-btn']")).click();
	}
}

