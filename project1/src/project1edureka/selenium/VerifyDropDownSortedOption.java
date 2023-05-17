package project1edureka.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOption {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\selenium webdriver\\chromedriver_win32\\chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://testautomationpractice.blogspot.com/");
		 driver.manage().window().maximize();
		 
		 WebElement element=driver.findElement(By.id("animals"));
		 Select se= new Select(element);
		 
		List originallist=new ArrayList();
		 List templist=new ArrayList();
		 
		 List <WebElement>options=se.getOptions();
		 
		 for(WebElement e:options)
		 
		 {
		    
			originallist.add(e.getText());
		    templist.add(e.getText());
		   
		 }
		 System.out.println("OriginalList : "+originallist);
		 System.out.println("Templist :"+ templist);
		 
		 Collections.sort(templist);
		 
		 System.out.println("After sorting OriginalList:"+originallist );
		 System.out.println("After sorting tempList"+templist);
		 
		 if(originallist==templist)
		 {
			 System.out.println("DropDown is sorted");
		 }
		 else
		 {
			System.out.println("Dropdown is not sorted");
			
		 }
		 driver.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		

	}

}
