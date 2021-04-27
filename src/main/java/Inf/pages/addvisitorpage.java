package Inf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Inf.base.testbase;
import Inf.util.commonutility;
import Inf.util.datepicker;

public class addvisitorpage extends testbase

{
	datepicker pickdate=new datepicker();
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3")WebElement Visitorlist;
	@FindBy(xpath="/html/body/div[1]/div[1]/section/div/div/div/div[1]/div/a")WebElement Addvisitor;
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/h4")WebElement Addvisitortext;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[1]/div[1]/div/select")WebElement purpose;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[1]/div[2]/div/input")WebElement Name;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[2]/div[1]/div/input")WebElement Phone;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[2]/div[2]/div/input")WebElement IDcard;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[3]/div[1]/div/input")WebElement Noofperson;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[5]/textarea")WebElement Note;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[2]/button")WebElement Save;
	@FindBy(xpath="/html/body/div[3]/div/div/div[2]/form/div[1]/div[6]/div/div/input")WebElement Attach;
	@FindBy(xpath="//input[@id='date']")WebElement Date;
	
	public addvisitorpage()
	{
		PageFactory.initElements(driver, this);
	}


	public boolean checkvisitorlistoption()
	{
		boolean text3=Visitorlist.isDisplayed();
		return text3;
	}


	public void clickaddvisitor()
	{
		Addvisitor.click();
		
	}
	
	
	public void display(String data[])
	{
		String floc=new String("F:\\sample.pdf");
		
		Addvisitor.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		purpose.click();
		Select abc=new Select(purpose);
		abc.selectByVisibleText(data[0]);
		Name.sendKeys(data[1]);
		Phone.sendKeys(data[2]);
		IDcard.sendKeys(data[3]);
		Noofperson.sendKeys(data[4]);
		Note.sendKeys(data[5]);
		Date.click();
		pickdate.datpicker(data[6]);
		
		commonutility.mouseclick(Attach);
		commonutility.upload(floc);
		Save.click();
	
	}
	
}
