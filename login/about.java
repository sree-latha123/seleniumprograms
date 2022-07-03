package login;
// about us 
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class about {
	 public static void main(String []args)
     {
    	 String path4="C:\\Users\\itctesting35\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
    	 System.setProperty("webdriver.chrome.driver", path4);
    	 WebDriver driver4=new ChromeDriver();
    	 driver4.get("C:\\Users\\itctesting35\\Desktop\\New folder\\login1.html");
    	 driver4.findElement(By.id("username")).sendKeys("sreelatha24");
    	 driver4.findElement(By.id("Password")).sendKeys("sreelatha24");
    	 driver4.findElement(By.id("submit")).click();
    	 driver4.findElement(By.id("about")).click();
    	 //driver4.close();
     }

}

