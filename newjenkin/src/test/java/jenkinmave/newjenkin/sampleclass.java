package jenkinmave.newjenkin;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleclass 
{
	
	@Test
	public void test1()
	{
		
		System.out.println("first test for jenkin");
	}

	@BeforeTest
	public void test()
	{
		System.out.println("before test");		
		
	}
}
