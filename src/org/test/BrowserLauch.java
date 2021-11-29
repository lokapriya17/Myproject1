
package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLauch {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\lokapriya\\eclipse-workspace\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();// run the chrome each time 

//to launch url
driver.get("https://www.facebook.com/");

//locator
//id

//sendkeys is a method

 WebElement txtusername = driver.findElement(By.id("email"));
 txtusername.sendKeys("lokapriya.sp@gmail.com");
 
 //password
 
 WebElement Password = driver.findElement(By.id("pass"));
 Password.sendKeys("pinky17$27");
 
 
 WebElement mouseclik = driver.findElement(By.name("login"));
 mouseclik.click();
 

	}

}
