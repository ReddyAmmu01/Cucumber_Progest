package login;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage {
	public WebDriver driver; 
	@BeforeMethod
	public  void SetUp() {
		System.setProperty("Webdriver.geko.driver","\\LoginDetails\\Browsers\\chromedriver.exe");
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");	
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void TestMethd() {
		
		
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-username")));
			ele.sendKeys("ketanvj");
			
			//driver.findElement(By.id("login-username")).sendKeys("ketanvj");
			driver.findElement(By.id("login-signin")).click();
			//Thread.sleep(3000);
			
			WebElement pass = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-passwd")));
			pass.sendKeys("123456");
			//driver.findElement(By.id("login-passwd")).sendKeys("123456");
			driver.findElement(By.id("login-signin")).click();
			
	
		
	}
}
