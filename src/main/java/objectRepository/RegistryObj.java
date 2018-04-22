package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistryObj {
	
	WebDriver driver;
	
	public RegistryObj(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public WebElement FirstName() {
		
		By fname=By.id("registrySearchFirstName");
		return driver.findElement(fname);
	}
	
	
	public WebElement LastName() {
		
		By lname=By.id("registrySearchLastName");
		return driver.findElement(lname);
	}

    public WebElement Search() {
		
		By search=By.xpath("//button[@type='submit']");
		return driver.findElement(search);
	}
}
