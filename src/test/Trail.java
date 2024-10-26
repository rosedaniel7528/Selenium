package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Trail {
	@BeforeTest
	public void hiturl()
	{
		System.out.println("link opened");
		System.out.println("GOOD BRO");
		System.out.println("GOOD sure");
		System.out.println("link opened");
		System.out.println("GOOD BRO");
		System.out.println("GOOD sure");
		System.out.println("link opened");
		System.out.println("GOOD BRO");
		System.out.println("GOOD sure");
	}
	@AfterTest
	public void closeurl()
	{
		System.out.println("link closed");
	}

}
