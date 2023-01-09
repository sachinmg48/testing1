package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class script_no_01
{
public static void main(String[] args)
{
	String key="webdriver.chrome.driver";
	String value="./browser files/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver cx=new ChromeDriver();
}
}
         