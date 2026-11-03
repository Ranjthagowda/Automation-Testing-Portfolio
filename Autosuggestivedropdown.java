package Intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Autosuggestivedropdown {

	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("autosuggest")).sendKeys("uni");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a")); //general path(dynamic path)
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("United Kingdom (UK)"))
			{
				option.click();
				break;
			}
		}

		driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).getSize();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected());
		//Assert.assertFalse(driver.findElement(By.cssSelector("input[id*=SeniorCitizenDiscount]")).isSelected()); ///this one will false (expected and actual TC)
		
		
		
	}

}
