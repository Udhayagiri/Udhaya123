package Inf.admintestcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Inf.base.testbase;
import Inf.pages.addvisitorpage;
import Inf.pages.frontofficepage;
import Inf.pages.homepage;
import Inf.pages.logpage;
import Inf.util.ReadExcel;

public class addvisitorpagetest extends testbase
{
logpage log;
homepage home;
frontofficepage frontoffice;
addvisitorpage addVpage;
String sheetname="Visitor";
public addvisitorpagetest()
{
	super();
}

@BeforeMethod

public void setup()
{
 Initialization();
 log=new logpage();
 home=log.logintest(prop.getProperty("username"),prop.getProperty("password"));
 frontoffice=home.clickfrontoffice();
 addVpage=frontoffice.clickvisitorbookoption();
 
}

@Test(priority=1)
public void checkvisitorlist()
{
   Assert.assertTrue(addVpage.checkvisitorlistoption());
}


@Test(priority=2)
public void clickaddvisitoroption()
{
	addVpage.clickaddvisitor();
}

@Test(priority=3)
public void display1()
{
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	addVpage.display(null);
}



@DataProvider 
public Object[][] getVISTestData()
{ 
	  Object data[][] =  ReadExcel.getTestData(sheetname); 
	  return data; 
}
@Test
(dataProvider="getVISTestData")

public void addvisitor(String args[]) 
{

Assert.assertTrue(addVpage.checkvisitorlistoption());


addVpage.display(args);

}


@AfterMethod
public void aftermethod()
{
	//driver.close();
}



}