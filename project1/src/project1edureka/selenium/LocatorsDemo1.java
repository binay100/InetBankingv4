package project1edureka.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/button[1]")).click();
		driver.findElement(By.className("_3704LK")).sendKeys("tshirts");
		driver.findElement(By.className("_34RNph")).click();
		
		
		
		
		

	}

}
