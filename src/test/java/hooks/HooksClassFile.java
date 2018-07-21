package hooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import lib.selenium.WebDriverServiceImpl;

public class HooksClassFile extends WebDriverServiceImpl {


	@Before
	public void beforeScenario(Scenario sc) {
		startReport();

		startTestCase(sc.getId(), sc.getName());
		startTestModule("leads");
		test.assignAuthor("Mani");
		test.assignCategory("Smoke");


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		webdriver = new ChromeDriver();
		driver = new EventFiringWebDriver(webdriver);
		driver.register(this);				
		driver.manage().window().maximize();
		//"http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement eleUserName = locateElement("id", "username");
		type(eleUserName, "DemoSalesManager");

		WebElement elePassword = locateElement("id", "password");
		type(elePassword, "crmsfa");

		WebElement eleLogin = locateElement("class", "decorativeSubmit");
		click(eleLogin);

		WebElement eleCRM = locateElement("link", "CRM/SFA");
		click(eleCRM);
	}

	@After
	public void afterScenario() {
		closeActiveBrowser();
		endResult();


	}
}
