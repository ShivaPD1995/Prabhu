package locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myweb 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Jar.chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/shiva/OneDrive/Desktop/Link.html");
		Thread.sleep(2000);
		driver.findElement(By.id("q1")).click();

	}

}
