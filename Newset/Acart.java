package Newset;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acart
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get("https://www.amazon.in/");
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Sonata Men Watches");
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@class='nav-issFlyout nav-flyout']/div/div[1]")).click();
		d.findElement(By.xpath("//div[@data-asin='B00HPSPBX6']")).click();
		Set<String> allwh = d.getWindowHandles();
		int count = allwh.size();
		System.out.println(count);
		Thread.sleep(2000);
		ArrayList<String> l=new ArrayList<String>(allwh);
		String c = l.get(1);
		d.switchTo().window(c);
		Thread.sleep(2000);
		d.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();

       }
   }



