package locator1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LP1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./KBCD/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//input[@type='text'][1]"));
		Thread.sleep(2000);
		ele.sendKeys("karibasappa");
		WebElement ele1=driver.findElement(By.cssSelector("_2IX_2- _3mctLh VJZDxU"));
		Thread.sleep(2000);
		ele1.sendKeys("PRabhupatil");
		WebElement ele2=driver.findElement(By.linkText("Login"));
		ele2.click();
		
		
		
		

	}

}
