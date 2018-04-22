package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepageObj {
		
		WebDriver driver;
		public HomepageObj(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
	
	
		public WebElement RegistryLink()	{

			return driver.findElement(By.linkText("Registries & Lists"));
			
			
			//driver.findElement(By.linkText("Registries & Lists"))
		}
	
}
