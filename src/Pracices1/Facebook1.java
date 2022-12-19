package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text' and @name='email']")).sendKeys("9845222579");
		driver.findElement(By.xpath("//input[@name='pass' and @id='pass']")).sendKeys("7854585478");
		driver.findElement(By.xpath("//button[@name='login' and @type='submit']")).click();
	}

}
