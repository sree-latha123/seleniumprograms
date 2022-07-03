package login;
// admin page
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class admin {
	 public static void main(String []args)
     {
   	  String path5="C:\\Users\\itctesting35\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
   	  System.setProperty("webdriver.chrome.driver", path5);
   	  WebDriver driver5=new ChromeDriver();
         driver5.get("file:///C:/Users/itctesting35/Desktop/New%20folder/login1.html");
         driver5.findElement(By.id("username")).sendKeys("sreelatha24");
         driver5.findElement(By.id("Password")).sendKeys("sreelatha24");
         driver5.findElement(By.id("submit")).click();
         driver5.findElement(By.id("btn")).click();
         driver5.findElement(By.id("username")).sendKeys("Team1");
         driver5.findElement(By.id("Password")).sendKeys("Team1@1");
         driver5.findElement(By.id("btn")).click();
        // driver5.close();
     }

}