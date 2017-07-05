package Practice1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchFirefox {
	public static void main(String args[]){
		System.setProperty("webdriver.gecko.driver", "E:\\Study\\drivers_jars\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		RemoteWebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.close();
	}

}
