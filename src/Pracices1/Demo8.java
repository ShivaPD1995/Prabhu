package Pracices1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.Flipkart.com");
		String title=d.getTitle();
		System.out.println(title);
		

	}

}
