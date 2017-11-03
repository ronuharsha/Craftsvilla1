package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Exceldata;
import test.ProductSelectionTest;

import page.ProducuSelectionPage;
import page.PaymentoptionsPage;

@Listeners(generic.ListenersTest.class)
public class PaymentoptionsTest extends BaseTest 
{
	
	@Test
	public void Paymentoptions() throws Throwable
	{
		
		ProducuSelectionPage bp=new ProducuSelectionPage(BasePage.driver);
		PaymentoptionsPage pg=new PaymentoptionsPage(BasePage.driver);
		
	
		
		bp.subcategory();
		pg.SelectProduct();
		pg.clickonbuy();
		pg.Shippingtext();
		pg.Paymenttext();
		
	}

}
