package login;
// home button
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class homebutton {
	 public static void main(String[] args)
	    {
	    	String path6="C:\\Users\\itctesting35\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
	    	System.setProperty("webdriver.chrome.driver", path6);
	    	WebDriver driver6= new ChromeDriver();
	    	driver6.get("C:\\Users\\itctesting35\\Desktop\\New folder\\login1.html");
	    	driver6.findElement(By.id("username")).sendKeys("sreelatha24");
	    	driver6.findElement(By.id("Password")).sendKeys("sreelatha24");
	    	driver6.findElement(By.id("submit")).click();
	    	driver6.findElement(By.id("home")).click();
	    	//driver6.close();
	    }

}