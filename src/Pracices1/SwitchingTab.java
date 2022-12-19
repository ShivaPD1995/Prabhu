package Pracices1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchingTab
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./Jar/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
		String pid= driver.getWindowHandle();
		Set<String> wh=driver.getWindowHandles();
		int count=wh.size();
		System.out.println(count);
		Thread.sleep(2000);
		System.out.println(pid);

		for(String wh1:wh)
		{
			System.out.println(wh1);
			driver.switchTo().window(wh1);
			driver.manage().window().maximize();

			String title=driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			driver.close();
		}

	}

}
