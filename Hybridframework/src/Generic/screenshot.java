package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshot {
public static void capture(WebDriver driver)
{
	try {
		String path="./screenshot/";
		Date d=new Date();
		String d1 = d.toString();
		String d2 = d1.replaceAll(":","-");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File(path+d2+".pmg");
		
			FileUtils.copyFile(src, dst);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
	
}
}
