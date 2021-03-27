package testngtestcases;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Test2 {
	@Test(groups="regression")
public void verifyPagetitle()
{
	String expectedTitle="Google";
	String actualTitle="Google";
	Assert.assertEquals(expectedTitle, actualTitle);
	System.out.println("Page titel verified Successfully");
}
}
