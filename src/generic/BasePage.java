package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;



public class BasePage 
{
	public static WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		driver=this.driver;
	}
	
	
	//to verify the title
	
	public static void verifytitle(String etitle)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("Title is matching:"+etitle,true);
		}
		catch(Exception e)
		{
			Reporter.log("Title ids not matching:"+etitle,true);
			Assert.fail();
		}
	}
	
	//to verify the element
	
	public static void verifyelement(WebElement element)
	{
		try
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(element));
			//Reporter.log(null,true);
		}
		catch(Exception e)
		{
			Reporter.log("Element is not matching:"+element,true);
			Assert.fail();
		}
	}
	
	public void selectbyindex(WebElement element,int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectbytext(WebElement element,String text)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void selectbyvalue(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(value);
	}
	
	public static void movetoelement(WebElement element,WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		
	}
	
	public void draganddrop(WebElement src,WebElement dest)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest);
		
	}

}
