package Selenium.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		//Alert box
		driver.findElement(By.id("alertBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		//confirmBox
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.id("output")).getText());
		Thread.sleep(3000);
		driver.findElement(By.id("confirmBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("output")).getText());
		
		//promptBox
		driver.findElement(By.id("promptBox")).click();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		 driver.switchTo().alert().sendKeys("Ravi Teja");
		 driver.switchTo().alert().accept();
		 System.out.println(driver.findElement(By.id("output")).getText());
		
		
	}

}
