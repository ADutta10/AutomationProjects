package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test1 {

	@Test(groups= {"smoke"})
	public void testDemo1() {
		System.out.println("Hello");
	}

	@Test(groups= {"smoke"})
	public void testdemo2() {
		System.out.println("Amit Dutta");
	}
	
	@BeforeMethod
	public void befmethod() {
		System.out.println("*****welcome****");
	}
	
	@AfterTest
	public void afttest() {
		System.out.println("after test");
	}

}
