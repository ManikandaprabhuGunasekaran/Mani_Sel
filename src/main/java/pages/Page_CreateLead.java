package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.selenium.WebDriverServiceImpl;
import pages_cucumberIntegration.MyViewPage1;

public class Page_CreateLead extends WebDriverServiceImpl{
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
	public Page_CreateLead(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}

	public Page_CreateLead typeCompanyName(String CompanyName) {
		type(eleCmpyName, CompanyName);
		return this;
	}
	public Page_CreateLead typeFNAME(String FNAME) {

		type(eleFrstName, FNAME);
		return this;

	}
	public Page_CreateLead typeLNAME(String LNAME) {

		type(eleLstName, LNAME);

		return this;

	}
	public Page_CreateLead drpdownValue(String Value) {
		//LEAD_EXISTCUST
		selectDropDownUsingValue(eleSource_dd, Value);
		return this;

	}
	public Page_CreateLead typePhoneNumber(String PhoneNumber) {

		type(elePhone, PhoneNumber);
		return this;

	}
	public MyViewPage clickCreateLEad() {
		String leadid="huh";
		click(eleCreatLead);
		return new MyViewPage(driver,test);

	}
}













