package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prabhu 
{

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 d.get("file:///C:/Users/shiva/OneDrive/Desktop/Prabu.html");
		 Thread.sleep(2000);
		 d.manage().window().maximize();
		 WebElement ele=d.findElement(By.id("prabhu"));
		 Thread.sleep(2000);
		 WebElement ele1=d.findElement(By.id("ppp"));
		 Thread.sleep(2000);
		 ele.sendKeys(Keys.CONTROL+"ac");
		 Thread.sleep(2000);
		 ele1.sendKeys(Keys.CONTROL+"av");
		 d.findElement(By.id("1")).click();
		 

	}

}
