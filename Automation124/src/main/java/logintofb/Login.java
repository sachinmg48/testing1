package logintofb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
@Test
public void test()
{
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
}
}
