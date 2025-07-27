package com.facebook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookLogin {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println("Add edit 2 done by Test2");
	WebElement txtUsername = driver.findElement(By.id("email"));
	txtUsername.sendKeys("velmurugasiromrbranch@gmail.com");
	WebElement txtPassword = driver.findElement(By.id("pass"));
	txtPassword.sendKeys("Greens@123");
	Actions actions=new Actions(driver);
	actions.keyDown(Keys.ENTER).perform();

		}
}
