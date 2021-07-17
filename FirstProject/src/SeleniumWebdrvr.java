import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebdrvr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ABC\\Downloads\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("Amit"); //username
		//driver.findElement(By.name("pass")).sendKeys("12345"); //password
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Amit");//usernameby xpath
		driver.findElement(By.cssSelector("input#pass.inputtext._55r1._6luy._9npi")).sendKeys("12345");//password by css
		driver.findElement(By.linkText("Forgotten password?")).click(); // click forgot account
		//System.out.println(driver.findElement(By.cssSelector("div._9nq2.marginBottom16px")).getText());

	}

}
