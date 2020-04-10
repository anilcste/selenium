package webdrivermaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite 
	public void setup() {
		
		driver = new FirefoxDriver();
 }
    @Test 
	public void dologin () {
		
			driver.get("https://Gmail.com");
	        driver.findElement(By.id("Email")).sendKeys("Vnilcste");
	        driver.findElement(By.id("passwd")).sendKeys("sample");      
	}
	
    @AfterSuite
    public void tearDown() {
    	driver.quit();
    }
    
}

