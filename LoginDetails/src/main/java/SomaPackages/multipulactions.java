package SomaPackages;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class multipulactions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.name("email"));
		Actions action = new Actions(driver);
		Action performappl =	action.moveToElement(username).click().keyDown(username,Keys.SHIFT).sendKeys(username, "sudhakar")
		.keyUp(username, Keys.SHIFT)
		.doubleClick(username)
		.contextClick().build();
		performappl.perform();
		

	}

}
