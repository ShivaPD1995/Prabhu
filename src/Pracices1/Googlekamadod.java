package Pracices1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlekamadod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		Thread.sleep(500);
		driver.get("https://www.google.co.in/maps/@12.9728512,77.6077312,12z?hl=en");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='searchboxinput']")).sendKeys(" Kamadod ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='searchboxinput']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@jstcache='48' and @jsan='7.XYuRPe' and @jsinstance='*0' ][1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='Directions']")).click();
		
		
		
		
		
		
		
		/*driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-controls='sbsg51']")).clear();
driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-controls='sbsg51']")).sendKeys("Bangalore");
Thread.sleep(500);
driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-controls='sbsg52']")).sendKeys("Ranebennur");
Thread.sleep(500);
driver.findElement(By.xpath("//input[@class='tactile-searchbox-input' and @aria-controls='sbsg52']")).click();*/


	}

}
