package page;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.BasePage;

public class PaymentoptionsPage extends BasePage
{
	//declaration
	@FindBy(id="address-pincode")
	private WebElement pincode;
	
	@FindBy(xpath="//label[@for='city-name']")
	private WebElement city;
	
	@FindBy(xpath="//label[@for='state-name']")
	private WebElement state;
	
	@FindBy(xpath="(//img[@class='product-image lazy-onload'])[1]")
	 private   WebElement SelectedProduct;
	
	@FindBy(id="buynow")
	private static WebElement BUY;
	
	@FindBy(xpath="//h3[@class='pure-u-12-24 address-form-title']")
	private WebElement Shipping;
	
	@FindBy(xpath="//span[.='Payment']")
	private WebElement Payment;
	
	@FindBy(id="address-textbox")
	private WebElement address;
	
	@FindBy(xpath="(//span[@class='error-message'])[7]")
	private WebElement Errormsg;
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	private WebElement country;
	
	@FindBys({@FindBy(xpath="//ul[@class='dropdown-menu-country']/li")})
	private List<WebElement> countrys;
	
	@FindBys({@FindBy(xpath="//label[@class='address-form-label']")})
	private List<WebElement> elements;
	
	@FindBy (id="address-email")
	private WebElement Email;
	
	@FindBy(xpath="(//span[@class='error-message'])[1]")
	private WebElement Mailerrormsg;
	
	@FindBy (id="address-first-name")
	private WebElement fn;
	
	@FindBy (id="address-last-name")
	private WebElement ln;
	
	@FindBy (id="address-mobileno")
	private WebElement mobileno;
	
	@FindBy (id="address-form-submit")
	private WebElement Deliver;
	
	@FindBy (xpath="(//div[@class='payment-header js-payment-type'])[1]")
	private WebElement payoptioCOD;
	
	@FindBys({@FindBy(xpath="//div[@class='payment-header js-payment-type']")})
	private List<WebElement> payoptions;
	
	
	
	@FindBys({@FindBy(xpath="//a[.='Quick View']")})
	private List<WebElement> allQuickview;
	
	
	@FindBy(xpath="//button[@class='pure-button payment-submit-button js-payment-submit-btn']")
	private WebElement placeorder;
	
	@FindBys({@FindBy(xpath="//div[@id='listProducts']/div/div")})
	private List<WebElement> allproducts;
	
	
	
	
	
	//Initialization
	public PaymentoptionsPage(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Utilization
	public void Enterpincode(String pc)
	{
		pincode.sendKeys(pc);
	}
	
	public void getcity()
	{
		verifyelement(city);
		String text = city.getText();
		Reporter.log(text,true);
	}
	
	public void getstate()
	{
		verifyelement(state);
		String text1 = state.getText();
		Reporter.log(text1,true);
	}
	public void SelectProduct() throws Throwable
	{
		
	verifyelement(SelectedProduct);
	SelectedProduct.click();
	
	}
	
	public void clickonbuy()
	{
		BUY.click();
	}
	
	public void Shippingtext()
	{
		String text = Shipping.getText();
		if(Shipping.isDisplayed())
		{
			Reporter.log("Text is displayed:"+ text,true);
		}
	}
	
	public void Paymenttext()
	{
		String text = Payment.getText();
		if(Payment.isDisplayed())
		{
			Reporter.log("Text is displayed:"+ text,true);
		}
	}
	
	
	
	public void EnterAddress(String ad)
	{
		verifyelement(address);
		address.sendKeys(ad);
		address.sendKeys(Keys.TAB);
	}
	
	public void verifyerrormsg()
	{
		String text = Errormsg.getText();
		Reporter.log(text,true);
	}
	
	public void ClickonCountrySelection()
	{
		verifyelement(country);
		country.click();
	}
	
	public void CountryDropdownlist()
	{
		
	int count = countrys.size();
		System.out.println(count);
		
		for(int i=0;i<countrys.size();i++)
		{
			String text = countrys.get(i).getText();
			Reporter.log(text,true);
		}
	}
	
	public void Verifyelement()
	{
		for(int i=0;i<elements.size();i++)
		{
		 WebElement component = elements.get(i);
		 String text = component.getText();
		if(component.isDisplayed())
		{
			Reporter.log("elements are present"+text,true);
		}
	}
	
	}	
	
	public void EnterEmail(String mail)
	{
		verifyelement(Email);
		Email.sendKeys(mail);
		Email.sendKeys(Keys.TAB);
	}

	public void verifyEmailerrormsg()
	{
		String text = Mailerrormsg.getText();
		Reporter.log(text,true);
	}
	
	public void enterfirstname(String fname)
	{
		verifyelement(fn);
		fn.sendKeys(fname);
		fn.sendKeys(Keys.TAB);
	}
	
	public void enterlastname(String lname)
	{
		verifyelement(ln);
		ln.sendKeys(lname);
		ln.sendKeys(Keys.TAB);
	}
	
	public void entermobileno(String mob)
	{
		verifyelement(mobileno);
		mobileno.sendKeys(mob);
		mobileno.sendKeys(Keys.TAB);
	}
	
	public void clickoon()
	{
		Deliver.click();
	}
	
	public void paymentoption()
	{
		if(payoptioCOD.isEnabled())
		{
			Reporter.log("payment option is enabled",true);
		}
		else
		{
			Reporter.log("payment option is disabled",true);
		}
	}
	
	public void verifyplaceorder()
	{
		verifyelement(payoptioCOD);
		
	}
	
	public void displayoption()
	{
		
		for(int i=0;i<payoptions.size();i++)
		{
			String text = payoptions.get(i).getText();
			Reporter.log(text,true);
		}
		
	}
	
	
	public void quickview()
	{
//		int products = allproducts.size();
//		int quickview = allQuickview.size();
		
		if(allproducts.size()==allQuickview.size())
		{
			Reporter.log("Quickview is displayed for all product",true);
		}
		else
		{
			Reporter.log("Quickview is not displayed for all product",true);
		}
	}
	
}
