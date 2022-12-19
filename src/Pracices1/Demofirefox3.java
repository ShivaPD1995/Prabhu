package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demofirefox3 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.gecko.driver", "./jar/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/shiva/OneDrive/Desktop/L.html");
	Thread.sleep(3000);
	driver.findElement(By.className("e1")).click();
	
	

	}

}
