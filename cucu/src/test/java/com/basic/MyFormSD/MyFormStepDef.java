package com.basic.MyFormSD;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class MyFormStepDef {
	WebDriver driver = null;
	
	
	@Given("^User need to be on Registration form page$")
	public void user_need_to_be_on_Registration_form_page()	{
		System.setProperty("webdriver.chrome.driver", "F:\\radical\\chrome\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
	}
	
	@When("Enter followind data")
	public void enter_followind_data(DataTable table)
	{
		List<List<String>> data = table.raw();
		String values1 = data.get(0).get(0);
		String values2 = data.get(0).get(1);
		String values3 = data.get(0).get(2);
		String values4 = data.get(0).get(3);
		String values5 = data.get(0).get(4);
		String values6 = data.get(0).get(5);
		String values7 = data.get(0).get(6);
		String values8 = data.get(0).get(7);
		String values9 = data.get(0).get(8);
		
		
		String values10 = data.get(1).get(0);
		String values11= data.get(1).get(1);
		String values12= data.get(1).get(2);
		String values13= data.get(1).get(3);
		String values14= data.get(1).get(4);
		String values15= data.get(1).get(5);
		String values16= data.get(1).get(6);
		String values17= data.get(1).get(7);
		String hobbiesList[] =  values17.split("###");
		
		String values18 = data.get(1).get(8);
		
		
		
		String values19= data.get(2).get(0);
		String values20= data.get(2).get(1);
		String values21= data.get(2).get(2);
		String values22= data.get(2).get(3);
		String values23= data.get(2).get(4);
		String values24= data.get(2).get(5);
		String values25= data.get(2).get(6);
		String values26= data.get(2).get(7);
		String values27= data.get(2).get(8);
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(values10);
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(values11);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(values12);
		driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(values13);
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys(values14);
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		Boolean UserInput = true;
		Boolean CurrentInput = driver.findElement(By.xpath("//input[@value='Cricket']")).isSelected();
		By eleBy = By.xpath("//input[@value='Cricket']");
		By eleBy1 = By.xpath("//input[@value='Hockey']");
		
		CheckBoxLib lib = new  CheckBoxLib();
		lib.SelectCheckBox(eleBy, driver, UserInput, CurrentInput);
		lib.SelectCheckBox(eleBy1, driver, UserInput, CurrentInput);
		
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//div/ul/li[7]/a[@class='ui-corner-all']")).click();
		
		
		
		
		
		
		
		
	}
	
	
	}


