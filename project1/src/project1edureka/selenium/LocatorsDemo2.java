package project1edureka.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		driver.manage().window().maximize();
		
		// Xpath Axes Self
		String text=driver.findElement(By.xpath("//a[contains(text(),'Goyal Aluminiums')]/self::a")).getText();
		System.out.println(text);
		
		//Xpath Axes parent
		String text1=driver.findElement(By.xpath("//a[contains(text(),'Marble City India')]/parent::td")).getText();
		System.out.println(text1);
		
		
	}

}
