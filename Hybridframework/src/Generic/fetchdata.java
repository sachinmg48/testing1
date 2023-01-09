package Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fetchdata {
public static String getdata(String s,int r,int c)
{


	String value=null;
	
	try {
	FileInputStream	fi = new FileInputStream("./excel/fb1.xlsx");
	Workbook book = WorkbookFactory.create(fi);
	value=book.getSheet(s).getRow(r).getCell(c).toString();
	
	} catch (Exception e) {
		System.out.println(e);
	}
	return value;
	
}
}