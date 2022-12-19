package Newset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Href_amazon
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.in/");
		List<WebElement> e = d.findElements(By.xpath("//a"));
		
		int f=e.size();
		System.out.println(f);
		
		for(WebElement g:e)
		{
			String h = g.getAttribute("href");
			System.out.println(h);
			
		}
		
		

	}

}
