package com.openBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserGuru99 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/index.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@type='text']")).sendKeys("ajmalibrahimi");
	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("jobs1234");
	//driver.findElement(By.xpath("//*[@type='Submit']")).click();
	driver.findElement(By.name("submit")).click();
	}

}
