package Newset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_upload
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Jar/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("file:///C:/Users/shiva/OneDrive/Desktop/upload.html");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		Thread.sleep(2000);
		ele.sendKeys("\"D:\\Project\\Book1.xlsx\"");
	}

}
