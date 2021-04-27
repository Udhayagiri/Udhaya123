package Inf.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Inf.base.testbase;

public class frontofficepage extends testbase
{
	
@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")WebElement Appointdls;
@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a[2]")WebElement Visitorbook;


public frontofficepage()
{
	PageFactory.initElements(driver, this);
}


public boolean checkfrontofficeAPDtitle()
{
	boolean text1=Appointdls.isDisplayed();
	return text1;
}

public addvisitorpage clickvisitorbookoption()
{
	Visitorbook.click();
	return new addvisitorpage();
}

}