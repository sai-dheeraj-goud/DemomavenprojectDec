package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
//	page object model
	//1. define elements with locators
//	2.define constructors and initialise all the elements
//	3.define the reusable methods all the defined elements
	//@Findby(locator name="locator value")
	@FindBy(name="username")
	 public WebElement userNameTxtbox;
	@FindBy(name="password")
	public WebElement pwdtxtbox;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	public WebElement loginbtn;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//define Reusable method
public void enter_username(String value)
{
	System.out.println("usernametextbox="+value);
	userNameTxtbox.sendKeys(value);
}
	
public void enter_password(String value) 
{	
	System.out.println("enter passwordtextbox="+value);
	pwdtxtbox.sendKeys(value);
}

public void clickloginbtn()
{
	loginbtn.click();
}

public void LoginintoApp(String user, String pwd)
{
	
	enter_username(user);
	
	enter_password(pwd);
	
	clickloginbtn();
	
	
}





//public void LogintoApp(String user, String pwd)
//{
//	enter_username(user);
//	enter_password(pwd);
//	clickloginbtn();
//}





}