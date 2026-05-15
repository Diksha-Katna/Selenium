package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
public class TC_002_LoginTest extends BaseClass{
	@Test(groups= {"Sanity","Master"})
	public void verify_login()
	{
		logger.info("**** Starting TC_002_LoginTest  ****");
		logger.debug("capturing application debug logs....");
		
		
		//Home page
		HomePage hp=new HomePage(driver);
		driver.get("http://host.docker.internal:8080/opencart/upload/index.php?route=account/login");
		logger.info("clicked on login link under myaccount..");
		
		//Login page
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering valid email and password..");
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin(); //Login button
		logger.info("clicked on ligin button..");
		
		
		
		logger.info("**** Finished TC_002_LoginTest  ****");
	}

}
