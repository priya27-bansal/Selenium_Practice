package Practice1;

import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickNGetAllLinks {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "E:\\Study\\drivers_jars\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java", Keys.ENTER);
		List <WebElement> allLinks= driver.findElements(By.cssSelector(".r>a"));
		int linksCount = allLinks.size();
		System.out.println("Total no of links Available: "+linksCount);
		String[] links = null;
		links= new String[linksCount];
		System.out.println("List of links Available: ");  
		// print all the links from page 
		
		for(int i=0;i<linksCount;i++)
		{
			links[i] = allLinks.get(i).getAttribute("href");
			System.out.println(allLinks.get(i).getAttribute("href"));
			} 
		
		// navigate to each Link on the page
		
		for(int i=0;i<linksCount;i++)
		{
			driver.navigate().to(links[i]);
			Thread.sleep(3000);
			}
		driver.close();
	}
}
