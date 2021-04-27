package Inf.admintestcases;

import org.testng.annotations.Test;

import Inf.base.testbase;
import Inf.pages.homepage;
import Inf.pages.logpage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class logintestcase extends testbase
{
	logpage objlg;
	
public logintestcase()
{
	super();
}

@BeforeMethod  

public void setup() 
{
Initialization();
objlg=new logpage();
}

@Test(priority=1)
  
public void titletest() 
{
	String Expectedtitle="Smart Hospital : Hospital Management System";
	String actualtitle=objlg.checkfortitle();
	Assert.assertEquals(actualtitle, Expectedtitle);
}
  
@Test(priority=2)

public void logotest()
{
	Assert.assertTrue(objlg.checkforlogo());
}

@Test(priority=3)

public void logintest() 
{
	objlg.logintest(prop.getProperty("username"),prop.getProperty("password"));
	
	
}


 @AfterMethod
public void afterMethod() 
{
  driver.close();
}

}
