import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/qadbt", "root", "9051");

		Statement s = con.createStatement();
		ResultSet rs = s.executeQuery("select * from Employeeinfo where name='Amit'");
		while (rs.next()) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABC\\Downloads\\work\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.cssSelector("input[id='username']")).sendKeys(rs.getString("address"));
			driver.findElement(By.cssSelector("input[id='password']")).sendKeys(rs.getString("age"));
		}

	}

}
