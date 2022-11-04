package testCases;
import java.io.IOException;
import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageObjects.AccountSuccessPage;
import pageObjects.LandingPage;
import pageObjects.RegistrationAccountPage;
import resources.Base;

public class RegisterAccountTest extends Base{
	
	public WebDriver driver;
	
	@Test(groups = "Smoke")
	public void registerNewAccountByProvidingAllDetails() {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		landingPage.registerOption().click();
		
		RegistrationAccountPage registrationAccountPage = new RegistrationAccountPage(driver);
		
		registrationAccountPage.enterFirstName(prop.getProperty("firstName"));
		registrationAccountPage.enterLastName(prop.getProperty("lastName"));
		registrationAccountPage.enterEmailAddress(prop.getProperty("email"));
		registrationAccountPage.enterTelephoneNumber("telephone");
		registrationAccountPage.enterPassword("validPassword");
		registrationAccountPage.enterPasswordConfirm("validPassword");
		registrationAccountPage.selectYesRadioOption();
		registrationAccountPage.selectAgreeCheckBoxOption();
		registrationAccountPage.clickOnContinueButton();
		
		AccountSuccessPage accountSuccessPage = new AccountSuccessPage(driver);
		
		Assert.assertEquals(accountSuccessPage.retrievePageHeading(),"Your Account Has Been Created!");
		
	}
		
		@Parameters("browser")
		@BeforeMethod(groups = {"Smoke","Regression"})
		public void setup() throws IOException {
			
			driver = intializeBrowser();
			driver.get(prop.getProperty("url"));   
			
	}
		@AfterMethod(groups = {"Smoke","Regression"})
		public void tearDown() {
			driver.close();
		}
		
}
