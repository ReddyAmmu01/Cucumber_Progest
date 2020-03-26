package SomaPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {
	public static void main(String[]  args ) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		WebElement radio = driver.findElement(By.id("u_0_6"));
		for(int i=0;i<2;i++) {
			radio.click();
			System.out.println(!radio.isSelected());
		}
		
		driver.get("http://demo.guru99.com/test/radio.html");
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
		radio1.click();
		if(radio1.isSelected()) {
			System.out.println("The Option1 was selected ");
		}else
		{
			System.out.println("The Option1 was not selected");
		}
		
		if(!radio2.isSelected()) {
			System.out.println("The Option2 was selected");
		}else {
			System.out.println("The option was not selected :");
		}
	
		WebElement checkbox1 = driver.findElement(By.id("vfb-6-0"));
		WebElement checkbox2 = driver.findElement(By.id("vfb-6-1"));
		WebElement checkbox3 = driver.findElement(By.id("vfb-6-2"));
				checkbox1.click();
		if(checkbox1.isSelected()) {
			System.out.println("The Check box was Selected :");
		}else {
			System.out.println("The Check box was not selected :");
		}
		
		checkbox2.click();
		if(!checkbox2.isSelected()) {
			System.out.println("The Check Box was selected ");
		}else {
			System.out.println("The Check box was selected in the check box :");
		}
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")).click();
//		driver.findElement(By.xpath("//i[@class='fb_logo img sp_3UHi6Z3AUhD_2x sx_8f9a17']")).click();
		if(driver.getTitle().equals("Facebook – log in or sign up")) {
			System.out.println("The Facebook login page Loaded on the page ");
		}
		else {
			System.out.println("The FaceVook login Page is not Loaded :");
		}
		
		driver.quit();
	}

}
