package edit.pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class EditLead extends PreAndPost{

	@Test(dataProvider="TCS")
	public void createLead(String fName,String compName) throws InterruptedException  {

		new MyHomePage(driver, test).clickLead().findLead().typeLeadName(fName).clickFindLead().clickLeadid().clickEdit()
		.editComp(compName).UpdateComp().verifyEdit(compName);
		
	}

	@BeforeTest
	public void setValue() {
		
		testCaseName="TC_004_EditLead";
		testDesc="Edit a lead";
		nodeName="Leads";
		authorName="Manisolamen";
		category="Smoke";
		excelSheetName="EditLead";
		
	}


}





