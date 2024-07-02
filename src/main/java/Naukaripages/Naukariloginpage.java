package Naukaripages;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Naukariloginpage
{
	public static WebDriver driver;
	@FindBy(xpath="//a[text()='Login']")
	public WebElement Loginbtn;
	@FindBy(id="register_Layer")
	public WebElement Registerbtn;
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
	public WebElement Enterusername; 
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	public WebElement Enterpassword;
	@FindBy(xpath="//button[text()='Login']")
	public WebElement login;
	@FindBy(xpath="(//*[@type='submit'])[1]")
	public WebElement completeprofile;
	@FindBy(xpath="//em[text()='editOneTheme']")
	public WebElement pencilbtn;
	@FindBy(id="name")
	public WebElement updatename;
	@FindBy(id="saveBasicDetailsBtn")
	public WebElement savebtn;


	
	public Naukariloginpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		this.driver=driver;
		System.out.println("this driver="+driver);
	}

	public void click_loginbtn() throws InterruptedException
	{
		Thread.sleep(4000);
		System.out.println("driver="+driver);
		WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Login']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Login']")));
		Loginbtn.click();
		System.out.println("loginbtn clicked succesfully ");
	}
	
	public void Click_onRegisterbtn()
	{
		Registerbtn.click();
		System.out.println("clicked on Register btn succesfully");
	}
	
	public void Enter_username(String value)
	{
		Enterusername.sendKeys(value);
		System.out.println("Entered value first name");
	}
	public void Enter_password(String val)
	{
		Enterpassword.sendKeys(val);
		System.out.println("Entered value in password filed");
	}
	
	public void Click_Loginbtn()
	{
		login.click();
		System.out.println("clicked login btn succesfully");
	}
	
	public void Click_oncompletebtn()
	{
		completeprofile.click();
		System.out.println("clicked comple profile btn succesfully");
	}
	public void Click_onpencilbtn()
	{
		pencilbtn.click();
		System.out.println("clicked on pencil  btn succesfully");
	}
	
	public void Click_onupdatename(String name) throws InterruptedException
	{

		Thread.sleep(4000);

		updatename.clear();
		Thread.sleep(4000);
		updatename.sendKeys(name);
		System.out.println("clicked on update name  btn succesfully");
	}
	public void Click_onsavebtn() throws InterruptedException
	
	{
		Thread.sleep(4000);
	
		savebtn.click();
		System.out.println("clicked on save btn succesfully");
		System.out.println("Naukari updated succesfully ");
		//driver.close();
		
	}
	
}
