package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class test4 {

	@Test(groups= {"smoke"})
	public void APILoginhomeloan() {
		System.out.println("APILoginhomeloan");
	}

	@Test
	public void MobileLoginhomeloan() {
		System.out.println("MobileLoginhomeloan");
	}
	
	@AfterSuite
	public void aftsuite() {
		System.out.println("After Suite");
	}

	@Test
	public void WebLoginhomeloan() {
		System.out.println("WebLoginhomeloan");
	}

}
