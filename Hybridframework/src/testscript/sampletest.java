package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.fetchdata;
import Generic.generic;
import pom.pom;

public class sampletest extends generic
{
@Test
public void test1()
{
	String un=fetchdata.getdata("sheet1", 0, 0);
	String pwd=fetchdata.getdata("sheet1", 0, 1);
	pom p=new pom(driver);
    p.UN(un);
    Assert.fail();
	p.PWD(pwd);
	p.BTN();
}
}
