
package pom.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass 
{
	
	public static WebDriver driver;
	public static configdataprovider config;
	public static XLDataprovider XL;
	
	@BeforeSuite
    public void initializationsetup() throws IOException 
	{
		config=new configdataprovider();
		XL=new XLDataprovider();
		
	}
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void BM(String BrowserName)
	{
		
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{

			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
		    driver.get(config.getQAENV_1());
			driver.manage().window().maximize();
		
		}
		
   }
	
   @AfterMethod
   public void AM()
   {
		
	driver.quit();
		
   }
	

}
