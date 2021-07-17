import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class Demo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// for chrome driver
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ABC\\Downloads\\work\\chromedriver.exe");
		// for firefox driver
		// System.setProperty("webdriver.gecko.driver",
		// "C:\\Users\\ABC\\Downloads\\work\\geckodriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		driver.manage().window().fullscreen();
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("E://screenshot.png"));
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("http://yahoo.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.close();
		
		
		

	}

}
