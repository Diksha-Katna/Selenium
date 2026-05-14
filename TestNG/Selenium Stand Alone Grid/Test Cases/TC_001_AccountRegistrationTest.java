package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegisterationPage;
import pageObjects.HomePage;
import testBase.BaseClass;
public class TC_001_AccountRegistrationTest extends BaseClass {
	@Test(groups= {"Regression","Master"})
	
	
		public void verify_account_registration()
	
	{
		try {
		logger.info("***** Starting TC001_AccountRegistrationTest  ****");
		logger.debug("This is a debug log message");
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount Link.. ");
		
		hp.clickRegister();
		
		AccountRegisterationPage regpage=new AccountRegisterationPage(driver);
		
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		}
		
		
		
		
	
	catch(Exception e)
		{
		
			
			Assert.fail();
		} 
		finally 
		{
		  logger.info("***** Finished TC001_AccountRegistrationTest *****");
		}
	}
	
}
	
	

