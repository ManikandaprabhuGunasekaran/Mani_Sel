
package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Create_LeadSteps {


	ChromeDriver driver;

	@Given ("Launch the Browser")
	public void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();

	}
	@And ("Load the LeafTaps Site")

	public void loadURL()
	{
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	@And ("Maximize the browser and Set time out for loading the url")

	public void maxBrowser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	@Given ("Login into the site and go to crmSfa with username as (.*)")

	public void userName(String uName) {

		driver.findElementById("username").sendKeys(uName);
		}
	
	@And ("password as (.*)")
	
	public void Password(String pswd){
		driver.findElementById("password").sendKeys(pswd);

		driver.findElementByClassName("decorativeSubmit").click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElementByLinkText("CRM/SFA").click();

	}
	
	/*this is not a proper practise multiple input can 
	be allowed by java but using like may impact the diffrent test cases combinations*/
	@When ("Create a lead with (.*) and (.*) and (.*)")

	public void createLead(String compname,String fName,String lName)
	{
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys(compname);
		driver.findElementById("createLeadForm_firstName").sendKeys(fName);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		driver.findElementByClassName("smallSubmit").click();
	}

	@When ("Created Lead successfully")
	public void verifyLeadPass() {


		System.out.println("Lead Created Successfully");
	}
	@But ("Create Lead Failed")
	public void verifyLeadFailure() {


		System.out.println("Lead Creation Failure");
	}

}
