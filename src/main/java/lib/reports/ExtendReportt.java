package lib.reports;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtendReportt {
	public static void main(String[]ags) throws IOException {
		ExtentHtmlReporter html=new ExtentHtmlReporter("./report/result1.html");
		html.setAppendExisting(true);
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		html.loadXMLConfig("./src/main/resources/extent-config.xml");
		
		ExtentTest testSuite=extent.createTest("TC001_CreateLEad","Create a new Lead");
		ExtentTest test = testSuite.createNode("Leads");
		test.assignAuthor("Mani");
		test.assignCategory("Smoke");
		test.pass("The data demosalesmanager is entered Successfully",
				MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/snap1.jpg").build());
		test.fail("The data crmsfa is entered succesfully");
		test.pass("The login button is clicked successfully");
		extent.flush();
	}
}







