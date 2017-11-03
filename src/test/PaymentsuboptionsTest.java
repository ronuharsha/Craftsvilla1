package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Exceldata;
import page.PaymentoptionsPage;
import page.ProducuSelectionPage;

@Listeners(generic.ListenersTest.class)
public class PaymentsuboptionsTest extends BaseTest
{

	@Test
	public void Verifypaymentoptions() throws Throwable
	{
		
		String email=Exceldata.getdata(path, "sheet1", 1, 0);
		String fn=Exceldata.getdata(path, "sheet1", 3, 0);
		String ln=Exceldata.getdata(path, "sheet1", 3, 1);
		String pc=Exceldata.getdata(path, "sheet1", 1, 2);
		String address=Exceldata.getdata(path, "sheet1", 3, 3);
		String mobileno=Exceldata.getdata(path, "sheet1", 3, 2);
		
		ProducuSelectionPage bp=new ProducuSelectionPage(BasePage.driver);
		PaymentoptionsPage pg=new PaymentoptionsPage(BasePage.driver);
		
	
		
		bp.subcategory();
		pg.SelectProduct();
		pg.clickonbuy();
		pg.EnterEmail(email);
		pg.enterfirstname(fn);
		pg.enterlastname(ln);
		pg.Enterpincode(pc);
		pg.EnterAddress(address);
		pg.entermobileno(mobileno);
		pg.clickoon();
		pg.paymentoption();
		pg.displayoption();
	}
}
