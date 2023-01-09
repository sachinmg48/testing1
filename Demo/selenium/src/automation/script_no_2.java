package automation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class script_no_2
{
	
	public static void main(String[] args)
	{
		String key="webdriver.gecko.driver";
		String value="./browser files/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver gx=new FirefoxDriver();
	}
	}


