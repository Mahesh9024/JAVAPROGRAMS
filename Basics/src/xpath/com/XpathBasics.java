package xpath.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBasics {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c5244503\\Desktop\\SELENIUM\\chromedriver1.exe");
		driver = new ChromeDriver();
		driver.get("https://freecrm.com/");
		Thread.sleep(3000);
		
		
		
		
	}

}
