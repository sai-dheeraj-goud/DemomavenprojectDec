package pages;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class naukariloginpage 
{
	public WebDriver driver;
	//1.define elements 
	//2.define constructore 
	//3.develop reusable methods
	
	@FindBy(id="usernameField")
	public WebElement enterusename;
	
	@FindBy(id="passwordField")
	public WebElement enterpwd;
	
	@FindBy(xpath="//button[text()='Login']")
	public WebElement loginbtn;
	//span[text()='Sign in with Google']
	
	@FindBy(xpath="//span[text()='Sign in with Google']")
	public WebElement googlesearchbtn;

	


public  naukariloginpage(EdgeDriver driver)
{
	PageFactory.initElements(driver, this);
}


//
//public void Enter_username(String username)
//
//{
//	
//	enterusename.sendKeys(username);
//	System.out.println("enter user name succesfully");
//}
//
//public void Enter_pwd(String pwd)
//{
//	enterpwd.sendKeys(pwd);
//}
//
//public void Cliclloginbtn()
//{
//	loginbtn.click();
//}

public void Cliclsearchnbtn()
{
	googlesearchbtn.click();
	
}

public void multiplewindow()
{
	Set<String> allbrowserwindowadress= 	driver.getWindowHandles();
	
int browsercnt =	allbrowserwindowadress.size();
	System.out.println("browsercnt="+browsercnt);
	
}





}


