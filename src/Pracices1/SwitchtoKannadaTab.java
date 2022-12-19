package Pracices1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchtoKannadaTab
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver", "./Jar/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.contextClick(ele).perform();
		Thread.sleep(2000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);

		Set<String> allwh = driver.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		ArrayList<String> l=new ArrayList<String>(allwh);
		int count1 = l.size();
		System.out.println(count1);
		String c = l.get(1);
		Thread.sleep(2000);
		driver.switchTo().window(c);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_WINDOWS);
		//Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		r.keyRelease(KeyEvent.VK_WINDOWS);

		driver.manage().window().maximize();

		r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
	}

}

