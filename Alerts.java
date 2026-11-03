package Intro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("name")).sendKeys("Ranjitha");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
//		List<WebElement> products = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
//		for(int i=0;i<products.size();i++) {
//			
//			String name = products.get(i).getText();
//			if(name.contains("Cucumber")) {
//				driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
//				break;
//			}
//		}
		
		
		

	}


}
