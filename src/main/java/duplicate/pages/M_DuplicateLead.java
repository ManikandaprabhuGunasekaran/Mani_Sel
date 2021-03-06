package duplicate.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class M_DuplicateLead extends PreAndPost {
	@BeforeTest
	public void setValue() {
		testCaseName="TC_001_CreateLead";
		testDesc="Creates a lead";
		nodeName="Leads";
		authorName="Manisolamen";
		category="Smoke";
		excelSheetName="DuplicateLead";
		
		
	}
	
	@Test(dataProvider="www3",invocationCount=2)
	public void DuplicateLead(String email) {

		
		WebElement eleLead = locateElement("Xpath", "//a[contains(text(),'Leads')]");
		click(eleLead);

		WebElement eleFNDLeads = locateElement("Xpath", "//a[contains(text(),'Find Leads')]");
		click(eleFNDLeads);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		WebElement eleC = locateElement("Xpath", "(//span[@class='x-tab-strip-text '])[3]");
		click(eleC);

		WebElement eleEmail = locateElement("Xpath", "//input[@name='emailAddress']");
		type(eleEmail, email);

		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleLt = locateElement("Xpath", "//td/div/a[@class='linktext']");
		click(eleLt);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement eleDupLead = locateElement("link", "Duplicate Lead");
		click(eleDupLead);
		driver.getTitle();
		WebElement eleCreateLEad = locateElement("link", "Create Lead");
		click(eleCreateLEad);
		closeAllBrowsers();

	}
}
