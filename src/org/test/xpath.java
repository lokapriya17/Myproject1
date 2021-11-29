package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lokapriya\\eclipse-workspace\\Selenium\\Browser\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// run the chrome each time 

		//to launch url
		driver.get("https://www.instagram.com/");
		
		//tag name =input attribute= name
		driver.findElement(By.xpath("//input[@name='username']"));
		
		//WebElement click = driver.findElement(By.xpath("//a[@role='button'][2]"));
	//click.click();
	
	
//=driver.findElements()


//ctrl+2  2 sec and l

	}
	

}
