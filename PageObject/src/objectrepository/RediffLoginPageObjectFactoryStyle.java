package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageObjectFactoryStyle {
	
	WebDriver driver;
	public 	RediffLoginPageObjectFactoryStyle(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this );/* Mandatory code for initialising PageFactory. */
	}

	@FindBy(id="login1")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public WebElement username() {
		return username;
	}
	public WebElement inputPassword() {
		return password;
	}
	public WebElement clickSignIn() {
		return submit;
	






}
	
	




}
