package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationAccountPage {

	WebDriver driver = null;

	public RegistrationAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id="input-email")
	private WebElement emailAddressField;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(id="input-confirm")
	private WebElement passwordConfirmField;
	
	@FindBy(xpath="//label[normalize-space()='Yes']")
	private WebElement yesRadioOption;
	
	@FindBy(css="input[value='0']")
	private WebElement noRadioOption;
	
	@FindBy(name="agree")
	private WebElement agreeCheckBoxOption;
	
	@FindBy(css="input[value='Continue']")
	private WebElement continueButton;
	
	public void enterFirstName(String firstName) {
		
		firstNameField.sendKeys(firstName);
		
	}
	
	public void enterLastName(String lastName) {
		
		lastNameField.sendKeys(lastName);
		
	}
	
	public void enterEmailAddress(String emailAddress) {
		
		emailAddressField.sendKeys(emailAddress);
		
	}
	
	public void enterTelephoneNumber(String telephoneNumber) {
		
		telephoneField.sendKeys(telephoneNumber);
		
	}
	
	public void enterPassword(String password) {
		
		passwordField.sendKeys(password);
		
	}
	
	public void enterPasswordConfirm(String password) {
		
		passwordConfirmField.sendKeys(password);
		
	}
	
	public void selectYesRadioOption() {
		
		yesRadioOption.click();
		
	}
	
	public void selectNoRadioOption() {
		
		noRadioOption.click();
		
	}
	
	public void selectAgreeCheckBoxOption() {
		
		agreeCheckBoxOption.click();
		
	}
	
	public void clickOnContinueButton() {
		
		continueButton.click();
		
	}

	
	
	
}
