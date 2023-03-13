package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.EgyptPage;
import pages.HomePage;

public class EgyptSubscriptionPackages extends TestBase {

	HomePage homeObject;
	EgyptPage egyptObject;

	//TestCase 1 Validate The Lite Package Old and New Price in Egypt and The currency

	@BeforeClass
	public void SelectCountry()
	{
		homeObject = new HomePage(driver);
		if(!homeObject.CountrySelected.getText().contains("Egypt"))
			homeObject.SelectCountry("Egypt");
		
		egyptObject = new EgyptPage(driver);
	}
	
	@Test(priority=1,alwaysRun=true)
	public void ValidateLitePackage_Egypt() 
	{
		String oldPrice = egyptObject.EgyptLitePackage_OldPrice.getText();
		String newPrice = egyptObject.EgyptLitePackage_NewPrice.getText();
		assertEquals(oldPrice, "1.3 USD/Month");
		assertEquals(newPrice, "0.25 USD/Month");
		boolean flag = oldPrice.contains("USD");
		assertEquals(flag, true);
		flag = newPrice.contains("USD");
		assertEquals(flag, true);

	}

	//TestCase 2 Validate The Classic Package Old and New Price in Egypt and The currency
	@Test(priority=2,alwaysRun=true)
	public void ValidateClassicPackage_Egypt() 
	{
		String oldPrice = egyptObject.EgyptClassicPackage_OldPrice.getText();
		String newPrice = egyptObject.EgyptClassicPackage_NewPrice.getText();
		assertEquals(oldPrice, "3.2 USD/Month");
		assertEquals(newPrice, "0.50 USD/Month");
		boolean flag = oldPrice.contains("USD");
		assertEquals(flag, true);
		flag = newPrice.contains("USD");
		assertEquals(flag, true);
		System.out.print(newPrice);

	}

	//TestCase 3 Validate The Classic Package Old and New Price in Egypt and The currency
	@Test(priority=3,alwaysRun=true)
	public void ValidatePremiumPackage_Egypt() 
	{
		String oldPrice = egyptObject.EgyptPremiumPackage_OldPrice.getText();
		String newPrice = egyptObject.EgyptPremiumPackage_NewPrice.getText();
		assertEquals(oldPrice, "5.1 USD/Month");
		assertEquals(newPrice, "1 USD/Month");
		boolean flag = oldPrice.contains("USD");
		assertEquals(flag, true);
		flag = newPrice.contains("USD");
		assertEquals(flag, true);
		System.out.print(newPrice);

	}
	//TestCase 4 Validate The Classic Package Old and New Price in Egypt and The currency
	@Test(priority=4,alwaysRun=true)
	public void ValidateTheCurrency_Egypt() 
	{
		boolean flag = egyptObject.GetSubscribtionCurrency("Egyptian pound");
		assertEquals(flag, true);

	}


}
