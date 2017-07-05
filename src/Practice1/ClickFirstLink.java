package Practice1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickFirstLink {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "E:\\Study\\drivers_jars\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java", Keys.ENTER);
		List <WebElement> links= driver.findElements(By.cssSelector(".r>a"));
		int noOfLinks= links.size();
		System.out.println("Total no of links are: "+noOfLinks);
		System.out.println("1st link is:");
		WebElement javalink = links.get(0);
		System.out.println(javalink.getText());
		javalink.click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.close();
		
	}

}
