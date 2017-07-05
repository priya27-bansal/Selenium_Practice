package Practice1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchBrowser {
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\drivers_jars\\chromedriver_win32\\chromedriver.exe");
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.close();
	}

}
