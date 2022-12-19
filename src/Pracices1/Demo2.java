package Pracices1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	String key="webdriver.chrome.driver";
	String value="./jar/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.close();
	

	}

}
