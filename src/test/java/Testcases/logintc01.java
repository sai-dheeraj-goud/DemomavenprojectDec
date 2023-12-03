package Testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;
import pages.Loginpage;

public class logintc01 {

	public WebDriver driver;
	public static void main(String []args) 
	{
		System.setProperty("webdriver.edge.driver", ".\\driver\\msedgedriver.exe");

		EdgeDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Loginpage lpage =new Loginpage(driver);
		
//		lpage.enter_username("Admin");
//		lpage.enter_password("admin123");
//		lpage.clickloginbtn();
//		
		//verify hompage is displayed or not
		
		lpage.LoginintoApp("Admin", "admin123");
		Homepage hpage= new Homepage(driver);
		hpage.ishomepagedisplayed();
		hpage.NavigatetoAdminMenu();
		
	
		//lpage.clickloginbtn();
		
		
	}
	
}
