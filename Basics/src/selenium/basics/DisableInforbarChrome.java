package selenium.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisableInforbarChrome {

	public static void main(String[] args) {

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c5244503\\Desktop\\SELENIUM\\chromedriver.exe");
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-infobars");
		
		driver=new ChromeDriver(opt);
		
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		//driver.quit();
		
		
		
	}

}
