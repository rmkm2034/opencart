package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testbase.BaseClass;


public class TC_002LoginTest extends BaseClass{

	@Test	
	public void TC_002_LoginTest()
	{
		logger.info("***********TC_002_LoginTest******");
		try
		{
		HomePage hp=new HomePage(driver);
				
		hp.clickMyAccount();
		logger.info("click on my account");
		
		hp.clickLogin();
		logger.info("click on Login");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setEmail(rb.getString("email"));
		logger.info("enter email");
		
		lp.setpwd(rb.getString("pwd"));
		logger.info("enter pwd");
		
		lp.clicklogin();
		logger.info("click on login");
		
		MyAccountPage myacc=new MyAccountPage(driver);
		
		boolean targetpage=myacc.MyAccountExists();
		
		Assert.assertEquals(targetpage, true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
}
