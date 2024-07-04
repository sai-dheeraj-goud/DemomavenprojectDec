package OrangeHRMSMYINFOpage;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.utility.RandomString;

public class PIMpage 
{

	public static WebDriver driver;

	@FindBy(xpath="//span[text()='PIM']")//Sanjhfufik
	public WebElement pim;
	@FindBy(xpath="//button[text()=' Add ']")
	public WebElement Addbtn;
	@FindBy(name="firstName")
	public WebElement firstname;
	@FindBy(name="middleName")
	public WebElement middlename;
	@FindBy(name="lastName")
	public WebElement lastName;
	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement checkbox;

	@FindBy(xpath="//label[text()='Username']/parent::div/following-sibling::div/input")
	public WebElement username;


	@FindBy(xpath="//label[text()='Password']/parent::div/following-sibling::div/input")
	public WebElement password;

	@FindBy(xpath="//label[text()='Confirm Password']/parent::div/following-sibling::div/input")
	public WebElement confirmpassword;

	@FindBy(xpath="//button[text()=' Save ']")
	public WebElement savebtn;

	@FindBy(xpath="//label[text()='License Expiry Date']/parent::div/following-sibling::div/div/div/input")
	public WebElement Licenseexpirydate;

	@FindBy(xpath="(//label[text()='Nationality']/parent::div/following-sibling::div//div[text()='-- Select --']/parent::div//i")
	public WebElement selectnationalitydropdown;
	//@FindBy(xpath="(//div[text()='-- Select --'])[1]//[*text()='India']'")


	@FindBy(xpath="//label[text()='Nationality']/parent::div/following-sibling::div//div[text()='-- Select --']/parent::div//i//[*text()='India']'")
	public WebElement selectIndiandropdown;

	@FindBy(xpath="//label[text()='Marital Status']/parent::div/following-sibling::div//div[text()='-- Select --']/parent::div//i")
	public WebElement martialstatus;

	@FindBy(xpath="//label[text()='Marital Status']//parent::div//following-sibling::div//i//div[@role='listbox']//*[text()='Single']")
	public WebElement selectsinglebtn;

	@FindBy(xpath="//*[text()='Female']")
	public WebElement femalebtn;


	//p[text()=' * Required']/parent::div//button[text()=' Save ']
	@FindBy(xpath="//p[text()=' * Required']/parent::div//button[text()=' Save ']")
	public WebElement finalsavebtn;

	@FindBy(xpath="//label[text()='Blood Type']/parent::div/following::div//div[text()='-- Select --']/parent::div//i")
	public WebElement Bloodgroup;

	
	@FindBy(xpath="//label[text()='Blood Type']/parent::div/following::div//div[text()='-- Select --']/parent::div//i//div[@role='listbox']//*[text()='B+']")
	public WebElement Bbloodgroup;

	@FindBy(xpath="(//button[text()=' Save '])[2]")
	public WebElement savingform;
	
	public PIMpage(EdgeDriver driver) 
	{

		PageFactory.initElements(driver, this);
		this.driver=driver;
	}





	public void Click_onpimbtn()
	{
		pim.click();
		System.out.println("clicked on pim page");
	}
	public void Click_onAddbtn()
	{
		Addbtn.click();
		System.out.println("clicked on Add btn");

	}
	public void Enter_name(String fname ,String mname,String lname ) throws InterruptedException
	{
		RandomString r = new RandomString();
		String randomString = r.make();
		fname = fname + randomString;
		mname = mname + randomString;
		lname = lname + randomString;
		firstname.sendKeys(fname);
		System.out.println("enter first name succesfully ");
		middlename.sendKeys(mname);
		System.out.println("enter middle name succesfully ");
		lastName.sendKeys(lname);
		System.out.println("enter last name succesfully ");
		//WebDriverWait wait =new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));

		try 
		{
			checkbox.click();
		} 
		catch (ElementClickInterceptedException e)
		{
			System.out.println("got ElementClickInterceptedException. Click using actions class");
			Actions act = new Actions(driver);
			act.moveToElement(checkbox).click(checkbox).perform();
			System.out.println("clicked on checkbox  succesfully ");
			Thread.sleep(3000);
		}

	}
	public void Enter_username(String user) throws InterruptedException
	{
		RandomString r = new RandomString();
		user =user+r.make();
		username.sendKeys(user);
		System.out.println("usernmae entered succesfully" );
		Thread.sleep(3000);
	}
	public void Enter_password(String pwd) throws InterruptedException
	{
		Thread.sleep(3000);
		password.sendKeys(pwd);
		System.out.println("entered password succesfully ");
	}
	public void Enter_confirmpassword(String conpwd) throws InterruptedException
	{

		Thread.sleep(3000);
		confirmpassword.sendKeys(conpwd);
		System.out.println("entered confirm password succesfully ");
	}
	public void Click_onsavebtn() throws InterruptedException
	{
		Thread.sleep(4000);
		savebtn.click();
		System.out.println("clicked on save button succesfully ");
	}

	public void Click_onLicennsedate(String date) throws InterruptedException
	{
		Thread.sleep(4000);
		Licenseexpirydate.sendKeys(date);;
		System.out.println("Entered date of birthdate  succesfully ");
	}


	public void Click_onselectindianbtn() throws InterruptedException
	{	
		Thread.sleep(3000);
		WebElement  nationalitydropdown =driver.findElement(By.xpath("//label[text()='Nationality']/parent::div/following-sibling::div//div[text()='-- Select --']/parent::div//i"));
		//		WebDriverWait wait = new WebDriverWait(driver, 20);
		//		wait.until(ExpectedConditions.elementToBeClickable(nationalitydropdown));
		nationalitydropdown.click();
		System.out.println("clicked on nationality dropdown button succesfully ");
	}

	public void SelectIndianondropdown(String val) throws InterruptedException
	{
		Thread.sleep(4000);
		//		WebElement nationalitybtn= 	driver.findElement(By.xpath("//div[@role='listbox']//*[text()='Afghan']"));
		//
		//				nationalitybtn.click();


		//or 
		//		WebElement nationalitybtn= 	driver.findElement(By.xpath("//div[@role='listbox']//*[text()='"+val+"']"));
		//
		//		nationalitybtn.click();

		// or 

		WebElement nationalitybtn= 	driver.findElement(By.xpath("//div[@role='listbox']//*[text()='"+val+"']"));
		JavascriptExecutor  jse =  (JavascriptExecutor) driver ;
		Thread.sleep(4000);
		jse.executeScript("arguments[0].scrollIntoView();",nationalitybtn);
		Thread.sleep(4000);
		nationalitybtn.click();

		//		Actions act = new Actions(driver);
		//		act.sendKeys(Keys.CONTROL).sendKeys("i").perform();
		//		act.sendKeys(Keys.ENTER).perform();

		System.out.println("selcted indian drop down succesfully ");
	}


	public void Click_onMartialstatus() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement statusbtn =driver.findElement(By.xpath("//label[text()='Marital Status']/parent::div/following-sibling::div//div[text()='-- Select --']/parent::div//i"));

		Actions act = new Actions(driver);
		act.moveToElement(statusbtn).click().perform();
		//statusbtn.click();
		System.out.println("martial status clicked  on Successfully ");
	}



	public void Click_onSinglebtn(String status) throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement singlebtn= 	driver.findElement(By.xpath("//div[@role='listbox']//*[text()='"+status+"']"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(singlebtn));

		singlebtn.click();
		System.out.println("Selecte single status clicked  on Successfully ");
	}

	public void Click_onFemalebtn() throws InterruptedException
	{
		Thread.sleep(4000);
		femalebtn.click();
		System.out.println("clicked on female radio btn ");
	}

	public void Click_onFinalsavebtn() throws InterruptedException
	{
		Thread.sleep(4000);
		finalsavebtn.click();
		System.out.println("clicked on Final save  btn ");
	}
	
//	public void Click_onbloodgroup()
//	{
//		Bloodgroup.click();
//		System.out.println("clicked on blood group");
//	}
//	
//	public void Click_onBbloodgroup(String value1)
//	{
//		
//	WebElement clickonbpostive =	driver.findElement(By.xpath("//label[text()='Blood Type']/parent::div/following::div//div[text()='-- Select --']/parent::div//i//div[@role='listbox']//*[text()='"+value1+"']"));
//	clickonbpostive.click();
//		System.out.println("clicked on b+ group");
//	}
	
	public void Click_onSavingform()
	{
		savingform.click();
		System.out.println("Finally saved form group");
	}
	
	
	
	
	
	
}