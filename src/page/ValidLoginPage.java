package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import generic.BasePage;


public class ValidLoginPage extends BasePage 
{
	//declaration
	@FindBy(xpath="//span[.='Sign In']")
	private WebElement SignIN;
	
	@FindBy(id="emailId")
	private WebElement Entermail;
	
	@FindBy(xpath="//div[.='CONTINUE']")
	private WebElement button;
	
	@FindBy(id="userPassword")
	private WebElement password;
	
	@FindBy(xpath="//div[.='Login']")
	private WebElement login;
	
	@FindBy(xpath="//span[.='ronu104@gmail.com']")
	private WebElement LoginName;
	
	@FindBy(xpath="//span[@class='icon icon-fb-round']")
	private WebElement fbicon;
	
	@FindBy(xpath="//span[@class='icon icon-tw-round']")
	private WebElement twicon;
	
	@FindBy(xpath="//span[@class='icon icon-gp-round']")
	private WebElement gmailicon;
	
	@FindBy(xpath="//span[@class='icon icon-gp-round']")
	private WebElement pinteresticon;
	
	
	
	//Initialization

	public ValidLoginPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	
	//Utilization
	
	public void ClickonSignIn() throws InterruptedException
	{
		SignIN.click();
		Thread.sleep(2000);
	}
	
	public void entermail(String mail) throws InterruptedException
	{
		verifyelement(Entermail);
		Entermail.sendKeys(mail);
	}
	
	public void ClickonContinue() throws InterruptedException
	{
		Thread.sleep(3000);
		button.click();
	}
	
	public void EnterPwd(String pwd)
	{
		verifyelement(password);
		password.sendKeys(pwd);
	}
	
	public void CliconLogin()
	{
		login.click();
	}
	
	
	public String CompareName()
	{
		String text = LoginName.getText();
		return text;
	
	}
	
	public void verifyFBicon()
	{
		if(fbicon.isDisplayed())
		{
			Reporter.log("FB icon is displayed",true);
		}
	}
	
	public void verifytwittericon()
	{
		if(twicon.isDisplayed())
		{
			Reporter.log("Twitter icon is displayed",true);
		}
	}
	
	public void verifygmailicon()
	{
		if(gmailicon.isDisplayed())
		{
			Reporter.log("gmail icon is displayed",true);
		}
	}
	
	public void verifypinteresticon()
	{
		if(pinteresticon.isDisplayed())
		{
			Reporter.log("pinterest icon is displayed",true);
		}
	}
	
	
	
	
	
}