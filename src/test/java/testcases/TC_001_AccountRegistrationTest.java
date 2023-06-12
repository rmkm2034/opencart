package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testbase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	
	@Test
	public void TC_AccountRegistrationTest()
	{
		logger.info("*******TC_001_AccountRegistrationTest******");
		
		
		
		HomePage hp=new HomePage(driver);
		
		hp.clickMyAccount();
		logger.info("click On MyAccount");
		hp.clickRegister();
		logger.info("click On Register");
		
		AccountRegistrationPage accreg=new AccountRegistrationPage(driver);
				
	        	logger.info("providing customer details");
	        	
				accreg.setFirstName(randomstring().toUpperCase());
				accreg.setLastName(randomstring().toUpperCase());
				accreg.setEmail(randomstring()+"@gmail.com");
				String pwd=randomalphanumberic();
				accreg.setPassword(pwd);
				accreg.setPasswordConfirm(pwd);
				accreg.setTelephone(randomnumber());
				accreg.setcheckbox();
				accreg.setContinue();
				
				logger.info("click On Continue");
				
				String confmsg=accreg.getConfirmationMsg();
				
				Assert.assertEquals(confmsg,"Your Account Has Been Created!");
				
				logger.info("******* Finished TC_001_AccountRegistrationTest******");
	}

}
