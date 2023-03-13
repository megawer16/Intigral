package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageBase{

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	public HomePage(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor) driver;
	}

	public WebElement CountrySelected = driver.findElement(By.id("country-name"));
	public WebElement SelectCountryButton = driver.findElement(By.id(Locators.HomePageLocators.selectCountryId));

	public void SelectCountry(String countryName)
	{
		wait.until(ExpectedConditions.elementToBeClickable(SelectCountryButton));
		SelectCountryButton.click();
		WebElement CountryToSelect = driver.findElement(By.xpath("//span[contains(text(), '"+countryName+"')]"));
		CountryToSelect.click();
	}

}
