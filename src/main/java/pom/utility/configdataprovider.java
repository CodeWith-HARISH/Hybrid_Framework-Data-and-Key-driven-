package pom.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configdataprovider 
{
	
	Properties pro;
	public configdataprovider() throws IOException 
	{
		
		String filepath="C:\\Users\\Harish\\eclipse-workspace\\PageObjectModel\\src\\test\\resources\\Config\\Config.properties";
		FileInputStream file=new FileInputStream(filepath);  //create object of Fileinputstream class with path of properties file
	    pro=new Properties();                                // create object of properties class
		pro.load(file);                   //reading data from properties file can be done by using load method provided by properties class
		
   }
	
	public String getQAENV_1()
	{
		return pro.getProperty("QAENV_1");
	}
	
	public String getQAENV_2() 
	{
		return pro.getProperty("QAENV_2");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
