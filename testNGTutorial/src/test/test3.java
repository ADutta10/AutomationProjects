package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test3 {

	@Test(groups = { "smoke" })
	public void APILogincarloan() {
		System.out.println("APILogincarloan");
	}

	@Test(dependsOnMethods = { "WebLogincarloan" })
	public void MobileLogincarloan() {
		System.out.println("MobileLogincarloan");
	}

	@BeforeTest
	public void beftest() {
		System.out.println("before test");
	}

	@Test(timeOut = 2000)
	public void MobileSignincarloan() {
		System.out.println("MobileSignincarloan");
	}

	@Parameters({ "URL" })
	@Test
	public void MobileSignoutcarloan(String urlname) {
		System.out.println("MobileSignoutcarloan");
		System.out.println(urlname);
	}

	@Test(dataProvider = "getData")
	public void WebLogincarloan(String user, String pwd) {
		System.out.println("WebLogincarloan");
		System.out.println(user);
		System.out.println(pwd);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "User1";
		data[0][1] = "Pwd1";
		data[1][0] = "User2";
		data[1][1] = "Pwd2";
		data[2][0] = "User3";
		data[2][1] = "Pwd3";
		return data;
	}

}
