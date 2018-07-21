package delete.pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages_cucumberIntegration.MyHome1;

public class Del1 extends PreAndPost{
	@BeforeTest
	public void setValue() {
		testCaseName="TC_002_DeleteLead";
		testDesc="Delete a lead";
		nodeName="Leads";
		authorName="Manisolamen";
		category="Sanity";
		excelSheetName="DeleteLead";


	}
	static String text;
	//@DataProvider(name="www3")
	@Test(dataProvider="www3")
	public void deleteLead(String PhoneNumber) {
		new Delp1(driver, test).clickLead().clickFindLeads().typePhone().typePhoneNum(PhoneNumber)
		.clickFindLEad2().clickPhoneList().clickDel().clickeleFindLeads2().typeDelNAme().clickeleeleFndBtn();

			}}

