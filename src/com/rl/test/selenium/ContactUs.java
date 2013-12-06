package com.rl.test.selenium;

import org.openqa.selenium.By;

public class ContactUs extends MainDriver {

	public static void contactUs(){
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td/p/a")).click();
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td[2]/div/a[2]")).click();
		driver.findElement(By.name("messageForm:firstName")).sendKeys("Srinivas");
		driver.findElement(By.name("messageForm:lastName")).sendKeys("iyer");
		driver.findElement(By.name("messageForm:emailAddress")).sendKeys("srinivas@rl.in");
		driver.findElement(By.name("messageForm:content")).sendKeys("Reg: Product Details");
		driver.findElement(By.name("messageForm:_id29")).click();
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td/p/a")).click();
	}
}
