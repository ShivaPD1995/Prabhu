package Pracices1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_dnlwd_popup
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./Jar/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		for(String wh:allwh)
		{
			System.out.println(wh);
		}
	}

}
