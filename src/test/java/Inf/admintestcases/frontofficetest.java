package Inf.admintestcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Inf.base.testbase;
import Inf.pages.frontofficepage;
import Inf.pages.homepage;
import Inf.pages.logpage;

public class frontofficetest extends testbase
{
logpage log;
homepage home;
frontofficepage frontoffice;

public frontofficetest()
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
}

@Test(priority=1)

public void checktitletest() 
{
	Assert.assertTrue(frontoffice.checkfrontofficeAPDtitle());
}
 
@Test(priority=2)
public void clickvisitorbook()
{
   frontoffice.clickvisitorbookoption();
}


}



