package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checking
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Jar/chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 d.get("file:///C:/Users/shiva/OneDrive/Desktop/Prabu.html");
		
		 WebElement e=d.findElement(By.id("ppp"));
		 Thread.sleep(2000);
		/* boolean b=e.isSelected();
		 Thread.sleep(2000);
		 if(b)
		 {
			 System.out.println("element is selected");
		 }
		 else
		 {
			 System.out.println("element not selected");
		 }
		 Thread.sleep(2000);*/
		 e.clear();
		 Thread.sleep(2000);
		 d.close();

	}

}
