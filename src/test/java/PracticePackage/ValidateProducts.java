package PracticePackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PracticePackage.Base;

public class ValidateProducts {
	
	@Test
	public void validateProducts() throws IOException, InterruptedException {

		
		WebDriver driver;
		String url;
		String title;
		String searchVal;
		WebElement RegLink;
		
		Base b=new Base();
		driver=b.invokeBrowser();
			
		url=b.grabUrl();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(100);
		
		for(int i=0;i<4;i++) {
			
			driver.findElement(By.xpath("//*[@id=\"search\"]")).clear();
			Thread.sleep(3000);
			searchVal=b.getCellVal(i, 0, 1).getStringCellValue();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(searchVal);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
		}
	}

}
