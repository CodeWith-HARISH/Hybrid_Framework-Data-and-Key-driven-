package pom.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginpom
{
	
	
	@FindBy(how=How.XPATH,using="//input[@id='email']")
	 private WebElement txt_email;
	
	@FindBy(how=How.XPATH,using="//input[@id='pass']") 
     private WebElement txt_pass;
	
	@FindBy(how=How.XPATH, using="//button[@id='loginbutton']")
	private WebElement txt_login;
	
	@FindBy(how=How.XPATH, using="//div[@class='_9ay7']")
    private WebElement Error_txtmsg;
	
	public WebElement getTxt_email()
	{
		return txt_email;
	}
	
    public WebElement getTxt_pass()
    {
		return txt_pass;
	}

	public WebElement getTxt_login()
	{
		return txt_login;
	}

    public WebElement get_txt()
    {
	   return Error_txtmsg;
	}
   

}
