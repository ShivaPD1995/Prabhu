package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Act_drg_drp
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./KBCD/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.xpath("//div[@id='box5']"));
		WebElement dst = driver.findElement(By.xpath("//div[@id='box105']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);

		act.dragAndDrop(ele, dst).perform();


	}

}
