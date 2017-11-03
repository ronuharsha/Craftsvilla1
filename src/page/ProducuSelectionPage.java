package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import generic.BasePage;

public class ProducuSelectionPage extends BasePage
{
	//declaration
	@FindBy(xpath="//a[@href='/cvfeeds/craftsvilla-brands']")
	private WebElement submodule;
	
	@FindBy(xpath="//a[.='Craftsvilla Silk Sarees']")
	private WebElement product;
	
	
	@FindBys({@FindBy(xpath="(//div[@id='listProducts']/div/div)/div[2]/a")})
	private List<WebElement> Allproduct;
	
	@FindBys({@FindBy(xpath="//img[@class='lazy']")})
	private List<WebElement> SmallImages;
	
	@FindBy(xpath="addtocart")
	private WebElement AddtoCart;
	
	@FindBy(xpath="(//img[@class='lazy'])[2]")
	private WebElement SelectedsmallImage;
	
	
	
	//Initialization
	public ProducuSelectionPage(WebDriver driver)
	{
		super(driver);
		// TODO Auto-generated constructor stub
		PageFactory.initElements(BasePage.driver, this);
		
		
	}
	
	
	//utilization
	
	public void subcategory()
	{
		verifyelement(submodule);
		BasePage.movetoelement(submodule, BasePage.driver);
		verifyelement(product);
		product.click();
	}
	
	public void selectall()
	{
		for(int i=0;i<Allproduct.size();i++)
		{
			String text = Allproduct.get(i).getText();
			Reporter.log(text,true);
		}
	}
	
	public void clickonaddtocart()
	{
		verifyelement(AddtoCart);
		AddtoCart.click();
		
	}
	
	public void verifysmallimage()
	{
		for(int i=0;i<SmallImages.size();i++)
		{
			
			WebElement smallImage = SmallImages.get(i);
			verifyelement(smallImage);
			
			if(smallImage.isDisplayed())
			{
				Reporter.log("Small Images are present",true);
			}
			else
			{
				Reporter.log("Small Images are not present",true);
			}
		}
	}
	
	public void ClickonSElectedsmallImage()
	{
		SelectedsmallImage.click();
	}
	
	public void verifySelectedimage()
	{
		String text = SelectedsmallImage.getText();
		
	}
}
	


