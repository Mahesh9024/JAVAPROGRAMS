package selenium.basics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindElements {

	public static void main(String[] args) throws Exception {

		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\c5244503\\Desktop\\SELENIUM\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		//To Turns off multiple download warning
		prefs.put("profile.default_content_settings.popups", 0);

		prefs.put( "profile.content_settings.pattern_pairs.*.multiple-automatic-downloads", 1 );

		//Turns off download prompt
		prefs.put("download.prompt_for_download", false);
		                    prefs.put("credentials_enable_service", false);
		//To Stop Save password propmts
		prefs.put("password_manager_enabled", false);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("chrome.switches","--disable-extensions");
		//To Disable any browser notifications
		options.addArguments("--disable-notifications");
		//To disable yellow strip info bar which prompts info messages
		options.addArguments("disable-infobars");

		options.setExperimentalOption("prefs", prefs);
		
		options.addArguments("--test-type");
		driver = new ChromeDriver(options);
		//Log.info("Chrome browser started")
		driver.get("http://www.amazon.in");

		//to get the total number links available in the amazon page
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println("the total number of 'a' tag availabe is:"+linklist.size());
		
		//to get the name of the all 'a' tag
		for(int i=0;i<linklist.size();i++)
		{
			//String str = linklist.get(i).getText();
		//	String str = linklist.get(i).getTagName();//to get the name of the tag
			System.out.println(linklist.get(i).getText());
		}
		Thread.sleep(2000);
		driver.quit();
	}
	
}
