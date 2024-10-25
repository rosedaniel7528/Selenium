package test;

import org.testng.annotations.Test;

public class Child extends Trail{
	@Test
	public void dothis()
	{
		utility utility= new utility(2); //parameterized constructor this directly send the value 2 to all the method in class
		System.out.println(utility.increment());
		System.out.println(utility.decrement());
		System.out.println(utility.multiply2());
	}

}
