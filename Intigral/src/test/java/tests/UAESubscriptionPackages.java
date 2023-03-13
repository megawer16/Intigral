package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UAEhomePage;

public class UAESubscriptionPackages extends TestBase {

	HomePage homeObject;
	UAEhomePage uaeObject;

	@BeforeClass
	public void SelectCountry()
	{
		homeObject = new HomePage(driver);
		if(!homeObject.CountrySelected.getText().contains("UAE"))
			homeObject.SelectCountry("UAE");
		uaeObject = new UAEhomePage(driver);

	}
	//TestCase 1 Validate The Lite Package Old and New Price in Egypt and The currency
	@Test(priority=5,alwaysRun=true)
	public void ValidateLitePackage_UAE() 
	{
		String litePackagePrice = uaeObject.LitePackagePrice.getText();
		assertEquals(litePackagePrice, "5.4 USD/month");
		boolean flag = litePackagePrice.contains("USD"); 
		assertEquals(flag, true); 
	}


	//TestCase 2 Validate The Classic Package Old and New Price in Egypt and The currency

	@Test(priority=6,alwaysRun=true) 
	public void ValidateClassicPackage_UAE() 
	{
		String litePackagePrice = uaeObject.ClassicPackagePrice.getText();
		System.out.print(litePackagePrice);
		assertEquals(litePackagePrice, "10.9 USD/month");
		boolean flag = litePackagePrice.contains("USD"); 
		assertEquals(flag, true); 

	}

	//TestCase 3 Validate The Premium Package Old and New Price in Egypt and The currency

	@Test(priority=7,alwaysRun=true) 
	public void ValidatePremiumPackage_UAE() 
	{
		String litePackagePrice = uaeObject.PremiumPackagePrice.getText();
		System.out.print(litePackagePrice);
		assertEquals(litePackagePrice, "16.3 USD/month");
		boolean flag = litePackagePrice.contains("USD"); 
		assertEquals(flag, true); 
	} 

	//TestCase 4 Validate The Classic Package Old and New Price in Egypt and The currency
	@Test(priority=8,alwaysRun=true) 
	public void ValidateTheCurrency_UAE() 
	{
		boolean flag = uaeObject.GetSubscribtionCurrency("AED");
		assertEquals(flag, true);
	}


}
