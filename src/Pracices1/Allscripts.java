package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allscripts 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 d.get("https://www.instagram.com/accounts/login/");
		 WebElement e=d.findElement(By.xpath("//a[.='Forgot password?']"));
		 Point locn=e.getLocation();
		 System.out.println(locn);

	}

}
