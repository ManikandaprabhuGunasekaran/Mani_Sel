package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class Activity1 extends WebDriverServiceImpl{

	@Test
	public void Main() {


		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);

		WebElement eleAccountTab = locateElement("Xpath","(//div[@class='x-panel-header']/a)[4]");
		click(eleAccountTab);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement eleCreateAccount = locateElement("link","Create Account");
		click(eleCreateAccount);

		WebElement eleAccountNAme = locateElement("Xpath","//input[@id='accountName']");
		type(eleAccountNAme, "ManiSolamen6");

		WebElement eleIndustry = locateElement("name","industryEnumId");
		selectDropDownUsingVisibleText(eleIndustry, "General Services");

		WebElement elePrefCurrency = locateElement("Xpath","//select[@id='currencyUomId']");
		selectDropDownUsingVisibleText(elePrefCurrency, "AFA - Afghani");

		WebElement eleSource = locateElement("id","dataSourceId");
		selectDropDownUsingVisibleText(eleSource, "Conference");

		WebElement eleMArkCamp = locateElement("id","marketingCampaignId");
		selectDropDownUsingVisibleText(eleMArkCamp, "Automobile");


		WebElement elePhoneNumber = locateElement("Xpath","//input[@id='primaryPhoneNumber']");
		type(elePhoneNumber, "9442780472");

		WebElement eleCity = locateElement("Xpath","//input[@id='generalCity']");
		type(eleCity, "Chennai");

		WebElement eleEmail = locateElement("Xpath","//input[@id='primaryEmail']");
		type(eleEmail, "mani_solamen@hotmail.com");

		WebElement eleCountry = locateElement("Xpath","//select[@id='generalCountryGeoId']");
		selectDropDownUsingVisibleText(eleCountry, "India");

		WebElement eleState = locateElement("Xpath","//select[@id='generalStateProvinceGeoId']");
		selectDropDownUsingVisibleText(eleState, "TAMILNADU");

		WebElement eleCreateAccountBtn = locateElement("Xpath","//input[@class='smallSubmit']");
		click(eleCreateAccountBtn);

		WebElement eleVerifyAccountId = locateElement("Xpath","(//tbody//td[2]/span)[1]");

		String LeadID=getText(eleVerifyAccountId);
		LeadID=LeadID.replaceAll("//D", "");
		System.out.println(LeadID);
		//verifyPartialText(eleVerifyAccountId, "Manisolamen");


		WebElement eleFindAccount = locateElement("Xpath","//a[contains(text(),'Find Accounts')]");
		click(eleFindAccount);

		WebElement eleAccountName = locateElement("Xpath","(//input[@name='accountName'])[2]\r\n");
		type(eleAccountName, "ManiSolamen6");

		/*WebElement eleAccountID = locateElement("Xpath","//input[@name='id']");
		type(eleAccountID, LeadID);
		getText(eleAccountID);
		 */
		WebElement eleFindAccountBTN = locateElement("Xpath","(//button[@class='x-btn-text'])[7]");
		click(eleFindAccountBTN);


		WebElement eleAccountVerify = locateElement("Xpath","(//*[@class='x-grid3-cell-inner x-grid3-col-groupName'])[1]");

		/*WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.textToBe(By.xpath("(//*[@class='x-grid3-cell-inner x-grid3-col-groupName'])[1]"), "Manisolamen6"));
*/
		//getText(eleAccountVerify);	
		verifyExactText(eleAccountVerify, "Manisolamen6");

		//	verifyExactText(eleAccountVerify, "Manisolamen6");




		WebDriverWait wc=new WebDriverWait(driver, 10);
		wc.until(ExpectedConditions.textToBe(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-groupName']/a)[1]"), "Allan"));
		String text = eleAccountVerify.getText();
		verifyExactText(eleAccountVerify, "Manisolamen6");


	}
}
