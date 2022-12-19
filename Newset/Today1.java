package Newset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Today1
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		driver.findElement(By.id("month"));

	}

}
