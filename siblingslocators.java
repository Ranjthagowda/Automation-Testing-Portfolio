package Intro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class siblingslocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText()); //-> relative Xpath video 49th (parent-child)
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[1]")).getText());//(child to -parent)
		
		
	}

}
