package project1edureka.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadingFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		*/
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\selenium webdriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		
		
		
		//driver.get("https://demo.automationtesting.in/Register.html");
		
		
		
	//	driver.manage().window().maximize();
		
		//Create a Firefox profile
		FirefoxProfile profile= new FirefoxProfile();
		
		//Set preferences
		
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/zip");
		profile.setPreference("browser.download.manager.showWhenStarting",false);
		
		FirefoxOptions option=new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://testingmasters.com//student-corner/download/");
		
		
		

	}

}
