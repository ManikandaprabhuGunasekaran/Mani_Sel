package duplicate.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import delete.pages.Delp2;
import lib.listeners.WebDriverListener;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class DuplicatePage4 extends WebDriverServiceImpl {
		@FindBy(xpath="//a[contains(text(),'Leads')]")
		WebElement eleLead;
		@FindBy(xpath="//a[contains(text(),'Find Leads')]")
		WebElement eleFNDLeads;
		@FindBy(xpath="(//span[@class='x-tab-strip-text '])[3]")
		WebElement eleC;
		@FindBy(xpath="//input[@name='emailAddress']")
		WebElement eleEmail;
		@FindBy(xpath="//td/div/a[@class='linktext']")
		WebElement eleLt;
		@FindBy(linkText="Duplicate Lead")
		WebElement eleDupLead;
		@FindBy(linkText="Create Lead")
		WebElement eleCreateLEad;
		
		public DuplicatePage4(EventFiringWebDriver driver, ExtentTest test) {
			this.driver=driver;
			this.test=test;

			PageFactory.initElements(driver, this);
		}
				public DuplicatePage4 clickDuplicateLEad() {
			click(eleDupLead);
			driver.getTitle();
			return this ;
			}
		public DuplicatePage4 clickCreateLEad() {
			click(eleCreateLEad);
			return this ;
		//	closeAllBrowsers();

			}

			

}
