package Newset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_links_src 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		Thread.sleep(2000);
		List<WebElement> e = d.findElements(By.xpath("//a"));
		List<WebElement> s = d.findElements(By.xpath("//img"));
		int f=e.size();
		System.out.println(f);
		Thread.sleep(2000);
		for(WebElement g:e)
		{
		String h=g.getAttribute("href");
		System.out.println(h);
		}
		Thread.sleep(2000);
		
		int t=s.size();
		System.out.println(t);
		for(WebElement i:s)
		{
			String k=i.getAttribute("src");
			System.out.println(k);
		}
			


	}

}
