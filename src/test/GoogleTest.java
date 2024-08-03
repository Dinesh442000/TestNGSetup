package test;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.google.com/");
	}
	
	@Test(priority = 2,groups="logo")
	public void googleTest() {
		//driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test(groups="logo")
	public void logoDisplay() {
		boolean b1 = driver.findElement(By.xpath("//img[@id='hplogo']")).isDisplayed();
		System.out.println(b1);
	}
	
	@Test(groups="logo")
	public void linkText() {
		 driver.findElement(By.partialLinkText("Gmail")).click();
		
	}
	
	@Test(groups="logo")
	public void Test1() {
		System.out.println("justTest");
	}
	
	@Test(groups="title")
	public void Test2() {
		System.out.println("justTest");
	}
	
	@Test(groups="title")
	public void Test3() {
		System.out.println("justTest");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
