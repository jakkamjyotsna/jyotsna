package demoBlazeLogin;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LogIn {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(2000);
		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//h5[text()='Log in']")).isDisplayed());
		driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("Asdfy@1234");
		driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("Asdfy@1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(5000);
		String actual=driver.findElement(By.id("logout2")).getText();
		if(actual.equals("Log out"))
		{
			System.out.println("Test pass");
		}
		else
		{
			System.out.println("Test case fail");
		}
	
		Thread.sleep(5000);
		driver.quit();
	}

}
