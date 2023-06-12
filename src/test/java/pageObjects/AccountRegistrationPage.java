package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	// Elements
	@FindBy(xpath="//input[@placeholder='First Name']") WebElement FirstName;
	
	@FindBy(xpath="//input[@placeholder='Last Name']") WebElement LastName;
	
	@FindBy(xpath ="//input[@placeholder='E-Mail']") WebElement Email;
	
	@FindBy(xpath="//input[@placeholder='Telephone']") WebElement Telephone;
	
	@FindBy(xpath="//input[@placeholder='Password']") WebElement Password;
	
	@FindBy(xpath="//input[@placeholder='Password Confirm']") WebElement PasswordConfirm;
	
	@FindBy(xpath="//input[@name='agree']") WebElement checkbox;
	
	@FindBy(xpath="//input[@value='Continue']") WebElement Continue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement getConfirmationMsg;
	
	//Actions
	
	public void setFirstName(String Fname)
	{
		FirstName.sendKeys(Fname);
	}
	
	public void setLastName(String Lname)
	{
		LastName.sendKeys(Lname);
	}
	
	public void setEmail(String email)
	{
		Email.sendKeys(email);
	}
     
	public void setTelephone(String telephone)
	{
		Telephone.sendKeys(telephone);
	}
	
	public void setPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	
	public void setPasswordConfirm(String PassConfirm)
	{
		PasswordConfirm.sendKeys(PassConfirm);
	}
	
	public void setcheckbox()
	{
		checkbox.click();
	}
	
	public void setContinue()
	{
		Continue.click();
		
		//checkbox.submit();
	}
	
	public String getConfirmationMsg()
	{
		try {
		return(getConfirmationMsg.getText());
		}
		catch(Exception e) {
		 return(e.getMessage());	
		}
		}
		
	}
	
	
	
	

