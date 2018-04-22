package PracticePackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import objectRepository.HomepageObj;
import objectRepository.RegistryObj;

public class ClickRegLink {
	
	//scenario2: click on Registry link and search registry by firstname & lastname
	
	@Test(dataProvider="getNames")
	public void SearchRegistry(String fName, String lName ) throws IOException {
		
		WebDriver driver;
		String url;
		String title;
		WebElement RegLink;
		
		Base b=new Base();
		driver=b.invokeBrowser();
			
		url=b.grabUrl();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		HomepageObj hp=new HomepageObj(driver);
		hp.RegistryLink().click();
		
		
		
		
		RegistryObj r=new RegistryObj(driver);
		r.FirstName().sendKeys(fName);
		r.LastName().sendKeys(lName);
		r.Search().click();
		
		String Expectedmessage="Sorry, we didn’t find anyone by that name. Please try";
		
		String Actualmessage=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/div/div/div/form/div[3]/span/span/span")).getText();
		
		Assert.assertEquals(Actualmessage,Expectedmessage);

		
		
		driver.close();
		driver=null;
		
		
		
	}
	
	@DataProvider
	public Object[][] getNames() {
		
		Object[][] obj=new Object[3][2];
		
		obj[0][0]="Meeky";
		obj[0][1]="Mohanty";
		
		obj[1][0]="Subash";
		obj[1][1]="Keshapragada";
		
		obj[2][0]="Akira";
		obj[2][1]="Keshapragada";
		
		return obj;
	}
 
}
