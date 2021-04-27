package Inf.admintestcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Inf.base.testbase;
import Inf.pages.homepage;
import Inf.pages.logpage;

public class homepagetest extends testbase{

 
	logpage log;
	homepage home;
	
public homepagetest()
{
		super();
}
	
@BeforeMethod  

public void beforeMethod() 
{
Initialization();
log=new logpage();
home=log.logintest(prop.getProperty("username"),prop.getProperty("password"));
}

@Test(priority=1)

public void checktitletest() 
{
	String Expectedtitle="Smart Hospital Management System";
	String actualtitle=home.verifyhomepagetitle();
	Assert.assertEquals(actualtitle, Expectedtitle);
}

@Test(priority=2)

public void checkuserlabel()
{
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Assert.assertTrue(home.usernametext());
}

@Test(priority=3)
public void checkfrontofficeclick()
{
	home.clickfrontoffice();

}
 
@AfterMethod
public void afterMethod()
{
	driver.close();
}


}