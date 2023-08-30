package pradnya.testcases;

import org.testng.annotations.Test;

public class TestNgPriority {

	@Test(groups = {"smoke"})
	public void test1() 
	{
		System.out.println("test1");
	}
	
	@Test(priority = 4)
	public void ab() 
	{
		System.out.println("ab");

	}
	
	@Test(priority = 1)
	public void test3() 
	{
		System.out.println("test3");

	}
	
	@Test(priority = -5)
	public void test4() 
	{
		System.out.println("test4");

	}
	
}
