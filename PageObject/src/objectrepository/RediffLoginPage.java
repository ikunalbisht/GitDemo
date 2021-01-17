package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	
	WebDriver driver;
	 public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	 
	

	By username = By.id("login1");
	By password = By.id("password");
	By proceed = By.xpath("//input[@type='submit']");
	By errorText = By.xpath("//div[@id='div_login_error']");
	
	By home = By.linkText("rediff.com");
	
	public WebElement enterUsername() {
		
	return driver.findElement(username);	
	
	}
	
	public WebElement enterPassword() {
		
	
		return driver.findElement(password);
	}
	
	public WebElement submit() {
		
		return driver.findElement(proceed);
	}

	public WebElement errorMsg() {
		
		return driver.findElement(errorText);
	}
	public WebElement home() {
		
		return driver.findElement(home);
	}
	
	

}
/*      driver.findElement(By.id("login1")).sendKeys("Kunalbisht");   */