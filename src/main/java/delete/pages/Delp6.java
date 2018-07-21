package delete.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import lib.listeners.WebDriverListener;
import lib.selenium.WebDriverServiceImpl;
import pages_cucumberIntegration.Page_CreateLead1;

public class Delp6 extends WebDriverServiceImpl{
	
	
	@FindBy(xpath="//a[contains(text(),'Leads')]")
	WebElement eleLeads;
	@FindBy(xpath="//a[contains(text(),'Find Leads')]")
	WebElement eleFindLeads;
	@FindBy(xpath="//span[contains(text(),'Phone')]")
	WebElement elePhone;
	@FindBy(xpath="//input[@name='phoneNumber']")
	WebElement elePhoneNum;
	@FindBy(xpath="//a[contains(text(),'Find Leads')]")
	WebElement eleFindLeads1;
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement elePhoneList;
	
	
	
	
	public Delp6(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}
	public Delp6 clickLead() {
		click(eleLeads);
		return this;
		}
	public Delp6 clickFindLeads() {
		click(eleFindLeads);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		return this;
		}
	
	public Delp6 typePhone() {
		click(elePhone);
		return this;
		}
	
	public Delp6 typePhoneNum(String PhoneNumber) {
		type(elePhoneNum, PhoneNumber);
		return this;
	}
	
	public Delp6 clickFindLEad2() {
		click(eleFindLeads1);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
		
	}
	
	
	
	public Delp6 clickPhoneList() {
		String text = getText(elePhoneList);
		
		click(elePhoneList);
		return typeDelNAme(text);
	}
	
		
	@FindBy(xpath="//div/a[contains(text(),'Delete')]")
	WebElement eleDel;
	@FindBy(xpath="//a[contains(text(),'Find Leads')]")
	WebElement eleFindLeads2;
	@FindBy(xpath="//*[@name=\\\\\\\"id\\\\\\\"]")
	WebElement eleDelNAme;
	@FindBy(xpath="//button[contains(text(),'Find Leads')]")
	WebElement eleFndBtn;
	
	public Delp6 clickDel() {
		click(eleDel);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		return this;
	}
	public Delp6 clickeleFindLeads2() {
		click(eleFindLeads2);
		return this;
	}
	public Delp6 typeDelNAme(String text) {
		type(eleDelNAme,text);
		return this;
	}
	public Delp6 clickeleeleFndBtn() {
		click(eleFndBtn);
		return this;
	}
	

}
