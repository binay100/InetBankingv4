package project1edureka.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		List<WebElement>link=driver.findElements(By.tagName("a"));
		
		//Number of Links
		System.out.println(link.size());
		
		for(int i=0;i<=link.size();i++)
		{
			//By Using HERF attribute We can Get URL or Required Link
			WebElement element=link.get(i);
			String url=element.getAttribute("href");
			URL links=new URL(url);
			
			//Create a Connection Using url link
			
			HttpURLConnection httpconn=(HttpURLConnection)links.openConnection();
			
			//wait for 2 min
			Thread.sleep(2000);
			
			//Establish connection
			httpconn.connect();
			
			
			int rescode=httpconn.getResponseCode();
			if(rescode>=400)
			{
				System.out.println(url+"  "+"is broken link");
				
			}
			else
			{
				System.out.println(url+ "  "+ "is valid link");
				
			}
		}
		
		
		
		
		

	}

}
