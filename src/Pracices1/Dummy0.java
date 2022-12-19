package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy0 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
	WebDriver d=new ChromeDriver();
	Thread.sleep(2000);
	d.manage().window().maximize();
	d.get("http://localhost/user/submit_tt.do");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	Thread.sleep(2000);
	d.findElement(By.xpath("//input[@type='password' and @name='pwd']")).sendKeys("manager");
	Thread.sleep(2000);
	d.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(2000);
	d.findElement(By.xpath("//a[@id='logoutLink']")).click();
	Thread.sleep(2000);
	d.close();
}
}



