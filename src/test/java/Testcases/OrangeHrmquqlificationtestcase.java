package Testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;


import pages.Loginpage;
import pages.orhmeducationpage;

public class OrangeHrmquqlificationtestcase {

		@Test
		public void Testcase()
		{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewEducation");
		orhmeducationpage epage =  new orhmeducationpage(driver);
		Loginpage lpage =new Loginpage(driver);
		lpage.LoginintoApp("Admin", "admin123");
		@Test
		epage.click_Qualificationbtn();
		Thread.sleep(2000);
		
		epage.Click_educationbtn();
		Thread.sleep(2000);
		
		epage.Click_Addbtn();
		Thread.sleep(2000);
		
		epage.Enter_val("B.Tech 111");
		
		epage.Click_onsavebtn();
		
		epage.clickon_pencilbtn();
		
		epage.clickon_updatejob("B.E 111");
		epage.Click_onsavebtn();
		
		
		}
		
	}

	


