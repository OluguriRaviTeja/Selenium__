package Selenium.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		String Title = driver.getTitle();
		System.out.println("the title is :"+Title);
		
		String PageSource =driver.getPageSource();
		System.out.println("the pageSource is :"+PageSource);
//		driver.navigate().to("https://www.gmail.com/");
//		driver.navigate().back();
//		driver.navigate().forward();
		String currenturl = driver.getCurrentUrl();
		System.out.println("the currentUrl is :"+currenturl);
		
//		WebElement accounts = driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
//		Actions action = new Actions(driver);
////		action.moveToElement(accounts).click().perform();
//		driver.findElement(By.id("ap_email")).sendKeys("8919396482");
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("ap_password")).sendKeys("9347874856");
//		driver.findElement(By.id("signInSubmit")).click();
//		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String search = "//input[@name='q']";
		driver.findElement(By.xpath(search)).sendKeys("mobiles",Keys.ENTER);
	}
}
