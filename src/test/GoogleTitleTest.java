package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {
WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
	}
	
	@Test()
	public void googleTest() {
		//driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google1","title did not match");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
