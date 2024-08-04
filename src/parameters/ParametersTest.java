package parameters;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	WebDriver driver;
	String url,email;
	@Test
	@Parameters({"url","email"})
	public void login(String url, String email) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']"))
		.sendKeys(email);
		
	}
	
	@BeforeMethod
	public void getDataFromConfigFile() throws IOException {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
		"C:\\Users\\DChoudhary5\\eclipse-workspace\\TestNGSetup\\config.properties");
		prop.load(ip);
		url = prop.getProperty("url");
		email = prop.getProperty("email");
				
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void loginConfigFileData() {
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']"))
		.sendKeys(email);
	}
	
}
