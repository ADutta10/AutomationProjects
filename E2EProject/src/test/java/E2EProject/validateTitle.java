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

public class validateTitle extends base {
	public WebDriver driver;
	private static Logger log = LogManager.getLogger(base.class.getName());
	landingPageobject lp;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void validateTitlePage() throws IOException {

		lp = new landingPageobject(driver);
		Assert.assertEquals(lp.getTitle().getText(), "FEATURED C123OURSES");
		log.info("Validated the Title properly");
	}

	@Test
	public void validateTitlePageHeader() throws IOException {

		Assert.assertEquals(lp.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		log.info("Validated the Title properly");
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
