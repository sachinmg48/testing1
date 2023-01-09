package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www,amazon.com");
	}
}
