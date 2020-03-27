package SomaPackages;

import java.text.NumberFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class dynamictable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver ;
//		driver.get("http://demo.guru99.com/test/web-table-element.php");
//		//List colums = driver.findElements(By.xpath(".//*[id='leftcontainer']/table/thead/tr/th"));
//		List<WebElement> colums = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
//		System.out.println(colums.size());
//		for(int i=0;i<colums.size();i++) {
//			String text = colums.get(i).getText();
//			System.out.println(text);
//		}
//		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td"));
//		System.out.println("The Row size of : " + rows.size());
//		for(int i=0;i<rows.size();i++) {
//			String ele = rows.get(i).getText();
//			System.out.println("The Text ele : "+ele );
//		}
//		 WebElement baseTable = driver.findElement(By.tagName("table"));
//		 //featch the 3 row details
//		WebElement tableRow = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]"));
//		System.out.println(tableRow.getText());
//		//fetach the 3 row and 4 column
//		WebElement tableRowcell = baseTable.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[3]/td[4]"));
//		System.out.println(tableRowcell.getText());
		
		// Fetch the Maximum value in the table :
//		double m=0,r=0;
//		String  max;
//		List<WebElement> colum = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
//		System.out.println(colum.size());
//		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr//td[1]"));
//		System.out.println("The row size is "+ rows.size());
//		for(int i=0;i<rows.size();i++) {
//			max = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+(i+1)+"]//td[4]"));
//			NumberFormat f = NumberFormat.getNumberInstance();
//			Number num = f.parse(max);
//			max = num.toString();
//			m = Double.parseDouble(max);
//			if(m>r) {
//				r=m;
//			}
//		}
//		System.out.println("The Maximum price is :"+ r);
//		driver.close();
		
//		driver.get("http://demo.guru99.com/test/table.html");
//		//locate the row of the table 
//		WebElement table = driver.findElement(By.xpath("/html/body/table"));
//		//calculate no of rows in table 
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		int rows_count = rows.size();
//		System.out.println("To Count the Number of Rows: " + rows_count);
//		//we take the end of the loop
//		for(int i=0;i<rows.size();i++) {
//			//To locate the column cell of the tale
//				List<WebElement> cell = rows.get(i).findElements(By.tagName("td"));
//				int cell_count = cell.size();
//				System.out.println("Number of cell in Row : "+rows_count +"are columns : " + cell_count);
//				for(int j=0;j<cell_count;j++) {
//					String cell_text = cell.get(j).getText();
//					System.out.println("The Cell value of the row number : "+ i+" and Culumns number :"+j+"  is  :"+cell_text);
//				}
//				System.out.println("====================================================================");
//				//driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr["+i+"]//td["+j+"]"));
//		}

		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability(CapabilityType.BROWSER_NAME,"IE");
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		driver = new InternetExplorerDriver();
		driver.get("http://demo.guru99.com/test/table.html");
		driver.quit();

	}

}
