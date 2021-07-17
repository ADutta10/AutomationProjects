import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2eflightUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='PNQ']")).click();
		Thread.sleep(2000L);
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();// with index
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCU']"))
				.click(); // parent-child relataionship xpath
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("is disabled");
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
		
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for (int i = 1; i < 5; i++) {

			driver.findElement(By.id("hrefIncAdt")).click();

		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByIndex(1);
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
