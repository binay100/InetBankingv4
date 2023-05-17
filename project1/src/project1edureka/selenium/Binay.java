package project1edureka.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Binay {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\selenium webdriver\\geckodriver-v0.31.0-win64\\geckodriver.exe\\");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();  

	}

}
