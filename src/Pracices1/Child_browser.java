package Pracices1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Child_browser
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Jar/geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		Thread.sleep(2000);
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
			int count = allwh.size();
		System.out.println(count);
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
			String title = driver.getTitle();
			System.out.println(title);
		}
	}

}
