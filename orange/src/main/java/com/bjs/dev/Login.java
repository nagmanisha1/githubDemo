package com.bjs.dev;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	ChromeDriver driver;
	By unXpath=By.xpath("//input[@name='username']");
	By pwXpath=By.xpath("//input[@name='password']");
	By submitButtonXpath=By.xpath("//button[@type='submit']");
	
	public Login(ChromeDriver d) {
		// TODO Auto-generated constructor stub
		driver=d;
	}
	public void typeUsername()
	{
		driver.findElement(unXpath).sendKeys("Admin");
	}
public void typePassword()
{
	driver.findElement(pwXpath).sendKeys("admin123");
}
public void clickSubmitButton()
{
	driver.findElement(submitButtonXpath).click();
}

}
