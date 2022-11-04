/**
 * 
 */
package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author StylishAk
 *
 */
public class LandingPage {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath ="//*[@title=\"My Account\"]")
	 WebElement myAccountDropdown;
	
	@FindBy( linkText = "Register")
	WebElement registerOption;
	
	@FindBy(linkText = "Login")
	 WebElement loginOPtion;
	
	
	
	public WebElement myAccountDropdown() {
		
		return myAccountDropdown;
	}
	
	public WebElement registerOption() {
		
		return registerOption; 
	}
	
	public WebElement loginOption() {
		
		return loginOPtion;
	}

}
