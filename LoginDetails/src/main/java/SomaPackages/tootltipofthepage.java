package SomaPackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class tootltipofthepage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("http://www.naveenautomationlabs.com/");
//		String text = driver.getTitle();
//		Actions buld = new Actions(driver);
//		buld.clickAndHold().moveByOffset(50,0).release();
//		Action builder = buld.build();
//		builder.perform();
//	
		driver.get("http://demo.guru99.com/test/tooltip.html");
//		String etitle = "What's new in 3.2";
//		WebElement download = driver.findElement(By.xpath("//*[@id=\"demo_content\"]/div/div"));
//		Actions builder = new Actions(driver);
//		builder.clickAndHold().moveToElement(download);
//		builder.moveToElement(download).build().perform();
//		WebElement toolTipElemnt = driver.findElement(By.xpath("//*[@class='box']//div//a"));
//		String atitle = toolTipElemnt.getText();
//		System.out.println("The Actual title : "+atitle);
//		
//		if(atitle.equals(etitle)) {
//			System.out.println("The Title of the page is match");
//		}else {
//			System.out.println("The Title of the page is not match ");
//		}///html/head/title
		
//		WebElement title_of_page = driver.findElement(By.xpath("/html/head/title"));
//		Actions action = new Actions(driver);
//		action.clickAndHold().moveToElement(title_of_page);
//		action.moveToElement(title_of_page).build().perform();
		String title_of = driver.findElement(By.xpath("//title[contains(text(),'Tooltip Demo')]")).getAttribute("title");
		System.out.println(title_of);
		
	}

}
