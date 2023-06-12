package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Element
	@FindBy(xpath="//h2[normalize-space()='My Account']") WebElement MyAccHeading;
	
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']")WebElement lnkLogout;
	
	//Action
	
	public void Logout()
	{
		lnkLogout.click();
	}
	
	public  boolean MyAccountExists()
	{
		try
		{
			return(MyAccHeading.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
		
	}
}
