package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubelike
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.Youtube.com");
		Thread.sleep(5000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='search']")).sendKeys("Marvel New Trailer");
		Thread.sleep(5000);
		d.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//a[@id='video-title' and  @href='/watch?v=u7JsKhI2An0']")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//ytd-toggle-button-renderer[@class='style-scope ytd-menu-renderer force-icon-button style-text']")).click();
		
		
	}

}
