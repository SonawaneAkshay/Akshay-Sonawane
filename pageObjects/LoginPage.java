package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
	  this.driver = driver;
	  PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id = "input-email")
	WebElement emailAdderssField;
	
	@FindBy(id = "input-password")
	WebElement passwordField;
	
	@FindBy(xpath = "//*[@type=\"submit\"]")
	WebElement loginBtn;
	
	public WebElement emailAdderssField() {
		
		return emailAdderssField;
	}
	
	public WebElement passwordField() {
		
		return passwordField;
		
	}
	
	public WebElement loginBtn() {
		
		return loginBtn;
		
	}

}
