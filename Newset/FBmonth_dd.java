package Newset;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBmonth_dd
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./Jar/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		WebElement ele = driver.findElement(By.id("month"));
		
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		TreeSet<String> tree=new TreeSet<String>(Collections.reverseOrder());
		for(WebElement p:opt)
		{
			String t = p.getText();
			tree.add(t);
			
		}
		
		for(String wee:tree)
		{
			System.out.println(wee);
		}

	}

}
