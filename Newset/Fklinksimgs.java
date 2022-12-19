package Newset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fklinksimgs 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com/");
		d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> e = d.findElements(By.xpath("//img|//a"));
		int f=e.size();
		System.out.println(f);


	}

}
