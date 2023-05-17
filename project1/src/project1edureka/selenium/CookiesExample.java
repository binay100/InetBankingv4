package project1edureka.selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		
	
	Set<Cookie>cookies=driver.manage().getCookies();	
	System.out.println("Size of the Cookies:"+cookies.size());
	
	/*for(Cookie cookie:cookies)   //Read and Print all cookies 
	{
		
		System.out.println(cookie.getName()+":" +cookie.getValue());   //Print Name and Value Of the cookies.
				
	}*/
		//System.out.println(driver.manage().getCookieNamed("session-id-time"));  // For the Specific cookies Name
		
	//Add the new Cookies
		Cookie cobj=new Cookie("My cookies","123456789"); //Creating the Objects of the cookies
		
		driver.manage().addCookie(cobj);
	System.out.println("Size of the cookies" +cookies.size());//Print Size Of the cookies
	
	cookies=driver.manage().getCookies();
	
	for(Cookie cookie:cookies)   //Read and Print all cookies 
	{
		System.out.println(cookie.getName()+":" +cookie.getValue());   //Print Name and Value Of the cookies.
	}
	
	
	//Deleting the cookies
	driver.manage().deleteCookie(cobj);
	cookies=driver.manage().getCookies();
	System.out.println("Size of the Cookies :" +cookies.size());
	
	for(Cookie cookie:cookies)   //Read and Print all cookies 
	{
		System.out.println(cookie.getName()+":" +cookie.getValue());   //Print Name and Value Of the cookies.
	}
	
	driver.manage().deleteAllCookies();
	cookies=driver.manage().getCookies();
	System.out.println("Size of the Cookies :" +cookies.size());
	driver.quit();	
		
    	}

}
