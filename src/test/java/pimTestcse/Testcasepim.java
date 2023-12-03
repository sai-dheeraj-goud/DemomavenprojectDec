package pimTestcse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import OrangeHRMSMYINFOpage.PIMpage;
import pages.Loginpage;

public class Testcasepim 
{
	@Test(invocationCount = 2)
	public void Testcase() throws InterruptedException
	{
	System.setProperty("webdriver.edge.driver", ".\\driver\\msedgedriver.exe");

	EdgeDriver driver =new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Loginpage lpage =new Loginpage(driver);
	lpage.LoginintoApp("Admin", "admin123");
	PIMpage ppage = new PIMpage(driver);
	
	ppage.Click_onpimbtn();
	ppage.Click_onAddbtn();
	ppage.Enter_name("Sandhya", "Yamani", "Riya");
	ppage.Enter_username("Sandhya");
	ppage.Enter_password("Sandhya@1234");
	ppage.Enter_confirmpassword("Sandhya@1234");
	ppage.Click_onsavebtn();
	
	ppage.Click_onLicennsedate("1998-03-06");
	
	ppage.Click_onselectindianbtn();
	
	ppage.SelectIndianondropdown("Indian");
	ppage.Click_onMartialstatus();
	ppage.Click_onSinglebtn("Single");
	ppage.Click_onFemalebtn();
	ppage.Click_onFinalsavebtn();
	
	ppage.Click_onSavingform();
	

	}
	
}
