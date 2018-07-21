package pages_cucumberIntegration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import lib.selenium.WebDriverServiceImpl;

public class MyViewPage1 extends WebDriverServiceImpl {
	@FindBy(id="viewLead_companyName_sp")
	WebElement eleVerifyCmpyName;
	@FindBy(id="viewLead_firstName_sp")
	WebElement eleVerifyFirstName;
	@FindBy(id="viewLead_lastName_sp")
	WebElement eleVerifySecondName;

	public MyViewPage1(/*EventFiringWebDriver driver, ExtentTest test,String leadid*/) {
		/*this.driver=driver;
		this.test=test;
		 */
		//System.out.println(leadid);

		PageFactory.initElements(driver, this);
	}
	@Then ("Verify CompanyName (.*)")


	public MyViewPage1 VerifyCompanyName(String expectedText) {

		verifyPartialText(eleVerifyCmpyName, expectedText);
		return this;
	}
	@And ("Verify FirstName (.*)")
	public MyViewPage1 VerifyFirstName(String expectedText) {
		verifyExactText(eleVerifyFirstName, expectedText);
		return this;
	}
	@And ("Verify LastName (.*)")
	public MyViewPage1 VerifyLastName(String expectedText) {
		verifyExactText(eleVerifySecondName, expectedText);
		return this;
	}

	/*
			verifyExactText(eleVerifyCmpyName, expectedText);
			verifyExactText(eleVerifyFirstName, expectedText);
			verifyExactText(eleVerifySecondName, expectedText);
	 */			
}
















