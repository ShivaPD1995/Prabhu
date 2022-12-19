package Newset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 Thread.sleep(2000);
		 d.manage().window().maximize();
		 Thread.sleep(2000);
		 d.get("file:///C:/Users/shiva/OneDrive/Desktop/Assignment/html/checkbox.html");
		 Thread.sleep(2000);
		 List<WebElement> Links = d.findElements(By.xpath("//input[@type='checkbox']"));
		 Thread.sleep(2000);
		int n=Links.size();
		Thread.sleep(2000);
		System.out.println(n);
		Thread.sleep(2000);
		for(int i=0;i<n;i++)
		{
			WebElement e=Links.get(i);
			e.click();
			Thread.sleep(1000);
			
			
		}
		for(int i=0;i<n;i++)
		{
			WebElement e1=Links.get(i);
			e1.click();
			Thread.sleep(1000);
		}
		 
	}

	
}
