package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script06
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./browser files/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(4000);
	driver.close();
	driver.quit();
}
}
