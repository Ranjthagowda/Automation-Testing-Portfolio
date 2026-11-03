package Intro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/"); //url path
		driver.findElement(By.id("inputUsername")).sendKeys("Ranjitha"); //id locators(id->attribute)
		driver.findElement(By.name("inputPassword")).sendKeys("ranju"); // name locator
		driver.findElement(By.className("submit")).click(); //classname locator
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText()); //CSSselector locator //here we have install selector hub 37 video
	    driver.findElement(By.linkText("Forgot your password?")).click();//lintext loctor(inspect->a(anchor)  then only we should use linktext locator
	    driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("Ranjitha VR");
	    driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("ranju@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("123456");
	    Thread.sleep(1000);
	    driver.findElement(By.className("reset-pwd-btn")).click();
	    Thread.sleep(10000);
	    System.out.println("Reset clicked sucessfully");
	    System.out.println(driver.findElement(By.xpath("//form/p")).getText());//xpath we have used by seeing the HTML(inspect->parent(form)->child(p)
	    driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	    driver.findElement(By.className("go-to-login-btn")).click();
	    driver.findElement(By.id("inputUsername")).sendKeys("Ranjitha VR"); 
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		 Thread.sleep(1000); //->interception
	    driver.findElement(By.id("chkboxOne")).click();
	    driver.findElement(By.id("chkboxTwo")).click();
	    driver.findElement(By.className("submit")).click();
	    Thread.sleep(10000);
	    System.out.println(driver.findElement(By.tagName("p")).getText());
	    //assertion-> actual & expected suppose we need "getText()" always we can't use get text so we have to use assertion
	    Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	    //Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are  logged in"); -> this gonna fail test case
	    Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+"Ranjitha VR"+",");
	    driver.findElement(By.className("logout-btn")).click();
	    System.out.println("Logged out Sucessfully");
	    driver.quit();
	    
	    
	
	    
		 
		
	
	}

}
