package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageobject {

	public WebDriver driver;
	private By email = By.cssSelector("[id='user_email']");
	private By password = By.cssSelector("[type='password']");
	private By login = By.cssSelector("[value='Log In']");
	private By forgotPaswsword = By.linkText("Forgot Password?");

	public loginPageobject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public ForgotPassword forgotpassword() {
		driver.findElement(forgotPaswsword).click();
		return new ForgotPassword(driver);
	}

	public WebElement Emailid() {
		return driver.findElement(email);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement Login() {
		return driver.findElement(login);
	}

}
