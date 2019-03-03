package com.Task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestNGTest {

	@Test
	public void test(){
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(1000,TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	
	WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mamta.kathane@gmail.com");
	
	WebElement ele1 = driver.findElement(By.xpath("//input[@id='pass']"));     //password
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");  
	
	driver.findElement(By.xpath("//input[@type='submit']")).click(); 
	
	
		
		
		
	}

		
		
	}
	

	
	
	
	
	
	
	

