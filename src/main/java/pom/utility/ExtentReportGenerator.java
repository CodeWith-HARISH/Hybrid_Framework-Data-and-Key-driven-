package pom.utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {

	//ExtentsparkReporter
	//ExtentReports
	public static ExtentReports extent;
	
	public static ExtentReports getReports()
	{
		
		
	
		String reportpath="C:\\Users\\Harish\\eclipse-workspace\\PageObjectModel\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath);
	    reporter.config().setDocumentTitle("Facebook Automation Report");
	    reporter.config().setReportName("Login_page Report");
	    reporter.config().setTheme(Theme.DARK);
	    reporter.config().thumbnailForBase64();
	    
	    extent=new ExtentReports();
	    extent.attachReporter(reporter);
	    extent.setSystemInfo("Project Name", "Demo Project");
	    extent.setSystemInfo("QA", "Harish");
	    extent.setSystemInfo("Operating System", "Windows");
	    return extent; 
	    
	    	    
	    
	    
}
	
	
	
	
}









