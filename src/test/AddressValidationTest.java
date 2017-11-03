package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Exceldata;
import page.PaymentoptionsPage;
import page.ProducuSelectionPage;

@Listeners(generic.ListenersTest.class)
public class AddressValidationTest extends BaseTest
{
	
	@Test
	public void AddressValidation() throws Throwable
	{
		
		String address =Exceldata.getdata(path,"sheet1",1,3);
		

		ProducuSelectionPage bp=new ProducuSelectionPage(BasePage.driver);
		PaymentoptionsPage pg=new PaymentoptionsPage(BasePage.driver);
		
		
		
		bp.subcategory();
		pg.SelectProduct();
		pg.clickonbuy();
		pg.EnterAddress(address);
		pg.verifyerrormsg();
		
		
	}


}
