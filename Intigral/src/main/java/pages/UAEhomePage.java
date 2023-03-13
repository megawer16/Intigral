package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UAEhomePage extends PageBase{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	public UAEhomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	//UAE Country Page Elements
		public WebElement TrialCost = driver.findElement(By.xpath(Locators.HomePageLocators.trialCostXpath)); 	  
		public WebElement LitePackagePrice = driver.findElement(By.id(Locators.HomePageLocators.litePackage_PriceId));  	  
		public WebElement ClassicPackagePrice = driver.findElement(By.id(Locators.HomePageLocators.classicPackage_PriceId));   
		public WebElement PremiumPackagePrice = driver.findElement(By.id(Locators.HomePageLocators.premiumPackage_PriceId));
		
		public boolean GetSubscribtionCurrency(String currencyToCheck)
		{
			boolean flag = false; 

			String textToVerify = TrialCost.getText();
			flag = textToVerify.contains(currencyToCheck);	
			return flag;
		}
}
