package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediffHomepage {

	WebDriver driver;

	public rediffHomepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(id = "srchword")
	WebElement search;

	@FindBy(xpath = "//input[@class='newsrchbtn']")
	WebElement submit;

	public WebElement Search() {
		return search;
	}

	public WebElement Submit() {
		return submit;
	}

}
