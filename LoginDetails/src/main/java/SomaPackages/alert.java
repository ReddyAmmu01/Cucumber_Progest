package SomaPackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("porava");
		driver.findElement(By.name("submit")).submit();
		Alert alert = driver.switchTo().alert();
		String text = driver.switchTo().alert().getText();
		System.out.println("Alert Text Box Message is : " + text);
		//alert.accept();
		System.out.println("The Text compleated on display ");
		driver.quit();
	}

}
