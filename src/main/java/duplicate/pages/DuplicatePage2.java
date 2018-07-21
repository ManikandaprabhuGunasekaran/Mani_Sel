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

public class DuplicatePage2 extends WebDriverServiceImpl {
		@FindBy(xpath="//a[contains(text(),'Find Leads')]")
		WebElement eleFNDLeads;
		
		public DuplicatePage2(EventFiringWebDriver driver, ExtentTest test) {
			this.driver=driver;
			this.test=test;

			PageFactory.initElements(driver, this);
		}
		
		public DuplicatePage3 clickFindLeads() {
			click(eleFNDLeads);
			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
			return new DuplicatePage3(driver,test);
			}

		}
