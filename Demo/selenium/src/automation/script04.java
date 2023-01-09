package automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script04
{
	public static void main(String[] args)
	{
		String key="webdriver.gecko.driver";
		String value="./browser files/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver gx=new FirefoxDriver();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		String key1="webdriver.chrome.driver";
		String value1="./browser files/chromedriver.exe";
		System.setProperty(key1, value1);
		ChromeDriver cx=new ChromeDriver();
		
	}
	}


