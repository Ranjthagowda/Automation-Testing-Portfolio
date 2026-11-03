package Intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Dropdownstatic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//select(HTML) then we have to use static method
		
		WebElement a = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(a);
		
		dropdown.selectByIndex(1);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	//or you can use below method
	dropdown.selectByVisibleText("USD");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	//or you can use below method
	dropdown.selectByVisibleText("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	int i=1;//even you can do it in for loop
	while(i<5) //Untill the conditions becomes true it will iterate(1=1,1<5,1+1)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
	}	
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText() ,"5 Adult");//actual & expected results
	
	
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@value=\"BHO\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//a[@value=\"IXJ\"])[2]")).click();
	
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	Thread.sleep(2000);
	List<WebElement> options = driver.findElements(By.cssSelector("li[class=\"ui-menu-item\"] a"));
	for(WebElement option :options)
	{
	if(option.getText().equalsIgnoreCase("India"))
	{
		option.click();
		break;
	}
	}
	
	driver.findElement(By.className("ui-state-active")).click();//calender
	driver.findElement(By.xpath(" (//input[@value=\"RoundTrip\"])[1]")).click();
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	
	
	
	}

}
