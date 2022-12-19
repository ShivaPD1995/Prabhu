package Newset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Kamat 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/shiva/OneDrive/Desktop/kamat.html");
		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.id("Kamat"));
		Thread.sleep(2000);

		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);

		s.selectByValue("k");
		Thread.sleep(2000);

		s.selectByVisibleText("paneer fry");
		

	}

}
