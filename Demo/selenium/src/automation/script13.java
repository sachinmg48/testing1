package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script13 {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/ADMIN/Desktop/sample.html");
		Thread.sleep(5000);
		driver.findElement(By.className("c1")).click();
		Thread.sleep(4000);
		driver.close();
}
}