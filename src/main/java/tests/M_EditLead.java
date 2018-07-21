package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class M_EditLead extends PreAndPost{
	@BeforeTest
	public void setValue() {
		testCaseName="TC_002_EditLead";
		testDesc="Edit a lead";
		nodeName="Leads";
		authorName="Mani";
		category="Smoke";
		excelSheetName="EditLead";
		
		
	}
	

	//@Test(groups="Smoke")
	@Test(dataProvider="www3",invocationCount=2)
	public void editLead(String CompanyName,String FNAME) {
		
		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);
		try {

			Thread.sleep(200);
		} 
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		WebElement eleFindLEads = locateElement("Xpath", "//a[text()='Find Leads']");
		click(eleFindLEads);


		WebElement eleFN = locateElement("Xpath", "(//input[@name='firstName'])[3]");
		type(eleFN, CompanyName);

		WebElement eleFindleadsButton = locateElement("Xpath","(//td[@class='x-btn-center'])[7]");
		click(eleFindleadsButton);

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleLEAD = locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		click(eleLEAD);

		WebElement eleEditD = locateElement("Xpath", "//a[text()='Edit']");
		click(eleEditD);
		WebElement eleLeaD = locateElement("Xpath", "//input[@id='updateLeadForm_companyName']");
		type(eleLeaD, FNAME);
		WebElement eleSubmitButton = locateElement("Xpath", "(//input[@name='submitButton'])[1]");
		click(eleSubmitButton);

		WebElement eleCompanyName = locateElement("Xpath", "//span[@id='viewLead_companyName_sp']");
		String text = getText(eleCompanyName);

		System.out.println(text);



		closeActiveBrowser();
	}

}
