package com.basic.MyFormSD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxLib {
	public void SelectCheckBox(By by,WebDriver driver,boolean UserInput,boolean CurrentInput)
	{
		if(UserInput){
			if(CurrentInput){
				System.out.println("already checked");
			}else
			{
				driver.findElement(by).click();
			}
		}
		if(!UserInput){
			if(CurrentInput){
				driver.findElement(by).click();
			}else
			{
				System.out.println("already unchecked");
			}
		}
	}


}
