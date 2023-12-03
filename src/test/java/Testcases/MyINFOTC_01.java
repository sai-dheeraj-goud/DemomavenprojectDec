package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import OrangeHRMSMYINFOpage.PIMpage;
import pages.Loginpage;


public class MyINFOTC_01
{
	@Test
	public void Testcase_01()
	{
	System.setProperty("webdriver.edge.driver", ".\\driver\\msedgedriver.exe");

	EdgeDriver driver =new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	Loginpage lpage =new Loginpage(driver);
	lpage.LoginintoApp("Admin", "admin123");
	
	PIMpage pimpage = new PIMpage();
	pimpage.Click_onpimbtn();
	pimpage.Click_onAddbtn();
	
	}
	
	

}
