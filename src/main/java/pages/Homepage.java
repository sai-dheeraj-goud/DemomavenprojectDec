package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
public WebDriver driver;
	//1. define all elements with locators
	//2
	@FindBy(className="oxd-userdropdown-img")

	public WebElement profileimg;//Sanjeeva

	
	@FindBy(xpath="//span[text()='Admin']")
	public WebElement adminmenu;
	
	@FindBy(xpath="//span[text()='PIM']")
	public WebElement PIMmenu;
	
	@FindBy(xpath="//span[text()='Leave']")
	public WebElement LeaveMenu;
	
	@FindBy(xpath="//span[text()='Time']")
	public WebElement Timemenu;
	
	@FindBy(xpath="//span[text()='Recruitment']")
	public WebElement Recruitmentmenu;
	
	@FindBy(xpath="//h5[text()='System Users']")
	public WebElement systemusers;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement pressaddbtn;
	
	@FindBy(xpath="//h6[text()='Add User']")
	public WebElement   verifyAdduserpage;
	
	@FindBy(xpath="//label[text()='User Role']/parent::div/following-sibling::div")
	public WebElement	userroledropdown;
	
	
	@FindBy(xpath="//div[@role='listbox']//*[text()='Admin']")
	public WebElement selectadmin;
	
	@FindBy(xpath="//*[@placeholder='Type for hints...']")
	public WebElement entervalinemp;
	
	@FindBy(xpath="//label[text()='Status']/parent::div/following-sibling::div")///parent::div/following-sibling::div")
	public WebElement statusArrowbtn;
//	@FindBy(xpath="//label[text()='Status']/parent::div/following-sibling::div")
//	public WebElement statusArrowbtn;

	
	//@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-input--error']")
		@FindBy(xpath="//label[text()='Username']/parent::div/following-sibling::div/input")
		public WebElement UsernameTxtbox;
		
		
		
		@FindBy(xpath="//label[text()='Password']/parent::div/following-sibling::div/input")	
		public WebElement PasswordTxtbox;
		
		
		@FindBy(xpath="//label[text()='Confirm Password']/parent::div/following-sibling::div/input")
		public WebElement ConfirmPasswordTxtbox;
		

		
		@FindBy(xpath="//button[@type='submit']")
		public WebElement saveBtn;
		
		@FindBy(xpath="//button[@type='submit']")
		public WebElement searchBtn;
		
		
		@FindBy(xpath="//span[text()='No Records Found']")
		public WebElement norecordFoundMsg;
		
		//div[@role='rowgroup'][@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='David.Morris']
		@FindBy(xpath="//span[text()='No Records Found']")
		public WebElement norecordFoundMsg1;
		
		
		
		@FindBy(xpath="//p[text()='The selected record will be permanently deleted. Are you sure you want to continue?']")
		public WebElement deleteRecordMsg;
		
		
		@FindBy(xpath="//i[@class='oxd-icon bi-trash oxd-button-icon']")
		public WebElement yesDeleteBtn;
		
		
		
	
	
	
	
	
	
//	2.define constructor 
	
	public Homepage(EdgeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	3.develop the reusable methods andutilise this 
	
	public void ishomepagedisplayed()
	{
	boolean res= 	profileimg.isDisplayed();
	
	if(res)
	{
		System.out.println("login is succesfull");
	}
	else
	{
		System.out.println("login is not  succesfull");

	}
	
}
	public void  NavigatetoAdminMenu()
	{
		System.out.println("click admin menu at left side top");
		adminmenu.click();
	}
	
	public void  NavigatetoPIMMenu()
	{
		System.out.println("click PIM menu at left side top");
		PIMmenu.click();
	}
	
	public void NavigatetoLeavepage()	{
		System.out.println("click Leave menu at left side top");
		LeaveMenu.click();
	}
	
	public void NavigatetoTimepage()
	{
		System.out.println("click Time menu at left side top");
		Timemenu.click();
	}
	
	public void NavigatetoRecrutmentmenu()
	{
		System.out.println("click Time menu at left side top");
		Recruitmentmenu.click();
	}
	
	
	public void verifysystemuserpageisdisplayed()
	{
		if(systemusers.isDisplayed())
		{
			System.out.println("system users page displayed succesfully");
		}
		
		else
		{
			System.out.println("system users page not  displayed succesfully");
		}
	}

	public void clickaddbtn()
	{
		System.out.println("click add btn in sysytem users");
		pressaddbtn.click();
		
	}
	
	public void verifAdduser()
	{
		if(verifyAdduserpage.isDisplayed())
		{
			System.out.println("verify add user page is displayed");
		}
		else
		{
			System.out.println("verify add user page is not displayed");
		}
	}
	
	public void clickuseroledropdown()
	{
		System.out.println("click the drop ele");
		userroledropdown.click();
	}
	
	public void clickadmindropdown()

	{
		System.out.println("click admin dropdown ");
		selectadmin.click();
	}
	
	public void EntervalueinEmployeename(String empname)
	{
		System.out.println("Enter some value in the employee name");
		entervalinemp.sendKeys(empname);
		//driver.findElement(By.xpath("//*[text()='Orange  Test']")).click();
	}
	// Select some status =Enabled
//	selectStatus("Enabled")
//	selectStatus("Disabled");
	public void selectStatus(String status) throws InterruptedException
	{
		System.out.println("select status="+ status);
		
		statusArrowbtn.click();
		Thread.sleep(3000);
//		statusvalue.click();		
		
		driver.findElement(By.xpath("//div[@role='listbox']//*[text()='" +status+  "']")).click();
		
	}

	// Type some value in user name text box 
	// EnterValueInUserName("RamaRao");
	public void EnterValueInUserName(String username) throws InterruptedException
	{
		System.out.println("enter user name="+ username);
		UsernameTxtbox.sendKeys(username);
		Thread.sleep(3000);
		
	}
	
	// Type some value in password  text box
//	EnterValueInPassword("Test@123321")
	public void EnterValueInPassword(String pwd) throws InterruptedException
	{
		System.out.println("enterpwd="+ pwd);
		PasswordTxtbox.sendKeys(pwd);
	}
	
//// Type some value in Confirm password  text box
	//EnterValueInConfirmPassword("Test@123321")
	public void EnterValueInConfirmPassword(String confirmPwd) throws InterruptedException
	{
		ConfirmPasswordTxtbox.sendKeys(confirmPwd);
	}
	
	// clikc on Save button
	public void ClickSaveBtn() throws InterruptedException
	{
		System.out.println("click save button");
		saveBtn.click();
	}
	
	public void searchForGivenUser(String userName ) throws InterruptedException
	{
		Thread.sleep(7000);
		System.out.println("Enter userName="+ userName);
		UsernameTxtbox.sendKeys(userName);	
//		
//		// click Seacrh button			
		searchBtn.click();	
		
		//div[@class='oxd-table-body']//*[text()='RamaRao1']
		String myxpath = "//div[@role='table']//div[text()='"+userName+ "']";
//		
		try {
			boolean  userDisplayed= driver.findElement(By.xpath(myxpath)).isDisplayed();
//			
			if(userDisplayed)
			{
				System.out.println("User name ="+ userName + " is displayed in table");
			}
			else
			{
				System.out.println("User name ="+ userName + " is not displayed in table");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("User name ="+ userName + " is not displayed in table");
		}
	
		
	}
	
	public void clickSearchBtn()
	{
		System.out.println("Click Search btn");
		searchBtn.click();
	}
	
	public void isNoRecordMsgDisplayed()
	{
		try
		{
			if(norecordFoundMsg.isDisplayed())
			{
				System.out.println("No Records Found Msg is Displayed");
			}
			else
			{
				System.out.println("No Records Found Msg is not Displayed");
			}
		}
		catch (Exception e) {
			System.out.println("No Records FoundMsg is not Displayed");
		}	
		
	}
	
	public void selectCheckboxForGivenUser(String user) throws InterruptedException
	{			
		String myxpath="//div[@role='rowgroup'][@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='" +user+ "']/../preceding-sibling::div//input";
		// Error:
//		String myxpath="//div[@role='rowgroup'][@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='" +user+ "']/../preceding-sibling::div//input/..";
		System.out.println("Select checkbox for user="+ user);
		Thread.sleep(4000);
		
//		driver.findElement(By.xpath(myxpath)).click();
		// JSE 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement checkboxEle= driver.findElement(By.xpath(myxpath));
		jse.executeScript("arguments[0].click();", checkboxEle);
		
	}
	
	public void deleteUser(String user) throws InterruptedException
	{
		Thread.sleep(2000);
		String myxpath="//div[@role='rowgroup'][@class='oxd-table-body']//div[@role='row']/div[2]/div[text()='" +user+"']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']";
		System.out.println("click Delete image icon for user="+ user);
		driver.findElement(By.xpath(myxpath)).click();				
	}
	
	public void isDeleteConfirmationMsgDisplayed() throws InterruptedException
	{
		Thread.sleep(2000);
		if(deleteRecordMsg.isDisplayed())
		{
			System.out.println("The selected record will be permanently deleted. Are you sure you want to continue? msg is displayed");
			
		}
		else
		{
			System.out.println("Fail.The selected record will be permanently deleted. Are you sure you want to continue? msg is   not displayed");
		}
		
	}
	
	public void clickYEsDeleteBtn() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("click Yes delete btn");
		yesDeleteBtn.click();
	}
	
	public void searchForInvalidUser(String userName) throws InterruptedException
	{
		Thread.sleep(5000);
		System.out.println("Enter userName="+ userName);
		UsernameTxtbox.sendKeys(userName);	
//		
//		// click Seacrh button			
		searchBtn.click();	
		
		isNoRecordMsgDisplayed();		
		
	}
	
	
	
	
	
}
