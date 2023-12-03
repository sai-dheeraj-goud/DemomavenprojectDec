package OpenMrs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import net.bytebuddy.jar.asm.commons.TryCatchBlockSorter;
import net.bytebuddy.utility.RandomString;

public class Loginpage 
{

	public static WebDriver driver;

	@FindBy(id="username")
	public WebElement username;

	@FindBy(xpath="//button[text()='Continue']")
	public WebElement continues;
	@FindBy(id="password")
	public WebElement password;

	@FindBy(xpath="//span[text()='Log in']")
	public WebElement loginbtn;

	@FindBy(id="search-1")
	public WebElement searchbtn;
	@FindBy(xpath="//span[text()='Outpatient Clinic']")
	public WebElement outpatient;
	@FindBy(xpath="//span[text()='Confirm']")
	public WebElement confirmbtn;
//	public WebElement verify;
	//@FindBy(xpath="//span[text()='Vérifier']")
	@FindBy(name="AddPatientIcon")
	public WebElement Addpatient;

	@FindBy(xpath="(//span[text()='Yes'])[1]")
	public WebElement yesbtn;
	
	@FindBy(id="givenName")
	public WebElement otpusername;
	//middleName
	
	@FindBy(id="middleName")
	public WebElement otpmiddlename;

	@FindBy(id="familyName")
	public WebElement otpfamilyname;
	////span[text()='Male']
	

	@FindBy(xpath="//span[text()='Male']")
	public WebElement malebtn;

	@FindBy(xpath="(//span[text()='Yes'])[1]")
	public WebElement dateofbirthyesbtn;
	
	@FindBy(xpath="//span[@class='flatpickr-day today cds--date-picker__day']")
	public WebElement enterdateofbirth;
	
	@FindBy(xpath="//input[@name='identifiers.nin.identifierValue']")
	public WebElement Embg;

	@FindBy(xpath="//button[text()='Add Relationship']")
	public WebElement Addrelationshipbtn;
	
	@FindBy(xpath="//button[text()='Add Relationship']")
	public WebElement Addrelationshipbtnusrname;

	//	//select[@id='selectLocale']
	//	@FindBy(xpath="//select[@id='selectLocale']")
	//	public WebElement relationship;
	//	//button[text()='Register Patient']

	@FindBy(xpath="//button[text()='Register Patient']")
	public WebElement Registerpatient;

	//button[@name='SearchPatientIcon']	
	@FindBy(xpath="//button[@name='SearchPatientIcon']	")
	public WebElement Searchpatient;

	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}



	public  void Loginto_Application(String val ,String value,String outpat) throws InterruptedException
	{
		username.sendKeys(val);
		System.out.println("enter user name succesfully");
		continues.click();
		password.sendKeys(value);
		System.out.println("enter password succesfully");
		loginbtn.click();
		System.out.println("clicked login succesfully");
		searchbtn.sendKeys(outpat);
		Thread.sleep(3000);
		outpatient.click();
		System.out.println("clicked on Outpatient btn");
		
		confirmbtn.click();
		System.out.println("clicked on confirm btn");
		
	}

	
		
	

	public void click_onverifybtn()
	{
		confirmbtn.click();
		System.out.println("clicked on confirm btn");
	}
	public void click_onAddpatientbtn()
	{
		Addpatient.click();
		System.out.println("clicked on Add patient  btn");
	}
	public void click_onYesbtn()
	{
		yesbtn.click();
		System.out.println("clicked on yes patient  btn");
	}

	public void otpusername(String firtsname)
	{
		//		RandomString r = new RandomString();
		//		firtsname = firtsname + r.make();
		otpusername.sendKeys(firtsname);
		System.out.println("Enter use name  succesfully ");
	}
	public void otpmiddlename(String mid)
	{
		//		RandomString r = new RandomString();
		//				mid = mid+ r.make();
		otpmiddlename.sendKeys(mid);
		System.out.println("Enter middle name succesfully ");
	}

	public void otpfamilyname(String fami)
	{
//		RandomString r = new RandomString();
//		fami = fami+ r.make();
		otpfamilyname.sendKeys(fami);
		System.out.println("Enter family name succesfully ");
	}


	public void click_onmalebtn() throws InterruptedException
	{		

		WebDriverWait w = new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Male']")));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		//WebElement malebtn=	driver.findElement(By.xpath("//span[text()='Male']"));

		try {
			act.click(malebtn).perform();
			System.out.println("clicked male radio btn first time");
		}
		catch (MoveTargetOutOfBoundsException me) {
			//  clcik by diff way
			System.out.println("Click male radio button using actions class");
			Thread.sleep(1000);
			w.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Male']")));
			act.moveToElement(malebtn).click().perform();
		}


		//malebtn.click();
		System.out.println("Clicked succesfully  on male radio btn");



	}

	public void click_ondateofbirthyesbtn()
	{
		dateofbirthyesbtn.click();
		System.out.println("Clicked  on date of birth yes btn succesfully  ");
	}

	public void Enter_dateofbirth(String date)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='flatpickr-day today cds--date-picker__day']")));
		
		enterdateofbirth.sendKeys(date);
		
		System.out.println("date of birth is created");
	}

	public void Click_onEMBGbtn(String embgval)
	{
		RandomString r = new RandomString();
		embgval =  embgval +  r.make();
		Embg.sendKeys(embgval);
		System.out.println("Embg");
	}

	public void Click_onAddpatientbtn()
	{
		Addpatient.click();
		System.out.println("clicked on add aptient btn");

	}

	public void Enter_addrelationship(String relationval) throws AWTException, InterruptedException
	{

		Addrelationshipbtn.sendKeys(relationval);
	}

	public void Enter_Relationship(String relation)
	{

	}

	public void Click_onregisterpatient()
	{
		Registerpatient.click();
		System.out.println("clicked on register patient ");
	}

	


	public String createnewPatient(String firstName,String middleName,String familyName) throws AWTException, InterruptedException
	{
		//click_onsearchtbtn("Outpatient Clinic");
		//click_outpatientbtn();
		click_onverifybtn();
		click_onAddpatientbtn();
		click_onYesbtn();

		RandomString r = new RandomString();
		String randomString = r.make();
		firstName = firstName + randomString;
		middleName = middleName + randomString;
		familyName = familyName + randomString;

		otpusername(firstName);
		otpmiddlename(middleName);
		otpfamilyname(familyName);
		click_onmalebtn();
		click_ondateofbirthyesbtn();
		Enter_dateofbirth("27/11/2023");
		Click_onEMBGbtn("par789");
		click_onAddpatientbtn();
		Enter_addrelationship("krutunga");
		//	 Enter_Relationship("Parent");
		Click_onregisterpatient();

		String fullname = 		 firstName +" " + middleName +" "+ familyName;
		System.out.println("user created with full name="+ fullname);
		return fullname;
	}
	public void Click_onsearchforpatient(String searchpatientname)
	{
		Searchpatient.sendKeys(searchpatientname);
		System.out.println("clicked on search for patient");
	}
	public void verifysearchresults(String patient) throws InterruptedException
	{
		//(//span[text()='ramanakknaR0Un reddykknaR0Un nandamurikknaR0Unid63Rh9G'])[2]
		
		Thread.sleep(4000);
		
		WebElement patientcreated = 	driver.findElement(By.xpath("(//span[text()='"+ patient  +"'])[2]"));
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOf(patientcreated));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='"+ patient  +"'])[2]")));

		
////span[text()='ramana6hs4z0hh reddy6hs4z0hh nandamuri6hs4z0hh819WBUV4']
		
		if(patientcreated.isDisplayed())
		{
			System.out.println("patient is created and searched  succesfully ");
		}
		else
		{
			System.out.println("patient is created and searched  not succesfully ");
		}

	}

}
