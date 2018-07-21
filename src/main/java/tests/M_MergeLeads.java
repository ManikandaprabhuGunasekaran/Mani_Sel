package tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class M_MergeLeads extends PreAndPost{
	@BeforeTest
	public void setValue() {
		testCaseName="TC_003_MergeLead";
		testDesc="Merge a lead";
		nodeName="Leads";
		authorName="Manisolamen";
		category="Smoke";
		excelSheetName="MergeLead";
		
		
	}
	
	@Test(dataProvider="www3",invocationCount=2)
	/*dependsOnGroups="Sanity"*/
	public void MergeLead(String FirstId,String SecondId) {
		
		WebElement eleLeads = locateElement("link", "Leads");
		click(eleLeads);

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement eleMergeLeads = locateElement("link", "Merge Leads");
		click(eleMergeLeads);

		WebElement eleMergeimg = locateElement("Xpath", "(//img[@src='/images/fieldlookup.gif'])[1]");
		click(eleMergeimg);

		switchToWindow(1);
		WebElement eleName = locateElement("Xpath", "//input[@name='id']");
		type(eleName,FirstId);

		WebElement eleButton = locateElement("Xpath", "(//em/button[@class='x-btn-text'])[1]");
		click(eleButton);

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement eleList = locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		click(eleList);


		switchToWindow(0);
		WebElement eleIMG2 = locateElement("Xpath", "(//img[@src='/images/fieldlookup.gif'])[2]");
		click(eleIMG2);
		switchToWindow(1);

		/*
		Set<String> windowswitch1 = driver.getWindowHandles();
		List<String> w2=new ArrayList<String>();
		w2.addAll(windowswitch1);


		driver.switchTo().window(w2.get(1));
		 */		WebElement value = locateElement("Xpath", "//input[@name='id']");
		 type(value, SecondId);
		 /*driver.findElementByClassName(" x-form-text x-form-field ").sendKeys("10098");
		  */
		 WebElement elebtn = locateElement("Xpath", "(//button[@class='x-btn-text'])[1]");
		 click(elebtn);
		 try {
			 Thread.sleep(200);
		 } catch (InterruptedException e) {
			 // TODO Auto-generated catch block
			 e.printStackTrace();
		 }
		 WebElement elelk = locateElement("Xpath", "(//a[@class='linktext'])[1]");
		 click(elelk);


		 switchToWindow(0);

		 WebElement eleMErge = locateElement("link", "Merge");
		 click(eleMErge);
		 driver.switchTo().alert().accept();
		 driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		 // driver.findElementByLinkText("Find Leads").click();
		 /* WebElement eleFnd = locateElement("link", "Find Leads");
		  */	click(elebtn);
		  WebElement eleto = locateElement("Xpath", "//input[@name='id']");
		  type(eleto,FirstId);
		  WebElement elefndLEads = locateElement("link", "Find Leads");
		  click(elefndLEads);



	}
}
