package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom {
@FindBy(id="email")
private WebElement username;
@FindBy(id="pass")
private WebElement password;
@FindBy(name="login")
private WebElement btn;

public pom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
public void UN(String un)
{
	username.sendKeys(un);
}
public void PWD(String pwd)
{
	password.sendKeys(pwd);
}
public void BTN()
{
	btn.click();
}
}