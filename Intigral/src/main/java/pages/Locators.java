package pages;

public class Locators {

	public static class HomePageLocators
	{
		public static String selectCountryId = "country-name";
		public static String trialCostXpath = "//div[@class = 'trial-cost']";
		public static String litePackage_PriceId = "currency-lite";
		public static String classicPackage_PriceId = "currency-classic"; //currency-premium
		public static String premiumPackage_PriceId = "currency-premium";
		
		public static class EgyptCountry
		{
			public static String egyptlitePackage_PricesXpath = "//div[text() = 'Monthly price']/parent::div//div[@id='currency-lite']";
			public static String egyptclassicPackage_PricesXpath = "//div[text() = 'Monthly price']/parent::div//div[@id='currency-classic']";
			public static String egyptpremiumPackage_PricesXpath = "//div[text() = 'Monthly price']/parent::div//div[@id='currency-premium']";
			public static String egyptoldPriceXpath = "//div[@class = 'old-price']";
			public static String egyptnewPriceXpath = "//div[@class = 'new-price']";
			public static String egypttrialCostXpath = "//div[@class = 'trial-cost'][2]";
		}


	}
}
