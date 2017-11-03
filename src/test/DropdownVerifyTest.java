package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Exceldata;

import page.PaymentoptionsPage;
import page.ProducuSelectionPage;

@Listeners(generic.ListenersTest.class)
public class DropdownVerifyTest extends BaseTest
{
	
	@Test
	public void Verifydropdown() throws Throwable
	{
		 String pincode=Exceldata.getdata(path, "Sheet1", 1, 2);
		 
		 	ProducuSelectionPage bp=new ProducuSelectionPage(BasePage.driver);
			PaymentoptionsPage pg=new PaymentoptionsPage(BasePage.driver);
			
			
			bp.subcategory();
			pg.SelectProduct();
			pg.clickonbuy();
			pg.Enterpincode(pincode);
			pg.getcity();
			pg.getstate();
			
	}

}
