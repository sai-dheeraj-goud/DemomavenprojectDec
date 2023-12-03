package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class orhmeducationpage//@FindBy(xpath='//a[text()='Manager']')
{
	
	public static WebDriver driver;
	@FindBy(xpath="//*[text()='Qualifications ']")
	public WebElement Qualification;

	@FindBy(xpath="//a[text()='Education']")
	public WebElement Education;

	@FindBy(xpath="//*[text()=' Add ']")
	public WebElement Add;
	@FindBy(xpath="//label[text()='Level']//parent::div//following-sibling::div/input")
	public WebElement Textbox;
	@FindBy(xpath="//*[text()=' Save ']")
	public WebElement save;
	////div[text()='B.Tech']/ancestor::div[@class='card-item card-header-slot-content --left']/following-sibling::div//i[@class='oxd-icon bi-pencil-fill']
	@FindBy(xpath="(//div[text()='B.Tech']/following::div//i[@class='oxd-icon bi-pencil-fill'])[1]")
	public WebElement pencilbtn;

	@FindBy(xpath="//label[text()='Level']//parent::div//following-sibling::div/input")
	public WebElement updatejob;
	
	@FindBy(xpath="//div[text()='B.Tech1']")
	public WebElement verifyqualification;

	public orhmeducationpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void click_Qualificationbtn()
	{
		Qualification.click();
		System.out.println("click on Qualification btn");
	}
	public void Click_educationbtn()
	{
		Education.click();
		System.out.println("click on Education btn");
	}

	public void Click_Addbtn()
	{
		Add.click();
		System.out.println("add click btn");
	}

	public void Enter_val(String val)
	{
		Textbox.sendKeys(val);
		System.out.println("enter some value ="+val);
	}
	public void Click_onsavebtn()
	{
		save.click();
		System.out.println("click on save btn ");
	}

	public void clickon_pencilbtn() 
	{
		pencilbtn.click();
		System.out.println("click on pencil btn ");
	}

	public void clickon_updatejob(String value) throws InterruptedException
	{
		updatejob.clear();
		Thread.sleep(3000);
		System.out.println("clear job");
		updatejob.sendKeys(value);
		System.out.println("enter new value in job="+value);
	}

	
	
	
	
	
		
			
			
		
	}









