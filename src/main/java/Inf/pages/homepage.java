package Inf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Inf.base.testbase;

public class homepage extends testbase
{
 
		@FindBy(xpath="/html/body/div[1]/header/nav/div[2]/div/div/ul/li[4]/a/img")WebElement profile;
		@FindBy(xpath="/html/body/div[1]/header/nav/div[2]/div/div/ul/li[4]/ul/li/div/div[2]/h4")WebElement Text;
		@FindBy(xpath="/html/body/div[1]/aside/div/section/ul[2]/li[1]/a/span")WebElement Front;
		@FindBy(className="sidebar-session")WebElement title;
         

		public homepage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public String verifyhomepagetitle()
		{
			String title=driver.getTitle();
			return title;
		}
		
		public boolean usernametext()
		{
			profile.click();
			boolean logolabel=Text.isDisplayed();
			return logolabel;
		}
		
		public frontofficepage clickfrontoffice()
		{
			Front.click();
			return new frontofficepage();
	}
}
