package test;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Exceldata;
import page.ValidLoginPage;

@Listeners(generic.ListenersTest.class)
public class ValidLoginTest extends BaseTest
{
 @Test
 public void validlogin() throws InterruptedException
 {
	 String mail=Exceldata.getdata(path, "Sheet1", 1, 0);
	 String pwd=Exceldata.getdata(path, "Sheet1", 1, 1);
	 
	 ValidLoginPage bp= PageFactory.initElements(BasePage.driver,  ValidLoginPage.class);
	 bp.ClickonSignIn();
	 bp.entermail(mail);
	 bp.ClickonContinue();
	
	 bp.EnterPwd(pwd);
	 bp.CliconLogin();
	
	 String actualresult=bp.CompareName();
	Assert.assertEquals(mail, actualresult);
	
		 

	 
	 
	 
	 
	 
	 
	 
 }
}
