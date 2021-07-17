package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediffLoginpage {

	WebDriver driver;

	public rediffLoginpage(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.xpath(".//*[@id='login1']");
	By password = By.name("passwd");
	By go = By.name("proceed");
	By home = By.linkText("rediff.com");

	public WebElement EmailId() {
		return driver.findElement(username);
	}

	public WebElement Password() {
		return driver.findElement(password);
	}

	public WebElement Submit() {
		return driver.findElement(go);
	}

	public WebElement Home() {
		return driver.findElement(home);
	}
}
