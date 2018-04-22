package com.basic.sharedataSD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class SharedClass {
	
	WebDriver driver;

	
	@Before
	public WebDriver setup(){
		if(driver==null){
			System.setProperty("webdriver.chrome.driver", "F:\\radical\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		return driver; //picocontainer
		//before every scenario objects are created..pico container usefor deendency manamgement for all step defination.it create all tye objects class and provided to the step defination..
		
	}
	
	
	@After
	public void tearDown(){
		driver.quit();
		driver =null;
	}
	
	

}
