package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///D:/H.html");
		Thread.sleep(1000);
		driver.findElement(By.id("uname")).sendKeys("Shivakumar Dhulehole");
		Thread.sleep(2000);                                                                          
		driver.findElement(By.id("psw")).sendKeys("Shiva123456#");
		Thread.sleep(2000);
		driver.findElement(By.id("check")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("radio")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("a")).click();
		Thread.sleep(2000);

	}

}
