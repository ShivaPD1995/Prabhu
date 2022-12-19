package Newset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoa 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		 Thread.sleep(2000);
		 WebElement a = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		 Thread.sleep(2000);
		 String att = a.getAttribute("href");
		 Thread.sleep(2000);
		 System.out.println(att);
	}

}
