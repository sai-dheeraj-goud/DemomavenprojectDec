package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobtestcase
{
	@FindBy(xpath="//span[text()='Admin']")
	public WebElement adminmenu;
	@FindBy(xpath="//*[text()='Job ']")
	public WebElement clickjob;
	
	@FindBy(xpath="//a[text()='Job Titles']")
	public WebElement clickjobTitles;
	
	@FindBy(xpath="//*[text()=' Add ']")
	public WebElement Addbtn;
	
	@FindBy(xpath="//label[text()='Job Title']//parent::div//following-sibling::div/input")
	public WebElement Addjobtitle;
	//label[text()='Job Title']//parent::div//following-sibling::div/input
	
	@FindBy(xpath ="//label[text()='Job Description']/parent::div/following-sibling::div/textarea")
	public WebElement Addjobdescription;
	//label[text()='Job Description']/parent::div/following-sibling::div/textarea
	
	@FindBy(xpath="//button[text()=' Save ']")
	public WebElement clicksavebtn;
	//button[text()=' Save ']
	
	@FindBy(xpath="//div[text()='Mahendra']/parent::div/parent::div/parent::div/following-sibling::div/div/div/button[2]/i")
	public WebElement pencilicon;
	@FindBy(xpath="//label[text()='Note']//parent::div//following-sibling::div/textarea")
	public WebElement Addnote;
	
	
	
	
	
	public  Jobtestcase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//define reusable methods 
	
	public void clickjobbtn()
	{
		clickjob.click();
		System.out.println("clicked on job btn");
	}
	
	public void clickonjobtitlebtn()
	{
		clickjobTitles.click();
		System.out.println("clicked on job Tittle btn ");		
	}
	
	public void clickAddbtn()
	{
		Addbtn.click();
		System.out.println("click on add btn ");
	}
	
	public void clickAddjobTittle(String empname)
	{
		Addjobtitle.sendKeys(empname);
		System.out.println("clicked on Add job Tittle");
	}
	
	public void adddescription(String descript)
	{
		Addjobdescription.sendKeys(descript);
		System.out.println("add discription");
		
	}
	
	public void clicksave()
	{
		clicksavebtn.click();
		System.out.println("clicked on save btn");
	}
	
	public void Updatejob()
	{
		pencilicon.click();
		System.out.println("clicked on pencil btn");
	}
	
	public void clickAddNote(String note)
	{
		Addnote.sendKeys(note);
		System.out.println("added some note in the add note textbox");
	}
	
	
	
	public void adduserisexist(String user) {
		
		if(user.contains(user))
		{
			System.out.println("user is exist");
		}
		else
		{
			System.out.println("user is not exist");
		}
		
	}
}
