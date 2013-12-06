package com.rl.test.selenium;

import org.openqa.selenium.By;

public class NewProduct extends MainDriver{
	public  static void newproduct(){
		try{
			driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td/p/a")).click();
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr/td/a[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='createProductForm:id']")).sendKeys("RL001");
		driver.findElement(By.xpath("//input[@id='createProductForm:name']")).sendKeys("Relevance");
		driver.findElement(By.xpath("//form[@id='createProductForm']/table/tbody/tr[4]/td[2]/input")).sendKeys("20.00");
		driver.findElement(By.xpath("//form[@id='createProductForm']/table/tbody/tr[5]/td[2]/input")).sendKeys("0.5");
		driver.findElement(By.xpath("//form[@id='createProductForm']/table/tbody/tr[6]/td[2]/input")).sendKeys(" 1.0");  
		driver.findElement(By.xpath("//form[@id='createProductForm']/table/tbody/tr[8]/td[2]/select")).sendKeys("Category Two");		
		driver.findElement(By.name("createProductForm:_id35")).click();
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td/p/a")).click();
		}
		catch(Exception ex){
			System.out.print(ex.getMessage());
		}
	}
	
	public static void ProductList(){
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td[2]/div/a")).click();
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr/td/a")).click();
		driver.findElement(By.xpath("//table[@id='productListForm:table']/tbody/tr[10]/td[6]/a")).click();
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td[2]/div/a")).click();
		driver.findElement(By.xpath("//form[@id='header:headerForm']/table/tbody/tr[3]/td/table/tbody/tr/td/p/a")).click();
		driver.findElement(By.linkText("logout")).click();
	}

}
