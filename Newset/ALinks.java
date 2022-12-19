package Newset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALinks 
{

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 d.get("https://www.amazon.in/");
		 List<WebElement> e = d.findElements(By.xpath("//img"));
		int f=e.size();
		 System.out.println(f);
		 

	}

}
