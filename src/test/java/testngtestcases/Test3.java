package testngtestcases;

import org.testng.annotations.Test;

public class Test3 {
@Test(priority=1,groups="functional")
	public void clickonAddToCart()
{
	System.out.println("product Added to cart");
}
@Test(priority=2,groups="sanity")
public void addDeliveryAddress()
{
System.out.println("Delivery address added successfully");
}
}
