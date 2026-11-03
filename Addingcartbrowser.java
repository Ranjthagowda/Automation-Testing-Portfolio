package Intro;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Addingcartbrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		//dynamic code
		
		
		String[] itemsneeded = {"Cucumber","Brocolli","Beetroot","Tomato"};
		List<WebElement> products = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] name = products.get(i).getText().split("-");//Cauliflower - 1 Kg //
			String formatted = name[0].trim();
			
			//convert array into arrayList(Because if we have multiple list to add so we need to convert)
			List a1 = Arrays.asList(itemsneeded);
			
			int j=0;
			
			if(a1.contains(formatted))
			{
				j++;
				driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();//parent HTML have taken
				if(j==itemsneeded.length)
				{
					break;
				}
				
			}
		}
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.className("promoCode")).sendKeys("ranjithavr");
		driver.findElement(By.xpath("//button[@class=\"promoBtn\"]")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		WebElement Element = driver.findElement(By.xpath("//select[@style=\"width: 200px;\"]"));//static webelements
		Select dropdown = new Select(Element);
		dropdown.selectByValue("United Kingdom");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.className("chkAgree")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		
		}
			
			
}
		
		
		
		
		

	


