package lib.selenium;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import data.reader.ReadExcel;

public class PreAndPost  extends WebDriverServiceImpl{
	public  String testCaseName,testDesc,nodeName,authorName,category,excelSheetName;
	 @BeforeSuite
	  public void beforeSuite() {
		 System.out.println("BeforeSuite");
		 startReport();
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("AfterSuite");
			
	  endResult();
	  }
	  

	@Parameters({"url","username","password"})
	 @BeforeMethod
	 /*(groups= {"Smoke","Sanity","Regression"})
	 */ public void beforeMethod(String url,String username,String password) {
		 //reports
		 startTestCase(testCaseName, testDesc);
		startTestModule(nodeName);
		test.assignAuthor(authorName);
		test.assignCategory(category);
		
		
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			webdriver = new ChromeDriver();
			
			driver = new EventFiringWebDriver(webdriver);
			driver.register(this);
			
			driver.manage().window().maximize();
			//"http://leaftaps.com/opentaps/control/login"
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			WebElement eleUserName = locateElement("id", "username");
			type(eleUserName, username);

			WebElement elePassword = locateElement("id", "password");
			type(elePassword, password);

			WebElement eleLogin = locateElement("class", "decorativeSubmit");
			click(eleLogin);

			WebElement eleCRM = locateElement("link", "CRM/SFA");
			click(eleCRM);

		
	  }
	 
	 
	
	  @AfterMethod
	  /*(groups= {"Smoke","Sanity","Regression"})
	  */public void afterMethod() {
		  closeActiveBrowser();
		  //driver.close();
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Start test case");
		 
	  }

	  @AfterClass
	  public void afterClass() {
	  }

	  @BeforeTest
	  public void beforeTest() {
	  }

	  @AfterTest
	  public void afterTest() {
	  }

	  @DataProvider(name="www3",indices= {0,1})
		
		
		public String[][] getData() throws IOException {
			ReadExcel b=new ReadExcel();
			String[][] data = b.readExcel(excelSheetName);
			
			return data;
	  }
	 


}
