package Newset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cboxes 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("file:///C:/Users/shiva/OneDrive/Desktop/C1.html");
		List<WebElement> e = d.findElements(By.xpath("//input"));
		int f=e.size();
		Thread.sleep(2000);
		System.out.println(f);
		Thread.sleep(2000);
		for(WebElement g:e)
		{
			//Thread.sleep(2000);
			g.sendKeys("Shivakumar");
			Thread.sleep(2000);
		}
		for(int i=f-1;i>=0;i--)
			
		{
			WebElement h=e.get(i);
			h.clear();
			Thread.sleep(2000);
			
			//Thread.sleep(2000);
		}

	}
}
		

	


