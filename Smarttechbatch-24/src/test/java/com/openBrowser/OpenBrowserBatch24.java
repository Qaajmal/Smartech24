package com.openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserBatch24 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	
	//this will type the username
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	//this will type the password
	driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
	//this will click the login
	driver.findElement(By.name("Submit")).click();
	
}
}
