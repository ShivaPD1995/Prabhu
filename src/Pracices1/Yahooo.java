package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahooo 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
		WebDriver kb=new ChromeDriver();
		kb.get("https://in.search.yahoo.com/?fr2=inr");
		kb.manage().window().maximize();
		Thread.sleep(2000);
		kb.findElement(By.xpath("//div[@class='text' and @title='Sign In']")).click();
		Thread.sleep(2000);
		kb.findElement(By.xpath("//input[@class='phone-no ' and @name='username']")).sendKeys("ddemo1414@yahoo.com");
		Thread.sleep(2000);
		kb.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		kb.findElement(By.xpath("//input[@type='password']")).sendKeys("Qwerty141414#");
		Thread.sleep(2000);
		kb.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		kb.findElement(By.xpath("//div[@class='icon mail']")).click();
		Thread.sleep(2000);
		kb.findElement(By.xpath("//a[@role='button']")).click();
		Thread.sleep(2000);
		kb.findElement(By.xpath("//input[@role='combobox' and @spellcheck='false' and @id='message-to-field']")).sendKeys("kabkb@yahoo.com");
		kb.findElement(By.xpath("//input[@data-test-id='compose-subject']")).sendKeys("Meaasge");
		Thread.sleep(2000);
		kb.findElement(By.xpath("//div[@data-test-id='rte']")).sendKeys("Good Night");
		Thread.sleep(2000);
		kb.findElement(By.xpath("//button[@data-test-id='compose-send-button']")).click();
		
		

	}

}
