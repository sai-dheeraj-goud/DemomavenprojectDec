package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;
import pages.Jobtestcase;
import pages.Loginpage;
import pages.Testbase;

public class Tc05 {
	
	public static WebDriver driver ;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");

		EdgeDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		System.out.println("driver="+driver);
		
		Loginpage lpage =new Loginpage(driver);
		
		
	//	lpage.LoginintoApp("Admin", "admin123");
		lpage.enter_username("Admin");
		lpage.enter_password("admin123");
		Homepage hpage= new Homepage(driver);
		hpage.ishomepagedisplayed();
		hpage.NavigatetoAdminMenu();
		
		Jobtestcase jobpage = new Jobtestcase(driver);
		
		jobpage.clickjobbtn();
		Thread.sleep(2000);
		jobpage.clickonjobtitlebtn();
		Thread.sleep(2000);
		jobpage.clickAddbtn();
		Thread.sleep(2000);
		jobpage.clickAddjobTittle("Mahendra M");
		Thread.sleep(2000);
		jobpage.adddescription("Automation Test Engineer");
		Thread.sleep(2000);
		jobpage.clicksave();
		Thread.sleep(2000);
		jobpage.Updatejob();
		Thread.sleep(2000);
		jobpage.clickAddNote("Maven");
		Thread.sleep(2000);
		
		jobpage.clicksave();
		Thread.sleep(2000);
		//jobpage.adduserisexist("Mahendra");
		
		
		
		
	}

}
