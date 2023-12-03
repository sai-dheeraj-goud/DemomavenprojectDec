package NaukariTestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import Naukaripages.Naukariloginpage;

public class LoginTc_01 
{

	@Test 
	public void Test() throws InterruptedException
	{

		System.setProperty("webdriver.edge.driver", ".\\driver\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();	
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		
		Naukariloginpage npage = new Naukariloginpage(driver);
		npage.click_loginbtn();
		//Npage.Click_onRegisterbtn();
		npage.Enter_username("sanjeeva0136@gmail.com");
		npage.Enter_password("Mahi@9676177466");
		npage.Click_Loginbtn();
		npage.Click_oncompletebtn();
		npage.Click_onpencilbtn();	
		npage.Click_onupdatename("Sanjeeva Mahendra");
		npage.Click_onsavebtn();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
