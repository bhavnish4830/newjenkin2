package jenkinmave.newjenkin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class abc 
{
	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "../newjenkin/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		System.out.println("first test for jenkin");
	}

	@BeforeTest
	public void test()
	{
		System.out.println("before test");		
		
	}

}
