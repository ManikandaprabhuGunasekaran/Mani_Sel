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

public class M_CreateLead extends PreAndPost{

	@BeforeTest
	public void setValue() {
		testCaseName="TC_001_CreateLead";
		testDesc="Creates a lead";
		nodeName="Leads";
		authorName="Manisolamen";
		category="Smoke";
		excelSheetName="CreateLead";
		
		
	}
	//@DataProvider(name="www3")
	@Test(dataProvider="www3",invocationCount=2)
	public void createLead(String CompanyName,String FNAME,String LNAME,String PhoneNumber) {


		WebElement eleCreateLead = locateElement("link", "Create Lead");
		click(eleCreateLead);

		WebElement eleCmpyName = locateElement("id", "createLeadForm_companyName");
		type(eleCmpyName, CompanyName);

		WebElement eleFrstName = locateElement("id", "createLeadForm_firstName");
		type(eleFrstName, FNAME);

		WebElement eleLstName = locateElement("id", "createLeadForm_lastName");
		type(eleLstName, LNAME);


		WebElement eleSource_dd = locateElement("id", "createLeadForm_dataSourceId");
		selectDropDownUsingValue(eleSource_dd, "LEAD_EXISTCUST");

		/*WebElement marketingDropdown = locateElement("id","createLeadForm_marketingCampaignId");
		selectDropDownUsingValue(marketingDropdown, "9002");
		 */

		WebElement elePhone = locateElement("id", "createLeadForm_primaryPhoneNumber");
		type(elePhone, PhoneNumber);



		WebElement eleCreatLead = locateElement("class", "smallSubmit");
		click(eleCreatLead);

		//closeAllBrowsers();


	}
		
		/*String[][] data=new String[2][4];
		data[0][0]="T1";
		data[0][1]="sarath";
		data[0][2]="M";
		data[0][3]="6484654666";
		
		data[1][0]="T2";
		data[1][1]="ram";
		data[1][2]="krishna";
		data[1][3]="6484345674";


		return data;
*/	}








