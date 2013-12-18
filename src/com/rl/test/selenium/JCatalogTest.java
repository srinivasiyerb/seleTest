package com.rl.test.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import org.testng.annotations.Test;

public class JCatalogTest extends MainDriver{
	
	public static void openBrowser(){
		//File file = new File("src/IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		driver = new HtmlUnitDriver();
		driver.get("http://192.168.103.37:8080/catalog/");		
	}
	public static void closeBrowser(){
		driver.close();
	}
	public static void login(){
		
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.xpath("//input[@id='loginForm:username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='loginForm:password']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@name='loginForm:_id24")).click();
		driver.findElement(By.name("loginForm:_id24")).click();
		}
	 
	@Test(priority=0)
	public void TestcategoryOne(){
		try{
		openBrowser();
		login();
		Category.categoryOne();
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
	
	@Test(priority=1)
	public void Testcategorytwo(){
		
		Category.categoryTwo();
		}
	
	@Test(priority=2)
	public void Testcategorythree(){
		
		Category.categoryThree();
		
	}
	
	@Test(priority=3)
	public void Testcategoryfour(){
		
		Category.categoryFour();
		
		}
	
	@Test(priority=5)
	public void TestproductList(){
		
		NewProduct.ProductList();
		
	}

	@Test(priority=4)
	public void TestnewProduct(){
		try{
		
		
		NewProduct.newproduct();
		
		}
		catch(Exception e){
			System.out.print(e.getMessage());
		}
	}
	
	@Test(priority=6)
	public void Testcontactus(){
		
		ContactUs.contactUs();
		
	}
	
	@Test(priority=7)
	public void Testplaceorder(){
		
		PlaceOrder.placeOrder();
		
	}

}
