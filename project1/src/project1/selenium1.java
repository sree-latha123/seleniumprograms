package project1;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium1 {
	public static void main(String args[])
	{
		String path2="D:\\chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path2);
		WebDriver driver2=new ChromeDriver();
		driver2.get("https://adactinhotelapp.com/");

		driver2.findElement(By.id("username")).sendKeys("sree123");
		driver2.findElement(By.id("password")).sendKeys("sree123");
		driver2.findElement(By.id("Login")).click();
		driver2.close();
		
	}

	
}
