package project1edureka.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VeryfyDropDownOption1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement element=driver.findElement(By.id("products"));
		Select se=new Select(element);
		
		List originallist=new ArrayList();
		List templist= new ArrayList();
		
		
		List<WebElement>options=se.getOptions();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
