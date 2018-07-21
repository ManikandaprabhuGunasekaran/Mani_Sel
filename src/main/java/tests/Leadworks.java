package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class Leadworks extends PreAndPost{
	

	@Test(invocationCount=3)
	public void createLead() {

		WebElement eleUserName = locateElement("id", "username1");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);

		WebElement eleCmpyName = locateElement("id", "createLeadForm_companyName");
		type(eleCmpyName, "SG");

		WebElement eleFrstName = locateElement("id", "createLeadForm_firstName");
		type(eleFrstName, "Player1");

		WebElement eleLstName = locateElement("id", "createLeadForm_lastName");
		type(eleLstName, "Gamer");
		

		WebElement eleSource_dd = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingValue(eleSource_dd, "LEAD_EXISTCUST");
		
		/*WebElement marketingDropdown = locateElement("id","createLeadForm_marketingCampaignId");
		selectDropDownUsingValue(marketingDropdown, "9002");
		*/
		
		
		
		WebElement eleCreatLead = locateElement("class", "smallSubmit");
		click(eleCreatLead);

		//closeAllBrowsers();
	
		
			}
	
	//(dependsOnMethods={"tests.Leadworks.createLead"})
	@Test(dependsOnMethods={"tests.Leadworks.createLead"},alwaysRun=true)
	public void editLead() {
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

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
		type(eleFN, "Mani");

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
		type(eleLeaD, "TL");
		WebElement eleSubmitButton = locateElement("Xpath", "(//input[@name='submitButton'])[1]");
		click(eleSubmitButton);

		WebElement eleCompanyName = locateElement("Xpath", "//span[@id='viewLead_companyName_sp']");
		String text = getText(eleCompanyName);

		System.out.println(text);
		


		//closeActiveBrowser();
	}

}




