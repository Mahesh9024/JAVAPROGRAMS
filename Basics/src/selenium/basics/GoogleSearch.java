package selenium.basics;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c5244503\\Desktop\\SELENIUM\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	WebElement ele = driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @title='Search']"));
	ele.sendKeys("testing");
	Thread.sleep(3000);
	
	//to select "testing interview questions" from the google search filed
	//List<WebElement> li = driver.findElements(By.xpath("//ul[@aria-dropeffect='move']//li/descendant::div[@class='']"));
		
	}

}
