package loginPage;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.Cubic.Ecommerce.Helper.assertion.AssertionHelper;
import com.Cubic.Ecommerce.Helper.browserConfig.ObjectReader;
import com.Cubic.Ecommerce.Helper.logger.LoggerHelper;
import com.Cubic.Ecommerce.pageObjects.LoginPage;
import com.Cubic.Ecommerce.testBase.TestBase;

public class LoginTest extends TestBase {
	
private final Logger log = LoggerHelper.getLogger(LoginTest.class);
	
	@Test(description="Login test with valid credentials")
	public void testLoginToApplication(){
		getApplicationUrl(ObjectReader.reader.getUrl());
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.loginToApplication(ObjectReader.reader.getUserName(), ObjectReader.reader.getPassword());
		
		boolean status = loginPage.verifySuccessLoginMsg();
		
		AssertionHelper.updateTestStatus(status);
	}

	
}
