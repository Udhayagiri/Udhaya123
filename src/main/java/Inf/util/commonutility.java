package Inf.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import Inf.base.testbase;

public class commonutility extends testbase
{

	public static void mouseclick(WebElement El)
	{
		Actions action=new Actions(driver);
		action.click(El).build().perform();
	}
	
	
	//Script for file Upload  
	public static void upload(String floc)
	{
	  
	  try 
	  {
	    Runtime.getRuntime().exec("./src/test/resources/Winmultiple.exe"+" "+floc);
	    Thread.sleep(4000);
	  } 
	  catch (IOException e) 
	  {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	  }
	  catch (InterruptedException e) 
	  {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	  }
	}
	  
	  
	//Script for Screenshot on fail

	  public static void takescreenshot()
	  {
	  	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  	String currentDir = System.getProperty("user.dir");
	  	File destination=new File(currentDir+"./Screenshot/"+System.currentTimeMillis()+".png");
	  	try {
	  		FileHandler.copy(scrFile,destination );
	  	} catch (IOException e) {
	  		// TODO Auto-generated catch block
	  		e.printStackTrace();
	  	}
	  
	}
}
