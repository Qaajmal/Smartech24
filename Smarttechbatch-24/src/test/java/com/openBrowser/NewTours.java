package com.openBrowser;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.manage().window().maximize();
		//this will type the username
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("ajmalibrahimi");
		//this will type the password
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("jobs1234");
		//this will click on password
		//driver.findElement(By.xpath("//*[@type='Submit']")).click();
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		
	    String expected = "Login Successfully";
	    String actual = driver.findElement(By.xpath("//*[contains(text(),'Login Successfully')]")).getText();
	    
	    Assert.assertTrue("the text did not match",actual.contains(expected));
	    
	   // this is code for handling the alert 
//	    Thread.sleep(10000);
//	    Alert al = driver.switchTo().alert();
//	    al.dismiss();
//	    
	    driver.findElement(By.xpath("//*[contains(text(),'Flights')]")).click();
	    
	    //driver.findElement(By.xpath("//*[@name='tripType'][2]")).click();
	    //we can do the upper code this way as well
	    
	    WebElement tripTy = driver.findElement(By.xpath("//*[@name='tripType'][2]"));
	    tripTy.click();
	    
	    //selecting number of passengers
	    WebElement passNum = driver.findElement(By.xpath("//*[@name='passCount']"));	    
	    Select pass = new Select(passNum);
	    pass.selectByIndex(1);
	    
	    //selecting port	   	    
	    WebElement fPort = driver.findElement(By.name("fromPort"));
	    Select selectFPort = new Select(fPort);
	    selectFPort.selectByVisibleText("New York");
	    
	    /*WebElement fMonth = driver.findElement(By.name("fromMonth"));
	    Select selectFMonth = new Select(fMonth);
	    selectFMonth.selectByVisibleText("July");*/
	    
	    WebElement fMonth = driver.findElement(By.xpath("//*[@name='fromMonth']"));
	    Select selectFMonth = new Select(fMonth);
	    selectFMonth.deselectByIndex(5);
	    
	    /*WebElement depMonth = driver.findElement(By.xpath("//*[@name='fromMonth']"));
		Select dMon = new Select(depMonth);
		dMon.selectByIndex(2);*/
	    
	    
	    
	    

	}

}
