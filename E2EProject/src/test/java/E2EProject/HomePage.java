package E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.ForgotPassword;
import pageObject.landingPageobject;
import pageObject.loginPageobject;
import resources.base;

public class HomePage extends base {
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeMethod
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Page");
	}

	@Test(dataProvider = "getdata")
	public void basePagenavigation(String username, String password, String text) throws IOException {

		landingPageobject lp = new landingPageobject(driver);
		loginPageobject lpo = lp.Signin();
		lpo.Emailid().sendKeys(username);
		lpo.Password().sendKeys(password);
		lpo.Login().click();
		log.info(text);
		ForgotPassword fp = lpo.forgotpassword();
		fp.Emailid().sendKeys("emailid");
		fp.SendInstructions().click();
	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}

	@DataProvider
	public Object[][] getdata() {
		Object[][] data = new Object[2][3];
		data[0][0] = "nonrestricteduser@gmail.com";
		data[0][1] = "12345";
		data[0][2] = "Non Restricted User";
		data[1][0] = "restricteduser@gmail.com";
		data[1][1] = "67890";
		data[1][2] = "Restricted User";
		return data;
	}

}
