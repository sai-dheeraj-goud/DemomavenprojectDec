package OpenMrsTestcases;

import java.awt.AWTException;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import OpenMrs.Loginpage;

public class LoginTc_01 
{
	@Test  
	public void MrsApplicationTestcase01() throws InterruptedException // normal java method
, AWTException
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admi\\Downloads\\edgedriver_win64 (8)\\msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();	
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://o3.openmrs.org/");
		
		Loginpage lpage = new Loginpage(driver);
		////span[text()='kavya sindhuri patel']
	//	lpage.Enter_username("admin", "Admin123", "Outpatient")
		
		//lpage.click_onsearchtbtn("Outpatient Clinic"); 
//		lpage.click_outpatientbtn();
//		lpage.click_onconfirmbtn();
//		lpage.click_onAddpatientbtn();
//		lpage.click_onYesbtn();
//		
//		
//		lpage.otpusername("Sandhya");
//		lpage.otpmiddlename("Soumya");
//		lpage.otpfamilyname("Srija");
//		lpage.click_onmalebtn();
//		lpage.click_ondateofbirthyesbtn();
//		lpage.Enter_dateofbirth("23/11/2023");
//		lpage.Click_onEMBGbtn("par789");
//		lpage.click_onAddpatientbtn();
//		lpage.Enter_addrelationship("krutunga");
//	//	lpage.Enter_Relationship("Parent");
//		lpage.Click_onregisterpatient();
//		
//		
//		
		
		String fullname= lpage.createnewPatient( "ramana","reddy","nandamuri");
		Thread.sleep(4000);
		lpage.Click_onsearchforpatient(fullname);
		Thread.sleep(4000);
		lpage.verifysearchresults(fullname);
		
		
		
		
		
	//	driver.close();
		
		
//	
	
	}
}
