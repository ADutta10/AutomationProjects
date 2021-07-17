import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ABC\\Downloads\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("myusername");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("mypassword");
		driver.findElement(By.cssSelector("#Login")).click();
		
	

	}

}
