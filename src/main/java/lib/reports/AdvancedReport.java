package lib.reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
public class AdvancedReport 
{
	public ExtentHtmlReporter html;
	public ExtentReports extent ;
	public ExtentTest testSuite , test;
	//@BeforeSuite
	public void startResult() {
		html = new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(html);
		html.loadXMLConfig("./src/main/resources/extent-config.xml");
	}
	//@BeforeClass
	public void startTestCase() {
		testSuite = extent.createTest("TC001_CreateLeat", "Create a new Lead in leaftaps");
	}	
	//@BeforeMethod
	public void beforeMethod1() {
		test = testSuite.createNode("Leads");
		test.assignCategory("smoke");
		test.assignAuthor("sarath");
	}
	//@AfterSuite
	public void endResult() {
		extent.flush();
	}
	public void reportSteps(String desc,String status) {
		try {
			MediaEntityModelProvider img = MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap1.jpg").build();
			if (status.equalsIgnoreCase("PASS")) {				
				test.pass(desc,img);
			} else if (status.equalsIgnoreCase("FAIL")) {				
				test.fail(desc,img);
				throw new RuntimeException();
			}else if (status.equalsIgnoreCase("warning")) {				
				test.warning(desc,img);
			}				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


}




