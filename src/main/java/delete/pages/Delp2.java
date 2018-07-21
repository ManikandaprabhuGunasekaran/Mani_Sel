package delete.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.listeners.WebDriverListener;
import lib.selenium.WebDriverServiceImpl;
import pages_cucumberIntegration.Page_CreateLead1;

public class Delp2 extends WebDriverServiceImpl{
	
	
	@FindBy(xpath="//a[contains(text(),'Find Leads')]")
	WebElement eleFindLeads;
	
	
	
	public Delp2(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}
	public Delp3 clickFindLeads() {
		click(eleFindLeads);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		return new Delp3(driver, test);
		}
	
	
}
