package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testbase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDataDrivenTest extends BaseClass{
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
	public void test_LoginDDt(String email,String pwd,String exp)
	{
		logger.info("startting TC_003_LoginDataDrivenTest");
		
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
		
		if(exp.equals("valid"))
		{
			if(targetpage==true) {
				myacc.Logout();
				Assert.assertTrue(true);
			}
			else {
				Assert.assertTrue(false);
			}
		}
            if(exp.equals("invalid")) {
            	if(targetpage==true) {
            	MyAccountPage myaccpage=new MyAccountPage(driver);
            	myacc.Logout();
    			Assert.assertTrue(true);
    			}
            	else {
            		Assert.assertTrue(false);
            	}
            }
            logger.info("Finished TC_003_LoginDataDrivenTest");
	}

}
