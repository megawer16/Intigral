package steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EgyptPage;
import pages.HomePage;
import pages.JordanhomePage;
import pages.UAEhomePage;
import tests.TestBase;

public class ValidateEgyptPlansSteps extends TestBase 
{

	HomePage homeObject;
	UAEhomePage uaeObject;
	EgyptPage egyptObject;
	JordanhomePage jordanObject;

	@Given("I open the application")
	public void i_open_the_application() 
	{
		homeObject = new HomePage(driver);

	}

	@When("I select Egypt from countries list")
	public void i_select_egypt_from_countries_list() 
	{
		if(!homeObject.CountrySelected.getText().contains("Egypt"))
			homeObject.SelectCountry("Egypt");

		egyptObject = new EgyptPage(driver);
	}

	@Then("I validate Egypt Lite plan")
	public void i_validate_the_lite_plan() 
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

	@Then("I validate Egypt Classic plan")
	public void i_validate_egypt_classic_plan() 
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
	@Then("I validate Egypt Premium plan")
	public void i_validate_egypt_premium_plan() {
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
	
	@Then("I validate Egypt Currency")
	public void i_validate_egypt_currency() {
		boolean flag = egyptObject.GetSubscribtionCurrency("Egyptian pound");
		assertEquals(flag, true);
	}
	
	@When("I select {string}")
	public void i_select(String country) 
	{
	    if(country.equals("UAE"))
	    {
	    	if(!homeObject.CountrySelected.getText().contains("UAE"))
				homeObject.SelectCountry("UAE");
			uaeObject = new UAEhomePage(driver);
	    }
	    else if(country.equals("Jordan"))
	    {
	    	if(!homeObject.CountrySelected.getText().contains("Jordan"))
				homeObject.SelectCountry("Jordan");
			jordanObject = new JordanhomePage(driver);
	    }
	}
	@Then("I validate the Lite plan of the {string}")
	public void i_validate_the_lite_plan_of_the(String country) 
	{
		if(country.equals("UAE"))
	    {
			String litePackagePrice = uaeObject.LitePackagePrice.getText();
			assertEquals(litePackagePrice, "5.4 USD/month");
			boolean flag = litePackagePrice.contains("USD"); 
			assertEquals(flag, true); 
	    }
	    else if(country.equals("Jordan"))
	    {
	    	String litePackagePrice = jordanObject.LitePackagePrice.getText();
			assertEquals(litePackagePrice, "2.7 USD/month");
			boolean flag = litePackagePrice.contains("USD"); 
			assertEquals(flag, true); 
	    }
	    
	}
}
