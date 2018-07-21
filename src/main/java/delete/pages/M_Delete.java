package delete.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class M_Delete extends PreAndPost{
	@BeforeTest
	public void setValue() {
		testCaseName="TC_004_DeleteLead";
		testDesc="Creates a lead";
		nodeName="Leads";
		authorName="Manisolamen";
		category="Smoke";
		excelSheetName="DeleteLead";
		
		
	}
	
	@Test(dataProvider="www3",invocationCount=2)
	//@Test(groups="Sanity")
	public void DeleteLead(String PhoneNumber,String Id) {

		WebElement eleLeads = locateElement("Xpath", "//a[contains(text(),'Leads')]");
		click(eleLeads);

		WebElement eleFindLeads = locateElement("Xpath", "//a[contains(text(),'Find Leads')]");
		click(eleFindLeads);

		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

		WebElement elePhone = locateElement("Xpath", "//span[contains(text(),'Phone')]");
		click(elePhone);


		WebElement elePhoneNum = locateElement("Xpath", "//input[@name='phoneNumber']");
		type(elePhoneNum, PhoneNumber);

		WebElement eleFindLeads1 = locateElement("Xpath", "//a[contains(text(),'Find Leads')]");
		click(eleFindLeads1);	
		/*	driver.findElementByXPath("//button[contains(text(),'Find Leads')]").click();
		 */	
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement elePhoneList = locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		String text = getText(elePhoneList);
		click(elePhoneList);

		WebElement eleDel = locateElement("Xpath", "//div/a[contains(text(),'Delete')]");
		click(eleDel);

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement eleFindLeads2 = locateElement("Xpath", "//a[contains(text(),'Find Leads')]");
		click(eleFindLeads2);

		/*driver.findElementByXPath("//a[contains(text(),'Find Leads')]").click();
		 */
		WebElement eleDelNAme = locateElement("Xpath", "//*[@name=\\\"id\\\"]");
		type(eleDelNAme, text);
		WebElement eleFndBtn = locateElement("Xpath", "//button[contains(text(),'Find Leads')]");
		click(eleFndBtn);

		WebElement eleNorecord = locateElement("Xpath", "//div[contains(text(),'No records to display')]");
		//	click(eleFndBtn);


		/*driver.findElementsByXPath("//div[contains(text(),'No records to display')]")

	if(driver.findElementsByXPath("//div[contains(text(),'No records to display')]").size()!=0)
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}}
		 */

	}


}
