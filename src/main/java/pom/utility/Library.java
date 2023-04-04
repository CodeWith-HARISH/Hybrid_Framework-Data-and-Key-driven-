package pom.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library extends Baseclass 
{
	
	public static ExtentTest test;
	

	public static void Custom_sendkeys(WebElement element,String Value,String fieldname )
	{
		
		try
		{
			element.sendKeys(Value);
			test.log(Status.PASS,fieldname+"=Value Successfully Send ="+Value);
		
		}catch(Exception e)
		{
			test.log(Status.FAIL,e.getMessage() );
			
		}
	}
		
		public static void Custom_click(WebElement element,String fieldName)
		{
		try
		{
			element.click();
			test.log(Status.PASS,"Clicked Succesfully on ="+fieldName);
			
		}catch(Exception e)
		{
			
			test.log(Status.PASS,e.getMessage());
			
		}
		
		
	}
		
		public static File screenshot() throws IOException 
		{
			
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\Harish\\eclipse-workspace\\PageObjectModel\\Reports\\ssc.png");
			FileUtils.copyFile(src, dest);
			return src=ts.getScreenshotAs(OutputType.FILE);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	

