package Pracices1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Jar/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");

	}

}
