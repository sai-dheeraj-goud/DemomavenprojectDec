package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;
import pages.Loginpage;

public class tc_03
{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64 (3)\\msedgedriver.exe");

		EdgeDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Loginpage lpage =new Loginpage(driver);
		
//		lpage.enter_username("Admin");
//		lpage.enter_password("admin123");
//		lpage.clickloginbtn();
		
	//	lpage.LogintoApp("Admin", "admin123");
		
		//verify hompage is displayed or not
		
		Homepage hpage= new Homepage(driver);
		hpage.ishomepagedisplayed();
		
		hpage.NavigatetoAdminMenu();

		hpage.verifysystemuserpageisdisplayed();	
		
		hpage.clickaddbtn();
		
		hpage.verifAdduser();
		
		hpage.clickuseroledropdown();
		hpage.clickadmindropdown();
		
		hpage.EntervalueinEmployeename("Orange Test");
		
		hpage.selectStatus("Enabled");	
		
		
		
		
		
}
}
