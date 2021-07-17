package E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.landingPageobject;
import resources.base;

public class validateNavigationPage extends base {
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test()
	public void validatebaseNavigationPage() throws IOException {

		landingPageobject lp = new landingPageobject(driver);
		Assert.assertTrue(lp.getNavbar().isDisplayed());
		log.info("Validated the Navigation Page properly");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
