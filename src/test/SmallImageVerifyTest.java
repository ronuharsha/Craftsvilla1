package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import page.PaymentoptionsPage;
import page.ProducuSelectionPage;

@Listeners(generic.ListenersTest.class)
public class SmallImageVerifyTest extends BaseTest
{
	
	@Test
	public void VerifysmallImage() throws Throwable
	{
		
		ProducuSelectionPage ps=new ProducuSelectionPage(BasePage.driver);
		PaymentoptionsPage pg=new PaymentoptionsPage(BasePage.driver);
		
	
		
		ps.subcategory();
		pg.SelectProduct();
		ps.verifysmallimage();
		
	}

}
