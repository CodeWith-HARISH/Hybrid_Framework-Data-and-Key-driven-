  package Test_Login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.utility.Library;
import pom.pageobject.Loginpom;
import pom.utility.Baseclass;
import pom.utility.Library;

public class test_1 extends Baseclass {
	
	@Test
	public void TC_300() throws InterruptedException, IOException 
	{
		
		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
	
		Library.Custom_sendkeys(login.getTxt_email(),XL.getStringdata("Sheet1", 0, 0),"EmailID");
		Thread.sleep(2000);
		Library.Custom_sendkeys(login.getTxt_pass(),XL.getStringdata("Sheet1", 0, 1),"Password");
		Thread.sleep(2000);
		Library.Custom_click(login.getTxt_login(),"Login");
		Thread.sleep(5000);
		Assert.assertTrue(login.get_txt().isDisplayed());
		Library.screenshot();
		Thread.sleep(2000);
		
		
	}
	
	
	@Test
	public void TC_301() throws InterruptedException
	{
		
		Loginpom login=PageFactory.initElements(driver, Loginpom.class);
	
		Library.Custom_sendkeys(login.getTxt_email(),XL.getStringdata("Sheet1", 2, 1),"EmailID");
		Thread.sleep(3000);
		Library.Custom_sendkeys(login.getTxt_pass(),XL.getStringdata("Sheet1", 3, 2),"Password");
		Thread.sleep(5000);
		Library.Custom_click(login.getTxt_login(),"Login");
		Assert.assertTrue(false);
		
		
	}
	

	
	
	
	
}

























	
