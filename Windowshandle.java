package Intro;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Windowshandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");//parent
		driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();//child
		Set<String> windows = driver.getWindowHandles(); //this will handle both parent & child windows [parent,child](0,1)index
		Iterator<String> it =windows.iterator(); //it will extract & iterate it
		String parent = it.next();
		String child = it.next(); 
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//p[@class=\"im-para red\"]")).getText());//infront of with their is a space so[split(" ")]
		String emailid = driver.findElement(By.xpath("//p[@class=\"im-para red\"]")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys(emailid);
		
		
	

	}

}
