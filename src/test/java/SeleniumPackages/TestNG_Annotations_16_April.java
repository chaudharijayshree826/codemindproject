package SeleniumPackages;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Annotations_16_April {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite.");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite.");
	}
	
	
	@BeforeTest
	public void befoerTestPlan()
	{
		System.out.println("before Test Plan");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Test class.");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before Method");
	}
	
	
	@Test
	public void testCase1()
	{
		System.out.println(".............Execute test case1..................");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println(".............Execute test case2..................");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Test class.");
	}
	
	
	
	@AfterTest
	public void afterTestPlan()
	{
		System.out.println("after Test Plan");
	}
}
