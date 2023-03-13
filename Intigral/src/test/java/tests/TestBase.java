package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;


public class TestBase extends AbstractTestNGCucumberTests {


	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String appURL = "https://subscribe.jawwy.tv/eg-en";

	@BeforeSuite
	public void startdriver()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
	}

	@AfterSuite
	public void stopdriver()
	{
		driver.quit();
	}
}
