package Pracices1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1
{

	public static void main(String[] args)
	{
		String key="webdriver.gecko.driver";
		String value="./Jar/geckodriver.exe";
		System.setProperty(key, value);

		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("file:///C:/Users/shiva/OneDrive/Desktop/upload.html");
		WebElement ele = driver.findElement(By.xpath("//input[@type='file']"));
		ele.click();
		ele.sendKeys("C:\\Users\\shiva\\OneDrive\\Desktop\\project1\\");


		//driver.navigate().refresh();

	}

}
