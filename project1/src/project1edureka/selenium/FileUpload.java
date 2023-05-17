package project1edureka.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, FindFailed {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium webdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[2]/input[1]")).sendKeys("C:\\Users\\ASUS\\Desktop\\SeleniumPractice\\passportsize.jpg");
	/*	String imagefilepath="C:\\Users\\ASUS\\Desktop\\SeleniumPractice";
		String inputfilepath="C:\\Users\\ASUS\\Desktop\\SeleniumPractice";
		
		Screen s=new Screen();
		
		Pattern FileInputTextBox=new Pattern(imagefilepath+"1.png");
		Pattern OpenButton=new Pattern(inputfilepath+"2.png");
		Thread.sleep(5000);
		
		s.wait(FileInputTextBox,20);
		s.type(FileInputTextBox,inputfilepath+"passportsize.jpg");
		s.click(OpenButton);*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
