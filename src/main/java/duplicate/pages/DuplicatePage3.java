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

public class DuplicatePage3 extends WebDriverServiceImpl {
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
		
		public DuplicatePage3(EventFiringWebDriver driver, ExtentTest test) {
			this.driver=driver;
			this.test=test;

			PageFactory.initElements(driver, this);
		}
				public DuplicatePage3 clickLeadInTable() {
			click(eleC);
			return this ;
			}

		public DuplicatePage3 typeEmail(String Email) {
			
			type(eleEmail, Email);

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return this ;
			}

		
		
		public DuplicatePage4 clickLt() {
			click(eleLt);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return new DuplicatePage4(driver, test) ;
			}

	/*	public DuplicatePage3 clickDuplicateLEad() {
			click(eleDupLead);
			driver.getTitle();
			return this ;
			}
		public DuplicatePage3 clickCreateLEad() {
			click(eleCreateLEad);
			return this ;
		//	closeAllBrowsers();

			}
*/
			

}
