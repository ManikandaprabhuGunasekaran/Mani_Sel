package pages_cucumberIntegration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import lib.selenium.WebDriverServiceImpl;
import pages.MyViewPage;

public class Page_CreateLead1 extends WebDriverServiceImpl{
	@FindBy(id="createLeadForm_companyName")
	WebElement eleCmpyName;
	@FindBy(id="createLeadForm_firstName")
	WebElement eleFrstName;
	@FindBy(id="createLeadForm_lastName")
	WebElement eleLstName;
	@FindBy(id="createLeadForm_dataSourceId")
	WebElement eleSource_dd;
	@FindBy(id="createLeadForm_primaryPhoneNumber")
	WebElement elePhone;
	@FindBy(className="smallSubmit")
	WebElement eleCreatLead;

	//@DataProvider(name="www3")
	//@Test(dataProvider="www3",invocationCount=2)
	public Page_CreateLead1() {
		/*this.driver=driver;
		this.test=test;*/

		PageFactory.initElements(driver, this);
	}


	@And ("Create a lead with (.*)") 
	public Page_CreateLead1 typeCompanyName(String CompanyName) {
		type(eleCmpyName, CompanyName);
		return this;
	}
	
	@And ("FirstName (.*)") 
	public Page_CreateLead1 typeFNAME(String FNAME) {

		type(eleFrstName, FNAME);
		return this;

	}
	@And ("LastName (.*)")
	public Page_CreateLead1 typeLNAME(String LNAME) {

		type(eleLstName, LNAME);

		return this;

	}
	
	@And ("ClickCreateLead")
	public MyViewPage1 clickCreateLEad() {
	
		click(eleCreatLead);
		return new MyViewPage1();

	}
}













