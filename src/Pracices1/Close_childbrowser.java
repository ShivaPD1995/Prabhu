package Pracices1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Close_childbrowser
{

		public static void main(String[] args) throws InterruptedException, AWTException
		{
			System.setProperty("webdriver.gecko.driver", "./Jar/geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
			Actions act=new Actions(driver);
			Thread.sleep(2000);
			act.contextClick(ele).perform();
			Thread.sleep(2000);
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_T);
			r.keyRelease(KeyEvent.VK_T);
			String pid = driver.getWindowHandle();
			Set<String> allwh = driver.getWindowHandles();

			int count = allwh.size();
			System.out.println(count);
			allwh.remove(pid);
			Thread.sleep(2000);
			int count1 = allwh.size();
			System.out.println(count1);
			for(String wh:allwh)
			{
				driver.switchTo().window(wh);
				Thread.sleep(2000);
				String t = driver.getTitle();
				System.out.println(t);
				Thread.sleep(2000);
				driver.close();

			}

	}

}
