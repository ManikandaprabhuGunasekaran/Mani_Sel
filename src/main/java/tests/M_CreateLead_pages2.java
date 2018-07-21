package tests;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.reader.ReadExcel;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;
import pages.MyHome;
import pages_cucumberIntegration.MyHome1;

public class M_CreateLead_pages2 extends PreAndPost{

	@BeforeTest
	public void setValue() {
		testCaseName="TC_002_CreateLead";
		testDesc="Creates a lead";
		nodeName="Leads";
		authorName="Manisolamen";
		category="Smoke";
		excelSheetName="CreateLead";
		
		
	}
	//@DataProvider(name="www3")
	@Test(dataProvider="www3",invocationCount=2)
	public void createLead(String CompanyName,String FNAME,String LNAME,String Value,String PhoneNumber,String VerifyCompanyName,String VerifyFNAME,String VerifyLNAME) {

		new MyHome(driver, test).clickLead().clickCreateLead()
		.typeCompanyName(CompanyName).typeFNAME(FNAME).typeLNAME(LNAME).drpdownValue(Value).typePhoneNumber(PhoneNumber)
		.clickCreateLEad()
		.VerifyCompanyName(VerifyCompanyName).VerifyFirstName(VerifyFNAME).VerifyLastName(VerifyLNAME);
	}}







