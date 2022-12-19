package Newset;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_elesession1 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		 System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 d.get("https://Facebook.com");
		 Thread.sleep(2000);
		 d.manage().window().maximize();
		 WebElement e=d.findElement(By.xpath("//a[.='ಕನ್ನಡ']"));
		 Thread.sleep(2000);
	     String io	= d.getCurrentUrl();
		 System.out.println("The Current URL of the page is "+io);
		 
		 String po=d.getTitle();
		 System.out.println("The Title of the page is "+po);
		 
		 String uo=d.getPageSource();
		 System.out.println("the page source of the given page is"+uo);
		 
		 String gh= e.getAttribute("e");
		 System.out.println(gh);
		 Thread.sleep(2000);
		  
		 d.close();

	}

}
