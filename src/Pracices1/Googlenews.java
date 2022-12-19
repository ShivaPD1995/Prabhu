package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlenews 
{

	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
		 WebDriver d=new ChromeDriver();
		 d.get("https://news.google.com/topstories?hl=en-IN&gl=IN&ceid=IN:en");
		 d.findElement(By.xpath("//input[@aria-haspopup='true']")).sendKeys("Karnataka news");
		 d.findElement(By.xpath("//input[@aria-haspopup='true']")).click();
		 d.findElement(By.xpath("//a[@href='./articles/CAIiECICVSjXYPQXM3brjHoz_WIqGAgEKg8IACoHCAow3rvTBDD89X4w8YzmBQ?uo=CAUiigFodHRwczovL2luZGlhbmV4cHJlc3MuY29tL2FydGljbGUvY2l0aWVzL2JhbmdhbG9yZS9rYXJuYXRha2EtYmVuZ2FsdXJ1LWxhdGVzdC1uZXdzLWJhc2F2YXJhai1ib21tYWktZGFrc2hpbmEta2FubmFkYS1ianAtY29uZ3Jlc3MtODA1NjAyMy_SAQA&hl=en-IN&gl=IN&ceid=IN%3Aen'][1]"));
		 

	}

}
