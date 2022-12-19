package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textfields
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/shiva/OneDrive/Desktop/Textfields.html");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("a1"));
		Thread.sleep(2000);
		WebElement ele1=driver.findElement(By.id("a2"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(2000);
		ele1.sendKeys(Keys.CONTROL+"av");
	}

}
