package demoBlazeLogin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CaptureLaptops {

	

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--incognito");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(4000);
		String page=driver.findElement(By.xpath("//a[@id='nava']")).getText();
		if(page.equals("PRODUCT STORE"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
		
		driver.findElement(By.xpath("//a[@id='itemc'][3]")).click();
		System.out.println("All the Laptops ");
		System.out.println("------------------------");
		
		List<WebElement> ele=driver.findElements(By.xpath("//a[@class='hrefch']"));
		List<WebElement> price=driver.findElements(By.xpath("//div[@class='row']//div[@class='card-block']//h5"));
		
		System.out.println("Total number of Laptops:"+ele.size());
		System.out.println("------------------------");
		for(WebElement pri:price) {
		//for(WebElement element:ele)
		//{
			
			//System.out.println(element.getText()+"::"+pri.getText());
			System.out.println(pri.getText());
		}//}
		Thread.sleep(2000);
		driver.quit();
	}

}
