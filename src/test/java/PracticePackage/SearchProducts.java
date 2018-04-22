package PracticePackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchProducts {
	
	@Test
	public void SearchProd() throws IOException {
		Base b=new Base();
		WebDriver driver=b.invokeBrowser();
		String url=b.grabUrl();
		
		driver.get(url);
		
		
		/*driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys("coffee table");*/
		
		for (int i=1;i<=2;i++) {
			
			driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(b.getCellVal(i, 0, 1).getStringCellValue());
			driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//input[@type=\"search\"]")).clear();
		
		}	
		
		driver.close();
		driver=null;
	}
	@Test
	public void TestCase2() {
		
		System.out.println("This is testcase two");
	
	}
	@Test
	public void TestCase3() {
		
		System.out.println("This is testcase three");
	
	}
	
}