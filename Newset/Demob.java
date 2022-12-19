package Newset;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demob 
{

	public static void main(String[] args) throws InterruptedException 
	{
System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		 WebElement a = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		 Point b = a.getLocation();
		 System.out.println(b);
		 Thread.sleep(2000);
		 
		 int c = b.getX();
		 System.out.println(c);
		 Thread.sleep(2000);
		 int e = b.getY();
		 System.out.println(e);
		 Thread.sleep(2000);
		 //driver.close();
	}

}
