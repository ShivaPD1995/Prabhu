package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Yahoo_logout
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@title='Sign In']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("ddemo1414@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Qwerty141414#");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name='verifyPassword']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='icon mail']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@aria-label='Compose']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("kabkb@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("About Confirmation latter");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Hi Send your Confirmation letter to me for the confirmation. Thank you.");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Send']")).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//span[@role='presentation']"));
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Sign out']")).click();



	}


}
