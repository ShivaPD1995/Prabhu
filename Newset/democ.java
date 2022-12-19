package Newset;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class democ 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.google.com/");
		d.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		d.navigate().back();
		Thread.sleep(2000);
		d.navigate().forward();
		Thread.sleep(2000);
		d.navigate().refresh();
		Dimension e=new Dimension(200, 250);
		d.manage().window().setSize(e);
		Thread.sleep(2000);
		Point p=new Point(600, 650);
		d.manage().window().setPosition(p);
		
	}

}
