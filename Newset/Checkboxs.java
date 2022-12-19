package Newset;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Checkboxs
{

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./Jar/geckodriver.exe");
	WebDriver d=new FirefoxDriver();

	//FirefoxDriver driver = new FirefoxDriver();

	d.manage().window().maximize();
	d.get("file:///C:/Users/shiva/OneDrive/Desktop/Assignment/html/checkbox.html");

	List<WebElement> e = d.findElements(By.xpath("//input[@type='checkbox']"));
	int f = e.size();
	System.out.println(f);
	for(int i=0;i<f;i++)
	{
		WebElement g=e.get(i);
		g.click();
		//Thread.sleep(2000);
	}
	for(int i=0;i<f;i++)
	{
		WebElement h=e.get(i);
		h.click();
		//Thread.sleep(2000);
	}

	d.quit();
	}


}
