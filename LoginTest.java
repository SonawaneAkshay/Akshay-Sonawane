package testCases;

import java.io.IOException;

import org.bouncycastle.crypto.generators.OpenBSDBCrypt;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.dockerjava.api.command.PullImageCmd;

import pageObjects.AccountPage;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class LoginTest  extends Base {
	
	@Parameters("browser")
	@BeforeMethod(groups = {"Smoke","Regression"})
	
	  public void OpenApplication() throws IOException {
	  
		WebDriver driver= intializeBrowser();
	   driver.get(prop.getProperty("url"));
	}

	
	
	@Test(groups = "Smoke")
	public void login() throws IOException, InterruptedException {
		
	    
		
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropdown().click();
		landingPage.loginOption().click();
		
		
		Thread.sleep(3000);
	    LoginPage loginPage = new LoginPage(driver);
	    loginPage.emailAdderssField().sendKeys(prop.getProperty("Email"));
	    loginPage.passwordField().sendKeys(prop.getProperty("Password"));
	    loginPage.loginBtn().click();
	    
	    AccountPage accountPage = new AccountPage(driver);
	    Assert.assertTrue( accountPage.editYourAccountInformationOption().isDisplayed());
	   	
	}
	
	@AfterMethod (groups = {"Smoke","Regression"})
	public void tearDown() {
		
		driver.close();
		
	}
	
//	@DataProvider
//	public Object[][] getLoginData() {
		
	//	Object [] [] data = {{"stylishak09@gmail.com","AkshAy@852","Successfull"}, {"asonawane154@gmail.com","NeverSettle@123","Failure"}};
		
	//	return data;
//	}
	
}
