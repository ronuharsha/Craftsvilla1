package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import page.PaymentoptionsPage;
import page.ProducuSelectionPage;

@Listeners(generic.ListenersTest.class)
public class VerifySelectedsmallImageTest
{
	
	@Test
	public void verifyselectedimage() throws Throwable
	{
		ProducuSelectionPage ps=new ProducuSelectionPage(BasePage.driver);
		PaymentoptionsPage pg=new PaymentoptionsPage(BasePage.driver);
		
	
		
		ps.subcategory();
		pg.SelectProduct();
		ps.verifysmallimage();
		
	}

}
