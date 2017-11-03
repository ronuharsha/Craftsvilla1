package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import page.ProducuSelectionPage;

@Listeners(generic.ListenersTest.class)
public class ProductSelectionTest extends BaseTest
{
	
	@Test
	public void productselection()
	{
		ProducuSelectionPage ps=new ProducuSelectionPage(BasePage.driver);
		ps.subcategory();
		ps.selectall();
		
		
	}
	

}
