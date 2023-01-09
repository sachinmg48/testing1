package automation;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class titlenclose {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		/*Set<String> allid = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String id:allid)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			driver.close();
		}*/
		
		String pid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String id:allid)
		{
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(4000);
			if(pid.equals(id))
			{
				driver.close();
			}
			}
			
		
	}
}
