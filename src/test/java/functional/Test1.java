package functional;

import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority=1)
	public static void validatelogin()
	{
		System.out.println("Login Successful");
	}

	@Test(priority=2)
	public static void validatepagetitle()
	{
		System.out.println("Page Title is correct");
	}
	@Test(priority=3)
	public static void searchforaproduct()
	{
		System.out.println("Product is found");
	}
	}


