package Pracices1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo6 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.gecko.driver","./Jar/geckodriver.exe");
		WebDriver d1=new FirefoxDriver();
		Thread.sleep(3000);
		d1.quit();
		
		
	}
}

