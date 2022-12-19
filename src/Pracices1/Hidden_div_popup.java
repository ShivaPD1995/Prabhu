package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_div_popup
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.cleartrip.com/flights");
		Thread.sleep(2000);
		driver.findElement(By.className("//div[@class='pt-6 pb-6 flex flex-top flex-between ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='Tue, Aug 16'][1])"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[.='17'][1])")).click();


	}

}
