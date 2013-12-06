package com.rl.test.selenium;

import org.openqa.selenium.By;

public class PlaceOrder extends MainDriver {
	
	public static void  placeOrder(){
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td/p/a")).click();
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td[2]/div/a[3]")).click();
		driver.findElement(By.xpath("//form[@id='messageForm']/table/tbody/tr[2]/td[2]/input")).sendKeys("RL");
		driver.findElement(By.xpath("//form[@id='messageForm']/table/tbody/tr[3]/td[2]/input")).sendKeys("comp");
		driver.findElement(By.xpath("//form[@id='messageForm']/table/tbody/tr[4]/td[2]/input")).sendKeys("RL@rl.com");
		driver.findElement(By.name("messageForm:_id29")).click();
		driver.findElement(By.linkText("JCatalog Project")).click();
				
	}

}
