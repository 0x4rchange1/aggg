package mav;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mpractice {
	public static String url="google.com";
	public static WebDriver driver;
	@BeforeTest
	public static void Start() {
		//WebDriver driver =new SafariDriver();
		//WebDriverManager.safaridriver().setup();
		System.setProperty("webdriver.chrome.driver","/Users/mk/Downloads/chromedriver_mac_arm64/chromedriver");
		driver =new ChromeDriver();
		WebDriverManager.chromedriver().setup();

		driver.get("https://google.com");
	}
	@AfterTest
	public static void End() {
		driver.close();
	}

}
