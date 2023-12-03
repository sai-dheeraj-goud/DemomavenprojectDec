package Testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import pages.naukariloginpage;

public class Tc_06 {

	public static void main(String[] args) {
		// driver.get("file:D:\\Java selenium\\drivers\\chromedriver_win32.html");
		

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");

		EdgeDriver driver =new EdgeDriver();
	
		
		
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.naukri.com/nlogin/login");
		
		naukariloginpage nk = new naukariloginpage(driver);
		
		//nk.Enter_username("mudyamsanjeeva@gmail.com");
		//nk.Enter_pwd("Mahi@9676177466");
		nk.Cliclsearchnbtn();
		
		nk.multiplewindow();
		
		
		

	}

}
