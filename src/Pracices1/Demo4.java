package Pracices1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}

}
