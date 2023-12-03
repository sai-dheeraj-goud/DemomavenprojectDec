package OrangeHRMSMYINFOpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyInfopage
{	
	@FindBy(xpath="//span[text()='My Info']")
	public WebElement myinfo;
	@FindBy(name="firstName")
	public WebElement firstname;
	@FindBy(name="middleName")
	public WebElement middlename;
	@FindBy(name="lastName")
	public WebElement lastName;
	//input[@type='checkbox']
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement Logindetails;
	
	public MyInfopage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Click_onmyinfo()
	{
		myinfo.click();
	}
	public void Click_onfirstname(String val)
	{
		firstname.sendKeys(val);
		System.out.println("enter name in first name");
	}
	public void Click_onmiddlename(String midval)
	{
		firstname.sendKeys(midval);
		System.out.println("enter name in middle  name");
	}

	public void Click_onlastname(String lastval)
	{
		firstname.sendKeys(lastval);
		System.out.println("enter name in last  name");
	}
	public void Click_onLogindetails()
	{
		Logindetails.click();;
		System.out.println("clcicked on create credentials ");
	}
	
	
	
}
