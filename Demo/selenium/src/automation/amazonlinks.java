package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class amazonlinks {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./browser files/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_4qsiujpf5j_e&adgrpid=60456322738&hvpone=&hvptwo=&hvadid=486393568006&hvpos=&hvnetw=g&hvrand=17202105670361388455&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-360364908477&hydadcr=14451_2154369&gclid=EAIaIQobChMIpvrYheHT-wIVE4ZLBR0C0gLIEAAYASAAEgJDFPD_BwE");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int size = links.size();
		System.out.println(size);
		for(WebElement d:links)
		{
			System.out.println(d.getText());
		}
	}
		
}
