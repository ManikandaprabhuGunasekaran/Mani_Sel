package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class DeleteLead extends PreAndPost{

	@Test(groups="Sanity")
	public void deleteLead() throws InterruptedException {

		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);


		WebElement eleLead= locateElement("link", "Leads");
		click(eleLead);

		Thread.sleep(1000);

		WebElement eleFindLead= locateElement("link", "Find Leads");
		click(eleFindLead);

		Thread.sleep(2000);

		WebElement elePhone= locateElement("xpath", "(//a[@class='x-tab-right'])[2]");
		click(elePhone);

		WebElement elePhonefield= locateElement("xpath", "(//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder'])[14]/input");
		type(elePhonefield,"1234567890");

		WebElement elePhFindLead= locateElement("xpath", "//button[text()='Find Leads']");
		click(elePhFindLead);

		WebElement eleLeadIDtxt= locateElement("xpath", "(//td//a[@class='linktext'])[1]");
		String leadID = getText(eleLeadIDtxt);
		System.out.println(leadID);

		Thread.sleep(1000);

		WebElement eleLeadIDclick= locateElement("xpath", "(//td//a[@class='linktext'])[1]");
		click(eleLeadIDclick);
		
		WebElement eleDelete = locateElement("class", "subMenuButtonDangerous");
		click(eleDelete);
		
		Thread.sleep(1000);
		
		WebElement eleFindLead1= locateElement("link", "Find Leads");
		click(eleFindLead1);
		
		WebElement eleLeadIDenter= locateElement("xpath", "(//label[text()='Lead ID:']/following::input)[1]");
		type(eleLeadIDenter,leadID);
        click(eleLeadIDenter);
        
    	WebElement eleFindLead2= locateElement("link", "Find Leads");
		click(eleFindLead2);
        
		WebElement eleFinderror= locateElement("class", "x-paging-info");
		//VerifyErrorMsg(eleFinderror, "No records to display");
		
		closeActiveBrowser();

	}


}




