package Selenium.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		//single window
//		String ParentWindowHandle = driver.getWindowHandle();
//		System.out.println("parent window handle -"+ ParentWindowHandle +driver.getTitle());
//		driver.findElement(By.id("newWindowBtn")).click();
//		Set<String> WindowHandles = driver.getWindowHandles();
//		for(String WindowHandle : WindowHandles)
//		{
//			if(!WindowHandle.equals(ParentWindowHandle)) {
//				driver.switchTo().window(WindowHandle);
//				driver.manage().window().maximize();
//				driver.findElement(By.id("firstName")).sendKeys("Ravi teja");
//				Thread.sleep(2000);
//				driver.close();
//				Thread.sleep(3000);
//			}
//		}
//		driver.switchTo().window(ParentWindowHandle);
//		driver.findElement(By.id("name")).sendKeys("Prince");
//		Thread.sleep(3000);
//		driver.close();
		
		//single tab
		String ParentWindowHandle = driver.getWindowHandle();
		System.out.println("parent handle"+ ParentWindowHandle +driver.getTitle());
		driver.findElement(By.id("newTabBtn")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String windowhandle : windowHandles) {
			if(!windowhandle.equals(ParentWindowHandle)) {
				driver.switchTo().window(windowhandle);
				System.out.println(driver.findElement(By.id("output")).getText());
				driver.findElement(By.id("alertBox")).click();
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement( By.id("output")).getText());
			}
		}
		
	}

}
