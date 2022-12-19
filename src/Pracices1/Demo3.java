package Pracices1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo3 
{

	public static void main(String[] args) 
	{
		String key="webdriver.gecko.driver";
		String value="./Jar/geckodriver.exe";
		System.setProperty(key, value);
		
		FirefoxDriver driver=new FirefoxDriver();
		
		String key1="webdriver.chrome.driver";
		String value1="./jar/chromedriver.exe";
		System.setProperty(key1, value1);
		ChromeDriver d=new ChromeDriver();
	}

}
