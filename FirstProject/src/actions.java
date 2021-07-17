import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

		driver.manage().window().fullscreen();// open window in fullscreen

		WebElement move1 = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		WebElement move2 = driver.findElement(By.id("twotabsearchtextbox"));

		Actions a = new Actions(driver);
		a.moveToElement(move2).click().keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();

		// a.moveToElement(move1).build().perform(); // move mousehover
		a.moveToElement(move1).contextClick().build().perform();// right click

	}

}
