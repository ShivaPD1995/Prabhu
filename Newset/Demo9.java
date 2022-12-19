package Newset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "./Jar/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']")).click();
		  
		  
		 
		 Thread.sleep(2000);
		 
		driver.quit();

	}

}
