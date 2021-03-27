package regression;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	@BeforeMethod
	public void launchBrowser()
	{
		System.out.println("Browser is launched");
	}
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("Browser is closed");
	}
	@BeforeTest
	public void createDBconnection()
	{
		System.out.println("Db is connected");
	}
	@AfterTest
	public void closeDBconnection()
	{
		System.out.println("Db connection is closed");
	}
	@Test(priority=1,groups="sanity")
	public static void validatelogin()
	{
		System.out.println("Login Successful");
	}

	@Test(priority=2,groups="sanity")
	public static void validatepagetitle()
	{
		System.out.println("Page Title is correct");
	}
	@Test(priority=3,groups="functional")
	public static void searchforaproduct()
	{
		System.out.println("Product is found");
	}
	}


