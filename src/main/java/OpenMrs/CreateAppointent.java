package OpenMrs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class  CreateAppointent
{

	public static WebDriver driver;
	
	
	@FindBy(xpath="//a[text()='Appointments']")
	public WebElement Appointment;
	
	@FindBy(xpath="//button[text()='Create new appointment']")
	public WebElement createoppointment;
	
	@FindBy(id="search-input-17")
	public WebElement searchbtn;
	
	
	
	
	
	



	public CreateAppointent(EdgeDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Click_onAppointmentbtn()
	{
		Appointment.click();
		System.out.println("clicked on Appointment btn");
	}
	
	public void Click_onoppointmentbtn()
	{
		createoppointment.click();
		System.out.println("clicked on create oppointment btn");
	}
	
	
	public void Click_onSearchtbtn(String Name)
	{
		searchbtn.click();
		searchbtn.sendKeys(Name);
		System.out.println("clicked on search btn");
		System.out.println("Entered patient name succesfully");
	}
	
	
	
	
	
	
	
	
}
