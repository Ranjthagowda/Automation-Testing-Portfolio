package Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        Actions a = new Actions(driver);
        Thread.sleep(5000);
        a.moveToElement( driver.findElement(By.xpath("(//a[@class=\"nav-a nav-a-2   nav-progressive-attribute\"])[1]"))).build().perform();
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        //to write in Capital letter we have write like this
        a.moveToElement(driver.findElement(By.xpath("(//a[@class=\"nav-a nav-a-2   nav-progressive-attribute\"])[1]"))).contextClick().build().perform();
        a.moveToElement(driver.findElement(By.xpath(""))).click().keyDown(Keys.CONTROL).sendKeys("a").build().perform();//press
        a.moveToElement(driver.findElement(By.xpath(""))).click().keyUp(Keys.CONTROL).build().perform();//release
        a.moveToElement(driver.findElement(By.xpath(""))).contextClick().build().perform();//right click
    }

	}
