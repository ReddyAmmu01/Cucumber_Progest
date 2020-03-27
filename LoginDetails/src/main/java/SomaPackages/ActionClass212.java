package SomaPackages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/newtours/");
		WebElement home =  driver.findElement(By.xpath("//a[contains(text(),'Home')]"));
		WebElement td_home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody"));
		
		Actions act = new Actions(driver);
		Action mousebuilder = act.moveToElement(home).build();
		
		String bg_coor = td_home.getCssValue("background-color");
		System.out.println("Before hover " + bg_coor);
		mousebuilder.perform();
		bg_coor = td_home.getCssValue("background-color");
		System.out.println("After hover :" +bg_coor);
		driver.close();
		
	}

}
