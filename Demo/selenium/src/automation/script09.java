package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script09
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
	WebDriver	 driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://www.naukri.com");
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);

}
}
