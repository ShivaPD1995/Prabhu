package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
    //WebElement ele=		driver.findElement(By.name("q")).sendKeys("Shivakumar Dhulehole");
		
		WebElement ele = driver.findElement(By.name("q"));
        ele.sendKeys("www.Flipkart.com");
        ele.click();
	}

}   
