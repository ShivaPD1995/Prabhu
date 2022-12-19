package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubesong
{

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 Thread.sleep(5000);
		 d.manage().window().maximize();
		 Thread.sleep(2000);
		 d.get("https://www.youtube.com/");
		 Thread.sleep(5000);
		 d.findElement(By.xpath("//input[@id='search']")).sendKeys("Memories maroon5");
		 Thread.sleep(5000);
		 d.findElement(By.xpath("//button[@class='style-scope ytd-searchbox' and @id='search-icon-legacy']")).click();
		 Thread.sleep(5000);
		 d.findElement(By.xpath("//a[@href='/watch?v=SlPhMPnQ58k' and @id='video-title']")).click();
		 Thread.sleep(5000);
		 d.findElement(By.xpath("//yt-formatted-string[contains(text(),'Subscribe')]")).click();
		 Thread.sleep(2000);
		 d.findElement(By.xpath("//tp-yt-paper-button[@class='dropdown-trigger style-scope yt-dropdown-menu' and @aria-label='Sort comments' ]")).click();

	}

}
