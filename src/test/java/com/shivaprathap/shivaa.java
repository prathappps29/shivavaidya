package com.shivaprathap;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class shivaa {

@Test
public void setup()
{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://google.com");
	
	
}



}
