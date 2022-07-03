package login;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class forgot {
	 public static void main(String []args)
	  {
		  String path2="C:\\Users\\itctesting35\\Downloads\\chromedriver_win32 (1)\\ chromedriver.exe";
		  System.setProperty("webdriver.chrome.driver", path2);
		  WebDriver driver2= new ChromeDriver();
		  driver2.get("file:///C:/Users/itctesting35/Desktop/New%20folder/login1.html");
		  
		  driver2.findElement(By.id("forgot password")).click();
		  driver2.findElement(By.id("text")).sendKeys("BELLAM  SREELATHA");
		  driver2.findElement(By.id("username")).sendKeys("sreelatha246");
		  driver2.findElement(By.id("email_id")).sendKeys("sreelatha246@gmail.com");
		  driver2.findElement(By.id("number")).sendKeys("6303474047");
		  driver2.findElement(By.id("Password")).sendKeys("sreelatha24");
		  driver2.findElement(By.id("ConfirmPassword")).sendKeys("sreelatha24");
		  driver2.findElement(By.id("submit")).click();
		  driver2.findElement(By.id("username")).sendKeys("sreelatha24");
		  driver2.findElement(By.id("Password")).sendKeys("sreelatha24");
		  driver2.findElement(By.id("submit")).click(); 
		  
		 // driver2.close();
		  
	  }

}