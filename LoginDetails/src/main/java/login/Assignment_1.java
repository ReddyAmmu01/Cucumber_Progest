package login;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.fail;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
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

import com.google.common.collect.Multiset.Entry;

public class Assignment_1 {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
	String url1 = "https://www.annauniv.edu/index.php";
	String url2 = "https://www.triphobo.com/";
	String url3 = "https://www.google.com/";

	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		// driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	}

	@Test(priority = 1, enabled = false)
	public void testMethod_1() throws InterruptedException {
		driver.get(url1);
		driver.findElement(By.linkText("Departments")).click();
		action = new Actions(driver);
		WebElement FCE = driver.findElement(By.xpath("//strong[contains(text(),'Faculty of Civil Engineering')]"));
		WebElement OCM = driver.findElement(By.cssSelector("#menuItemHilite32"));
		action.moveToElement(FCE).moveToElement(OCM).click().build().perform();
		String atitle = driver.getTitle();
		String etitle = "Anna University - Departments";
		Assert.assertEquals(atitle, etitle, "To verify the title of the Page ");
		System.out.println(" The actual title is : " + atitle);
		Thread.sleep(3000);
		/*
		 * wait = new WebDriverWait(driver, 20); WebElement Research =
		 * wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
		 * "#link3"))); WebElement CPMH =
		 * driver.findElement(By.cssSelector("#menuItem13"));
		 * action.moveToElement(Research).moveToElement(CPMH).click().build().perform();
		 * String atitle1 = driver.getTitle(); String etitle1 =
		 * "Institute For Ocean Management - Anna University offers M.Tech in Coastal Management. ENVIS Center for Coastal Zone Management and Coastal Shelterbelts"
		 * ; Assert.assertEquals(atitle1, etitle1, "To the Success of Page Loaded");
		 * System.out.println("The Second Title is :" + atitle1);
		 */

		WebElement Research = driver.findElement(By.cssSelector("#link3"));
		WebElement CPMH = driver.findElement(By.cssSelector("#menuItem13"));
		action.moveToElement(Research).moveToElement(CPMH).click().build().perform();
		String atitle1 = driver.getTitle();
		String etitle1 = "Institute For Ocean Management - Anna University offers M.Tech in Coastal Management. ENVIS Center for Coastal Zone Management and Coastal Shelterbelts";
		Assert.assertEquals(atitle1, etitle1, "To the Success of Page Loaded");
		System.out.println("The Second Title is :" + atitle1);
		System.out.println("The 2 title is : " + atitle1);
	}

	@Test(priority = 2)
	public void testMethod_2() throws InterruptedException {
		driver.get(url2);
		// wait = new WebDriverWait(driver, 10);
		new WebDriverWait(driver, 4).until(ExpectedConditions.elementToBeClickable(By.linkText("Plan Your Next Vacation"))).click();
		// driver.findElement(By.linkText("Plan Your Next Vacation")).click();
		String startare = "Houston";
		WebElement CurrentCity = driver.findElement(By.cssSelector(".js_city_search"));
		CurrentCity.sendKeys(startare);
		List<WebElement> citylist = driver.findElements(By.cssSelector(".city-list-collection,.js_add_city"));
//		System.out.println("The Total number sugession in the text box : " + citylist.size());
		for (int i = 0; i < citylist.size(); i++) {
		//	System.out.println(citylist.get(i).getText());
			if (citylist.get(i).getText().contains("Houston, British Columbia, Canada")) {
				citylist.get(i).click();
				break;
			}
		}
//		new WebDriverWait(driver, 2).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".add-d-ph"))).click();
//		String destycity = "Ho";
//		String destinationcity = "Hohenschwangau, Bavaria, Germany";
//		try {
//			new WebDriverWait(driver, 3).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".js_city_search")));
//			WebElement DestyNationCity = driver.findElement(By.cssSelector(".js_city_search"));
//			DestyNationCity.sendKeys(destycity);
//		}catch (NoSuchElementException nsee) {
//			System.out.println(nsee.toString());
//		}
//		
//		
//		List<WebElement> list = driver.findElements(By.cssSelector(".city-parent-box,.city-list,.city-list-collection,.js_add_city,.li.city-list-i:nth-child(n) > span"));
//		//li.city-list-i:nth-child(n) > span
//	//	System.out.println("The List City for Destination : " + list.size());
//		
//		for (int j = 0; j < list.size(); j++) {
//			//System.out.println("The Destination ==> : " + list.get(j).getText());
//			try {
//				if (list.get(j).getText().contains(destinationcity)) {
//					list.get(j).click();
//					//driver.navigate().refresh();
//					break;
//					}
//				
//			} catch (Exception e) {
//				System.out.println(e.getMessage());
//			}
//			
//			}
		
		String month = "May 2020";
		String edate = "11";
		
		driver.findElement(By.cssSelector(".start-date-control,.dp1584941879555")).click();
		while(true)
		{
			String text2 = driver.findElement(By.cssSelector(".ui-corner-left > div:nth-child(2)")).getText();
			//String text2 = driver.findElement(By.cssSelector(".ui-datepicker-header,")).getText();
		//	System.out.println(text2);
			if(text2.equals(month)) {
				break;
			} else 
			{
				driver.findElement(By.cssSelector(".ui-datepicker-next")).click();
			}
		}
			List<WebElement> alldate = driver.findElements(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr/td"));
			for(int i=1;i<alldate.size();i++) {
				String date =alldate.get(i).getText();
				//System.out.println("The Date are  : " + date);
				if(alldate.get(i).getText().contains(edate)) {
					alldate.get(i).click();
					
					break;
				}
			}
			
			String edate1 = "30";
			List<WebElement> alldate1 = driver.findElements(By.xpath("/html/body/div[5]/div[1]/table/tbody/tr/td/a"));
			for(int i=1;i<alldate1.size();i++) {
				String date1 = alldate1.get(i).getText();
				if(alldate1.get(i).getText().contains(edate1)) {
					alldate1.get(i).click();
					System.out.println("The Date Successfully completed After Destination");
					break;
					
				} 
				
			}
			String sugtextval = "Things to do";
			new WebDriverWait(driver,1).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='button p-color full-width start-planning']"))).click();
			driver.findElement(By.cssSelector(".next-button")).click();
			List<WebElement> sugg = driver.findElements(By.cssSelector(".select-profile-1 > div:nth-child(2) > div:nth-child(n) > span"));
			//List<WebElement> sugg = driver.findElements(By.cssSelector(".profile--c,.label div"));
			System.out.println("The Suggession Sige is : " + sugg.size());
			for(int i=0;i<sugg.size();i++) {
				String suggtext = sugg.get(i).getText();
				System.out.println("The Suggession Text is : "+ suggtext);	
				if(sugg.get(i).getText().contains(sugtextval)) {
					sugg.get(i).click();
				}
			}
			driver.findElement(By.id("js_city_next_step_title")).click();
			try {
		//	new WebDriverWait(driver, 1).until(ExpectedConditions.elementToBeClickable(By.cssSelector(".solo-point")));
			driver.findElement(By.cssSelector(".solo-point")).click();;
			}
			catch(TimeoutException toe) {
				System.out.println(toe.toString());
			}
			driver.findElement(By.id("js_city_next_step_title")).click();
			try {
			new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='p-color p-size button next-btn-dsk']")));
			driver.findElement(By.xpath("//span[@class='p-color p-size button next-btn-dsk']")).click();;
			}catch(NoSuchElementException nsee) {
				System.out.println(nsee.toString());
			}
			catch (TimeoutException toe) {
				System.out.println(toe.getMessage());
			}
			try {
			new WebDriverWait(driver,1).until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Editable view')]")));
			driver.findElement(By.xpath("//span[contains(text(),'Editable view')]")).click();
			}
			catch(NoSuchElementException nsee) {
				System.out.println(nsee.getMessage());
			}
			System.out.println("The Editable View is Clickable successfully ");
			//WebElement saveplan = driver.findElement(By.xpath("//span[contains(text(),'save-to-plan')]"));
			WebElement saveplan = driver.findElement(By.xpath("//span[@class='button p-size p-color save-to-plan']"));
			WebElement finalbutton =  driver.findElement(By.xpath("//span[contains(text(),'Finish Planning')]"));
			Actions action = new Actions(driver);
			action.moveToElement(saveplan).moveToElement(finalbutton).build().perform();
			
//			/html/body/main/div[5]/div/div[3]/div/div[1]/div[2]/div[1]/div/ul/li[2]/span
			
	}
	
	

	@Test(priority = 3, enabled = false)
	public void testMethod_3() throws InterruptedException {
		driver.get(url3);
		wait = new WebDriverWait(driver, 20);
		WebElement gmail = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Gmail")));
		gmail.click();
		WebElement signin = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign in")));
		signin.click();
		String paresnt = driver.getWindowHandle();
		Set<String> wim = driver.getWindowHandles();
		Iterator<String> itr = wim.iterator();
		while (itr.hasNext()) {
			String chaild = itr.next();
			Thread.sleep(4000);
			if (!paresnt.equalsIgnoreCase(chaild)) {

				driver.switchTo().window(chaild);
				// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='identifierId']"))).sendKeys("sivaprasad");
				Thread.sleep(1000);
				WebElement text = driver.findElement(By.xpath("//*[@id='identifierId']"));
				text.sendKeys("Sudhakar");
				Thread.sleep(1000);
				System.out.println(driver.getTitle());
				driver.close();

			}

		}
		driver.switchTo().window(paresnt);
		driver.navigate().back();
		driver.findElement(By.name("q")).sendKeys("selenium webdriver");
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(2000);

	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}

}
