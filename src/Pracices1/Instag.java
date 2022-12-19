package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instag 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./Jar/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("9845222579");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("9875222579");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[type='button']")).click();
		Thread.sleep(2000);
		
		/*driver.findElement(By.id("email")).sendKeys("9874555875");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("1245789563");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();*/
		//driver.findElement(By.cssSelector("a[href='/watch?v=RlOB3UALvrQ\']")).click();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
	}

}
