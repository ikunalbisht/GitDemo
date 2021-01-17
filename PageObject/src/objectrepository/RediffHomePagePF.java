package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePagePF {
	
	WebDriver driver;
	
	public RediffHomePagePF(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[@id='tabtable']//div[1]")
	WebElement tab1;
	
	@FindBy(xpath="//div[@id='tabtable']//div[2]")
	WebElement tab2;
	
	@FindBy(xpath="//div[@id='tabtable']//div[3]")
	WebElement tab3;
	
	@FindBy(id="srchquery_tbox")
	WebElement search;
	
	
	public WebElement topNewsTabab() {
		return tab1;
	}
	public WebElement latestNewsTab() {
		return tab2;
	}
	public WebElement foryouNewsTab() {
		return tab3;
	}
	
	public WebElement searchText() {
		
		return search;
	
	}
	/* Creating void method */
	public void refresh() {
		driver.navigate().refresh();
	}
}
