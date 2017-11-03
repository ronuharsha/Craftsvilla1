package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements Autoconstant 
{
	
	//public static WebDriver driver=null;
	
	
	
@BeforeMethod
public void beforeconditions()
{
	
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	BasePage.driver=new ChromeDriver();
	BasePage.driver.get("http://www.craftsvilla.com/");
	BasePage.driver.manage().window().maximize();
	BasePage.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}


@AfterMethod
public void postconditions()
{
	//BasePage.driver.close();
}

}
