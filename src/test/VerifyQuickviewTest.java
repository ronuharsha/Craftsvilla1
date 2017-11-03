package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import page.PaymentoptionsPage;
import page.ProducuSelectionPage;

@Listeners(generic.ListenersTest.class)
public class VerifyQuickviewTest extends BaseTest
{
	
	@Test
	public void Verifyquickview() throws Throwable
	{
		ProducuSelectionPage bp=new ProducuSelectionPage(BasePage.driver);
		PaymentoptionsPage pg=new PaymentoptionsPage(BasePage.driver);
		
		bp.subcategory();
		
		pg.quickview();
	}
	

}
