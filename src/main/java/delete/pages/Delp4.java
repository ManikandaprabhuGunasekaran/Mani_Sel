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

public class Delp4 extends WebDriverServiceImpl{
	
	
	
	public Delp4(EventFiringWebDriver driver, ExtentTest test) {
		this.driver=driver;
		this.test=test;

		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div/a[contains(text(),'Delete')]")
	WebElement eleDel;
	@FindBy(xpath="//a[contains(text(),'Find Leads')]")
	WebElement eleFindLeads2;
	@FindBy(xpath="//*[@name=\\\\\\\"id\\\\\\\"]")
	WebElement eleDelNAme;
	@FindBy(xpath="//button[contains(text(),'Find Leads')]")
	WebElement eleFndBtn;
	
	public Delp3 clickDel() {
		click(eleDel);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Delp3(driver, test);
			}
	

}
