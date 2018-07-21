package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import lib.selenium.WebDriverServiceImpl;

public class MyViewPage extends WebDriverServiceImpl {
	@FindBy(id="viewLead_companyName_sp")
	WebElement eleVerifyCmpyName;
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleVerifyFirstName;
	@FindBy(id="viewLead_lastName_sp")
	WebElement eleVerifySecondName;
	
	public MyViewPage(EventFiringWebDriver driver,ExtentTest test) {
		this.driver=driver;
		this.test=test;
	
	

		PageFactory.initElements(driver, this);
	}
	
	    
			public MyViewPage VerifyCompanyName(String expectedText) {
				
				verifyPartialText(eleVerifyCmpyName, expectedText);
				return this;
				}
			
			
			public MyViewPage VerifyFirstName(String expectedText) {
				verifyExactText(eleVerifyFirstName, expectedText);
				return this;
				}
			
			
			public MyViewPage VerifyLastName(String expectedText) {
				verifyExactText(eleVerifySecondName, expectedText);
				return this;
				}
				
				
		}
	

		













