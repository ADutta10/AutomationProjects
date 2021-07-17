package Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class e2eAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input")).click();
		String text = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();

		WebElement staticdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByVisibleText(text);
		
		driver.findElement(By.name("enter-name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		String text1 = driver.switchTo().alert().getText();
		
		if(text1.contains(text)) {
			
			System.out.println("program successful");
		}
		else {
			System.out.println("program not successful - some error");
		}
	}

}
