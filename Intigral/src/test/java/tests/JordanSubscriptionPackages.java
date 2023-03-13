package tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.JordanhomePage;

public class JordanSubscriptionPackages extends TestBase {

	HomePage homeObject;
	JordanhomePage jordanObject;

	@BeforeClass
	public void SelectCountry()
	{
		homeObject = new HomePage(driver);
		if(!homeObject.CountrySelected.getText().contains("Jordan"))
			homeObject.SelectCountry("Jordan");
		jordanObject = new JordanhomePage(driver);

	}
	//TestCase 1 Validate The Lite Package Old and New Price in Jordan and The currency
	@Test(priority=9,alwaysRun=true)
	public void ValidateLitePackage_Jordan() 
	{
		String litePackagePrice = jordanObject.LitePackagePrice.getText();
		assertEquals(litePackagePrice, "2.7 USD/month");
		boolean flag = litePackagePrice.contains("USD"); 
		assertEquals(flag, true); 
	}


	//TestCase 2 Validate The Classic Package Old and New Price in Jordan and The currency

	@Test(priority=10,alwaysRun=true) 
	public void ValidateClassicPackage_Jordan() 
	{
		String litePackagePrice = jordanObject.ClassicPackagePrice.getText();
		System.out.print(litePackagePrice);
		assertEquals(litePackagePrice, "5.2 USD/month");
		boolean flag = litePackagePrice.contains("USD"); 
		assertEquals(flag, true); 

	}

	//TestCase 3 Validate The Premium Package Old and New Price in Jordan and The currency

	@Test(priority=11,alwaysRun=true) 
	public void ValidatePremiumPackage_Jordan() 
	{
		String litePackagePrice = jordanObject.PremiumPackagePrice.getText();
		System.out.print(litePackagePrice);
		assertEquals(litePackagePrice, "8 USD/month");
		boolean flag = litePackagePrice.contains("USD"); 
		assertEquals(flag, true); 
	} 

	//TestCase 4 Validate The Classic Package Old and New Price in Jordan and The currency
	@Test(priority=12,alwaysRun=true) 
	public void ValidateTheCurrency_Jordan() 
	{
		boolean flag = jordanObject.GetSubscribtionCurrency("JOD");
		assertEquals(flag, true);
	}


}
