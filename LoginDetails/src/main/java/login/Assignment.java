package login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment {
	public WebDriver driver;
	public WebDriverWait wait;
	public Actions action;
	
	@BeforeMethod
	public  void SetUp() {
		driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://annauniv.edu/");	
}
	@Test
	public void testmethod() throws InterruptedException {
		
		driver.findElement(By.linkText("Departments")).click();;
		WebElement depart1 = driver.findElement(By.xpath("//*[@id=\'link3\']/strong"));
		action = new Actions(driver);
		action.moveToElement(depart1).perform();
		//WebElement iocm = driver.findElement(By.xpath("//*[@id=\'menuItemText32\']"));
		WebElement iocm = driver.findElement(By.cssSelector("#menuItemText32"));
		action.moveToElement(iocm).click().perform();
		String atitle = driver.getTitle();
		String etitle = "Anna University - Departments";
		Assert.assertEquals(atitle, etitle, "The Message was succes ");
		System.out.println("The Atitle is :"+atitle);
			
		//WebElement Research = driver.findElement(By.cssSelector("#toplink"));
		//WebElement Research = driver.findElement(By.xpath("//*[@id='link3']"));
		WebElement Research = driver.findElement(By.cssSelector("#link3"));
		
		action.moveToElement(Research).build().perform();
		WebElement costal = driver.findElement(By.xpath("//*[@id=\'menuItemHilite13\']"));
		action.moveToElement(costal).click().perform();
		
		String atite1 = driver.getTitle();
		System.out.println(" The Subpage of the Title is : "+atite1);
		
		Thread.sleep(5000);
		
		
		
		
		
		
	}
	@AfterMethod
	public void tearDown() {
			//driver.close();
	}
}
