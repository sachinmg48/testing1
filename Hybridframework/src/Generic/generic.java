package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class generic implements frameworkconstant
{
	
	public WebDriver driver;
	@BeforeMethod
public void openapp()
{
	System.setProperty(gk,gv);
	 driver=new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get(URL);
}

@AfterMethod
	 public void closeapp(ITestResult res) throws InterruptedException
	 {
	if(ITestResult.FAILURE==res.getStatus())
	{
		screenshot.capture(driver);
	}
	Thread.sleep(2000);
	driver.quit();
	 }
}

