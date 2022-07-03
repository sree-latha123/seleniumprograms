package login;
// login page and blood & organ registration  
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class bloodorgandonationform {
	public static void main(String []args)
	{
	   String path3="C:\\Users\\itctesting35\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
	   System.setProperty("webdriver.chrome.driver", path3);
	   WebDriver driver3=new ChromeDriver();
	   driver3.get("C:\\Users\\itctesting35\\Desktop\\New folder\\login1.html");
	   driver3.findElement(By.id("username")).sendKeys("sreelatha24");
	   driver3.findElement(By.id("Password")).sendKeys("sreelatha24");
	   driver3.findElement(By.id("submit")).click();
	    //blood & organ register form
	   driver3.findElement(By.id("blood & organ")).click();
	   driver3.findElement(By.id("First_Name")).sendKeys("sreelatha24");
	   driver3.findElement(By.id("Last_Name")).sendKeys("bellam");
	   driver3.findElement(By.id("date")).sendKeys("02-03-2000");
	   driver3.findElement(By.id("Email_Id")).sendKeys("sreelatha246@gmail.com");
	   driver3.findElement(By.id("Mobile_Number")).sendKeys("6303474047");
	   WebElement radio1=driver3.findElement(By.id("female"));
	   radio1.click();
	   driver3.findElement(By.id("Address")).sendKeys("1-37, mudigubba, Ananthapuram, AndhraPradesh");
	   driver3.findElement(By.id("City")).sendKeys("Ananthapuram");
	   driver3.findElement(By.id("Pincode")).sendKeys("515511");
	   WebElement ddrop = driver3.findElement(By.id("text"));
	   Select select = new Select(ddrop);
	   select.selectByIndex(1);
	   
	   WebElement radio2=driver3.findElement(By.id("AB+"));
	   radio2.click();
	   driver3.findElement(By.id("Eyes")).click();
	   driver3.findElement(By.id("Heart")).click();
	   driver3.findElement(By.id("Lung")).click();
	   driver3.findElement(By.id("Pancreas")).click();
	   
	   driver3.findElement(By.id("adhaar")).sendKeys("6303474047");
	   driver3.findElement(By.id("submit")).click();
	 //  driver3.close();
		
		
		
		
	}

}