package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.rediffHomepage;
import objectRepository.rediffLoginpage;

public class loginApplication {

	@Test
	public void login() {

		// Homepage with PageFactory
		// Loginpage with PageObject

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		rediffLoginpage rd = new rediffLoginpage(driver);
		rd.EmailId().sendKeys("duttaamit");
		rd.Password().sendKeys("12345");
		rd.Submit().click();
		rd.Home().click();
		rediffHomepage rh = new rediffHomepage(driver);
		rh.Search().sendKeys("welcome");
		rh.Submit().click();
	}

}
