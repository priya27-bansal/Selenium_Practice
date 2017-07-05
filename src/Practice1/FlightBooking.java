package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightBooking {
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver", "E:\\Study\\drivers_jars\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		RemoteWebDriver driver = new FirefoxDriver();
		driver.get("http://www.phptravels.net/");
		driver.manage().window().maximize();
		Select dropdown = new Select(driver.findElement(By.id("designation")));
		dropdown.selectByVisibleText("India");

	}

}
