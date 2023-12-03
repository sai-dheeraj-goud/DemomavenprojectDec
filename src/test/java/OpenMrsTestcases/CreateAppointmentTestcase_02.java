package OpenMrsTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import OpenMrs.CreateAppointent;
import OpenMrs.Loginpage;

public class CreateAppointmentTestcase_02 
{

	@Test
	public void CreateAppointmentTestcase() throws InterruptedException
	{
		
	
	System.setProperty("webdriver.edge.driver", ".\\driver\\msedgedriver.exe");
	EdgeDriver driver =new EdgeDriver();	
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://o3.openmrs.org/");
	
	Loginpage lpage = new Loginpage(driver);	
	lpage.Loginto_Application("admin", "Admin123", "Outpatient Clinic");
	CreateAppointent cp = new CreateAppointent(driver);
	cp.Click_onAppointmentbtn();
	cp.Click_onoppointmentbtn();
	cp.Click_onSearchtbtn("Ravya sindhuri patel");
	
	
	
	
	
	
	
	
	
	}
}

