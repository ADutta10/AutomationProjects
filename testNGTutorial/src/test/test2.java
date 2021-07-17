package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test2 {

	@Parameters({ "URL" })
	@Test
	public void ploan(String urlnames) {
		System.out.println("Personal Loan is approved");
		System.out.println(urlnames);
	}

	@BeforeSuite
	public void befsuite() {
		System.out.println("Before Suite");
	}

}
