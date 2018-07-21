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

public class Delp3 extends WebDriverServiceImpl{
	
	
	@FindBy(xpath="//span[contains(text(),'Phone')]")
	WebElement elePhone;
	@FindBy(xpath="//input[@name='phoneNumber']")
	WebElement elePhoneNum;
	@FindBy(xpath="//a[contains(text(),'Find Leads')]")
	WebElement eleFindLeads1;
	@FindBy(xpath="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	WebElement elePhoneList;
	
	@FindBy(xpath="//a[contains(text(),'Find Leads')]")
	WebElement eleFindLeads2;
	@FindBy(xpath="//*[@name=\\\\\\\"id\\\\\\\"]")
	WebElement eleDelNAme;
	@FindBy(xpath="//button[contains(text(),'Find Leads')]")
	WebElement eleFndBtn;
	
	
	 static String text ;	
	public Delp3(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}
	
	public Delp3 typePhone() {
		click(elePhone);
		return this;
		}
	
	public Delp3 typePhoneNum(String PhoneNumber) {
		type(elePhoneNum, PhoneNumber);
		return this;
	}
	
	public Delp3 clickFindLEad2() {
		click(eleFindLeads1);
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
		
	}
	
	
	
	public Delp4 clickPhoneList() {
		  text = getText(elePhoneList);
		
		click(elePhoneList);
		return new Delp4(driver,test);
	}
	public Delp3 clickeleFindLeads2() {
		click(eleFindLeads2);
		return this;
	}
	public Delp3 typeDelNAme() {
		type(eleDelNAme,text);
		return this;
	}
	public Delp3 clickeleeleFndBtn() {
		click(eleFndBtn);
		return this;
	}

	
}
