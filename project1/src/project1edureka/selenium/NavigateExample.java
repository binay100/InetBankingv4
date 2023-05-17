package project1edureka.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		
		//max the window
		driver.manage().window().maximize();
		
		//absolute Xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();
		
		//Relative Xpath
		/*driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("oppo");
		driver.findElement(By.xpath("//input[@id='gh-btn']")).click();*/
		
		driver.findElement(By.xpath(""))
		

	}

}
