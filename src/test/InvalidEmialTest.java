package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Exceldata;
import page.PaymentoptionsPage;
import page.ProducuSelectionPage;

@Listeners(generic.ListenersTest.class)
public class InvalidEmialTest extends BaseTest
{
	
	@Test
	public void VerifyEmailaddress() throws Throwable
	{
		String Invalidemail =Exceldata.getdata(path, "sheet1", 1, 4);
		
		ProducuSelectionPage bp=new ProducuSelectionPage(BasePage.driver);
		PaymentoptionsPage pg=new PaymentoptionsPage(BasePage.driver);
		
	
		
		bp.subcategory();
		pg.SelectProduct();
		pg.clickonbuy();
		pg.EnterEmail(Invalidemail);
		pg.verifyEmailerrormsg();
	}
	

}
