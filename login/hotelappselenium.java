package login;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hotelappselenium {
	 public static void main(String[] args)
	   {
		  String path2= "C:\\Users\\itctesting35\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver",path2);
		  WebDriver driver2 =new ChromeDriver();
		 // driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver2.get("https://adactinhotelapp.com/");
		  
		  driver2.findElement(By.id("username")).sendKeys("sree124");
		  driver2.findElement(By.id("password")).sendKeys("sree@124");
		  driver2.findElement(By.id("Login")).click();
		  
		 // Select dropDown=new Select(driver2.findElement(By.id("location")));
		  //dropDown.selectByIndex(2);
				  
		  driver2.close();
	   }

}