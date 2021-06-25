package Selenium.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Addtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		//Search keyword mobiles
		WebElement accounts = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Actions action = new Actions(driver);
		action.moveToElement(accounts).click().sendKeys("mobiles",Keys.ENTER).perform();
		
		//click on a selectedmobile
		WebElement Samsung = driver.findElement(By.xpath("//span[contains(text(),'Samsung Galaxy Note 20 Ultra 5G Factory Unlocked Android Cell Phone, US Version, 128GB of Storage, Mobile Gaming Smartphone, Long-Lasting Battery, Mystic Bronze')]"));
		Actions ss = new Actions(driver);
		ss.moveToElement(Samsung).click().perform();
		
		//Add to cart
		WebElement Add = driver.findElement(By.id("add-to-cart-button"));
		Actions dd = new Actions(driver);
		dd.moveToElement(Add).click().perform();
	
		
	}

}
