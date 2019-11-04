import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Basic {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c5244503\\Desktop\\SELENIUM\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("http://www.amazon.in");
		Thread.sleep(6000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]"));
		Thread.sleep(5000);
		act.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-signin\"]/a/span")).click();
		
		
		
	}

}
