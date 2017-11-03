package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import page.ProducuSelectionPage;
import page.ValidLoginPage;

@Listeners(generic.ListenersTest.class)
public class ThirdpartyTest extends BaseTest
{
	
	@Test
	public void Veifythirdpartyicon()
	{
		ValidLoginPage vp=new ValidLoginPage(BasePage.driver);
		
	
		vp.verifyFBicon();
		vp.verifytwittericon();
		vp.verifygmailicon();
		vp.verifypinteresticon();
	}

}
