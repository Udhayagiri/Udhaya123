package Inf.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Inf.base.testbase;

public class logpage extends testbase 
{

	@FindBy(css="input#email")WebElement uname;
	@FindBy(css="input#password")WebElement upass;
	@FindBy(tagName="img")WebElement HMSLogo;
	@FindBy(linkText="forgotpassword")WebElement fpass;
	@FindBy(className="btn")WebElement Ibttn;
	@FindBy(className="sidebar-session")WebElement SHMSLogo;
	
	
	public logpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String checkfortitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public boolean checkforlogo()
	{
		boolean logo=HMSLogo.isDisplayed();
		return logo;
	}
		
	public homepage logintest(String username,String password) 
	{
		uname.sendKeys(username);
		upass.sendKeys(password);
		Ibttn.click();
		
		
		
		return new homepage();
		
	}
}

