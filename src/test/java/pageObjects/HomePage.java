package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
 public	HomePage(WebDriver driver)
	{
		super(driver);
	}
	
    // Elements
 
  @FindBy(xpath ="//a[@title='My Account']") WebElement lnkMyAccount;
  
  @FindBy(xpath="//a[normalize-space()='Register']") WebElement lnkRegister;
  
  @FindBy(linkText="Login") WebElement linkLogin;
  
  // Actions
  
  public void clickMyAccount()
  {
	  lnkMyAccount.click();  
  }
  
  public void clickRegister()
  {
	  lnkRegister.click();
  }
  
  public void clickLogin()
  {
	  linkLogin.click();
  }

}
