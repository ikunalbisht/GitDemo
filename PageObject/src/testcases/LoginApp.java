package testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.RediffHomePagePF;
import objectrepository.RediffLoginPage;
import objectrepository.RediffLoginPageObjectFactoryStyle;

public class LoginApp {

	@Test
	public void login() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pickle\\Downloads\\Selenium Jar Dload\\BrowserFile\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		RediffLoginPage objLoginPage = new RediffLoginPage(driver);
		
		objLoginPage.enterUsername().sendKeys("KunalBisht");
		objLoginPage.enterPassword().sendKeys("password");
		objLoginPage.submit().click();
		System.out.println(objLoginPage.errorMsg().getText());
		objLoginPage.home().click();
		
		RediffHomePagePF objHomePage = new RediffHomePagePF(driver);
		
		objHomePage.topNewsTabab().click();
		objHomePage.latestNewsTab().click();
		objHomePage.foryouNewsTab().click();	
		objHomePage.searchText().sendKeys("World News",Keys.ENTER);
		driver.navigate().back();
		
		objHomePage.refresh();
		driver.close();
	
		/* For page object factory style */
//		RediffLoginPageObjectFactoryStyle objPageFactory = new RediffLoginPageObjectFactoryStyle(driver);
//		
//		objPageFactory.username().sendKeys("aaqqwweerr");
//		objPageFactory.inputPassword().sendKeys("qqqqqqqqqq");
//		objPageFactory.clickSignIn().click();	
	}


}
