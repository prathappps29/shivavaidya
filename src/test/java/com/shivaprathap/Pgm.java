package com.shivaprathap;
import java.io.IOException; 
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit; 

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
// org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
// org.openqa.selenium.interactions.ClickAction;

//import com.thoughtworks.selenium.webdriven.commands.Click;
//import org.openqa.selenium.interactions.Actions;

public class Pgm {
	//@Parameters("browser")

	
	
	@Test
	public void shivaa() throws MalformedURLException
	{
		//System.out.println(b);
		DesiredCapabilities cap=null;
		//if(b.equals("firefox"))
		//{
		/*cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		//}
		//else if(b.equals("chrome"))
		//{*/
			cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		//}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		
	//FirefoxDriver driver= new FirefoxDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//driver.findElement(By.className("q")).sendKeys("youtube");
	Actions action= new Actions(driver);
	WebElement event1=driver.findElement(By.name("q"));
	event1.sendKeys("youtube");
	WebElement event2=driver.findElement(By.name("btnG"));
	event2.click();
	WebElement event3=driver.findElement(By.linkText("YouTube"));
	action.moveToElement(event1).moveToElement(event2).moveToElement(event3).click().build().perform();
	JavascriptExecutor js= (JavascriptExecutor) driver;
	js.executeScript("scrollTo(0,2500);" );
	
}
}
