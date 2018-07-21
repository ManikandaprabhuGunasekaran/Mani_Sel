package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;

public class CreateLead extends PreAndPost {

	@Test(groups="Smoke")
	public void createLead()  {
		
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
		
		WebElement eleComp_Name = locateElement("id", "createLeadForm_companyName");
		type(eleComp_Name, "Avengers");
		
		WebElement eleFirst_Name = locateElement("id", "createLeadForm_firstName");
		type(eleFirst_Name, "Steve");
		
		WebElement eleLast_Name = locateElement("id", "createLeadForm_lastName");
		type(eleLast_Name, "Rogers");
		
		WebElement eleSource_dd = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingVisibleText(eleSource_dd, "Cold Call");
		
		WebElement eleCreate = locateElement("class", "smallSubmit");
		click(eleCreate);
		
		
	}
	
	
}




