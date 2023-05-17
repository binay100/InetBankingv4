package project1edureka.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\selenium webdriver\\geckodriver-v0.31.0-win64\\geckodriver.exe\\");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();  
		driver.findElement(By.id("identifierId")).sendKeys("binaykumar027@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		String at = driver.getTitle();
		String et = "gmail";
		driver.close();
		if(at.equalsIgnoreCase(et))
		{
			System.out.println("Test successfull");
			
		}
		else
			System.out.println("test is unsuccessful");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
