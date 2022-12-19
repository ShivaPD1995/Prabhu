package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkslocate 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/H.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Shivakumar P Dhulehole");
		Thread.sleep(2000);
		driver.findElement(By.id("psw")).sendKeys("9874575847");
		Thread.sleep(2000);
		driver.findElement(By.id("check")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("radio")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='text']")).clear();
		Thread.sleep(2000);
		//driver.findElement(By.)).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("check")).clear();
		
		driver.findElement(By.id("radio")).clear();
		driver.close();
	}

}
