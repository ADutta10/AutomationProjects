package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPageobject {

	public WebDriver driver;
	private By signin = By.cssSelector("a[href*='sign_in']");
	private By title = By.cssSelector("[class='text-center']");
	private By navbar = By.cssSelector("[class*='navbar-right']");
	private By header = By.cssSelector("div[class*='video-banner'] h3");

	public landingPageobject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public loginPageobject Signin() {
		driver.findElement(signin).click();
		loginPageobject lpo = new loginPageobject(driver);
		return lpo;
	}

	public WebElement getTitle() {
		return driver.findElement(title);
	}

	public WebElement getNavbar() {
		return driver.findElement(navbar);
	}

	public WebElement getHeader() {
		return driver.findElement(header);
	}

}
