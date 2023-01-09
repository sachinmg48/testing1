package automation;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class genricexcel
{
public static String getdata(String sh,int r,int c)
{
String value="";
try{
FileInputStream fis=new FileInputStream("./Excel/testdata.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sheet = book.getSheet(sh);
Row row = sheet.getRow(r);
Cell cell = row.getCell(c);
 value = cell.toString();

}
catch(Exception e)
{
	System.out.println("invalid data");
}
return value;
}

public static void main(String[] args) {
	String data=getdata("Sheet1",0,0);
	System.out.println(data);
}
}
