package SomaPackages;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class webtables {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
	
	@Test
	public void TetsMethod() {
		List<WebElement> thead= driver.findElements(By.xpath("//table//thead/tr/th"));
		System.out.println("The List of heades: " +thead.size());
		Iterator<WebElement> itr = thead.iterator();
		while(itr.hasNext()) {
			WebElement text = itr.next();
			System.out.println(text);
		}
	}

}
