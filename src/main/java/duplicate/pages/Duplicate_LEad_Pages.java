package duplicate.pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages_cucumberIntegration.MyHome1;

public class Duplicate_LEad_Pages extends PreAndPost{
	@BeforeTest
	public void setValue() {
		testCaseName="TC_003_DuplicateLead";
		testDesc="Duplicate a lead";
		nodeName="Leads";
		authorName="Manisolamen";
		category="Sanity";
		excelSheetName="DuplicateLead";


	}
	//static String text;
	//@DataProvider(name="www3")
	@Test(dataProvider="www3")
	public void Duplicate_LEad_Pages(String Email) {
		new DuplicatePage1(driver, test).clickLead().clickFindLeads().clickLeadInTable().typeEmail(Email)
		.clickLt().clickDuplicateLEad().clickCreateLEad();

			}}

