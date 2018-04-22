package PracticePackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class RegitriesandLists extends Base {
	
	//1st scenario: open target.com and verify that title of the webpage starts with Target
	
	@Test
	public void Registry() throws IOException {
		
		WebDriver driver;
		String url;
		String title;
		WebElement RegLink;
		
		Base b=new Base();
		driver=b.invokeBrowser();
			
		url=b.grabUrl();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

		title=driver.getTitle();
		System.out.println(title);
		
		//Assert.assertTrue(title.startsWith("Target"));
		
		
	
		
	}
	
	

}
