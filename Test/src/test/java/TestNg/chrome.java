package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chrome {
	WebDriver driver;
	
	@Test
	public void Launchurl(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
	}
	@Test
	public void find() {
		driver.findElement(By.id("search")).sendKeys("mobiles",Keys.ENTER);

	}
}
