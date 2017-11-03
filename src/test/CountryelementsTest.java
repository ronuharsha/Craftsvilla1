package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;

import page.PaymentoptionsPage;
import page.ProducuSelectionPage;


//@Listeners(generic.ListenersTest.class)
public class CountryelementsTest extends BaseTest
{
	
	@Test
	public void listofCountry() throws Throwable
	{
		
		ProducuSelectionPage bp=new ProducuSelectionPage(BasePage.driver);
		PaymentoptionsPage pg=new PaymentoptionsPage(BasePage.driver);
		
		
		
		bp.subcategory();
		pg.SelectProduct();
		pg.clickonbuy();
		pg.ClickonCountrySelection();
		pg.CountryDropdownlist();
	}

}
