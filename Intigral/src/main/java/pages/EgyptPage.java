package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EgyptPage extends PageBase{
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	public EgyptPage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}
	
	//Egypt Country Page Elements
	public WebElement EgyptTrialCost = driver.findElement(By.xpath(Locators.HomePageLocators.EgyptCountry.egypttrialCostXpath));
	public WebElement EgyptLitePackage_OldPrice = driver.findElement(By.xpath(Locators.HomePageLocators.EgyptCountry.egyptlitePackage_PricesXpath + Locators.HomePageLocators.EgyptCountry.egyptoldPriceXpath));
	public WebElement EgyptLitePackage_NewPrice = driver.findElement(By.xpath(Locators.HomePageLocators.EgyptCountry.egyptlitePackage_PricesXpath + Locators.HomePageLocators.EgyptCountry.egyptnewPriceXpath));
	public WebElement EgyptClassicPackage_OldPrice = driver.findElement(By.xpath(Locators.HomePageLocators.EgyptCountry.egyptclassicPackage_PricesXpath + Locators.HomePageLocators.EgyptCountry.egyptoldPriceXpath));
	public WebElement EgyptClassicPackage_NewPrice = driver.findElement(By.xpath(Locators.HomePageLocators.EgyptCountry.egyptclassicPackage_PricesXpath + Locators.HomePageLocators.EgyptCountry.egyptnewPriceXpath));
	public WebElement EgyptPremiumPackage_OldPrice = driver.findElement(By.xpath(Locators.HomePageLocators.EgyptCountry.egyptpremiumPackage_PricesXpath + Locators.HomePageLocators.EgyptCountry.egyptoldPriceXpath));
	public WebElement EgyptPremiumPackage_NewPrice = driver.findElement(By.xpath(Locators.HomePageLocators.EgyptCountry.egyptpremiumPackage_PricesXpath + Locators.HomePageLocators.EgyptCountry.egyptnewPriceXpath));
	
	public boolean GetSubscribtionCurrency(String currencyToCheck)
	{
		boolean flag = false; 

		String textToVerify = EgyptTrialCost.getText();
		flag = textToVerify.contains(currencyToCheck);	
		return flag;
	}
}
