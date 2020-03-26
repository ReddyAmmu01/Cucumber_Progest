package login;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class teampfile {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/popup.php");
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test
	public void testmethod_1() throws InterruptedException {
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		String Mainwindow = driver.getWindowHandle();
		Set<String> win = driver.getWindowHandles();
		Iterator<String> itr = win.iterator(); 
		while(itr.hasNext()) {
			String chaild = itr.next();
			if(!Mainwindow.equalsIgnoreCase(chaild)) {
				driver.switchTo().window(chaild);
				driver.findElement(By.name("emailid")).sendKeys("raimani1@gmail.com");
				driver.findElement(By.name("btnLogin")).submit();
				Thread.sleep(2000);
				driver.close();
			}
		}
		driver.switchTo().window(Mainwindow);
		System.out.println("The output is :" + driver.getTitle());
	}

}
