package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebshop 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/Chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://demowebshop.tricentis.com/");
		Thread.sleep(5000);
		d.manage().window().maximize();
		d.findElement(By.xpath("//a[@href='/books'][1]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button'][1]")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath("//div[@class='product-grid']/div[3] /div[1]/div[2]/div[3]/div[2]/input")).click();
		d.findElement(By.xpath("//span[.='Shopping cart']")).click();
		
	}

}
