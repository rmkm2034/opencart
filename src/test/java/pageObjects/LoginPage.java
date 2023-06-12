package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	 public LoginPage(WebDriver driver)
	 {
		 super(driver);
	 }
	 
	 //Elements
	 
	 @FindBy(xpath="//input[@placeholder='E-Mail Address']") WebElement txtEmailAdress;
	 
	 @FindBy(xpath="//input[@placeholder='Password']") WebElement txtPassword;
	 
	 @FindBy(xpath="//input[@value='Login']") WebElement clkLogin;
	 
	 //Action
	 
	 public void setEmail(String email)
	 {
		 txtEmailAdress.sendKeys(email);
	 }
	
	 public void setpwd(String pwd)
	 {
		 txtPassword.sendKeys(pwd);
	 }
	
	 public void clicklogin()
	 {
		 clkLogin.click();
	 }
	 
}
