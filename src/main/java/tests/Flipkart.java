package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import lib.selenium.WebDriverServiceImpl;

public class Flipkart extends WebDriverServiceImpl{

	@Test
	public void Main() {
		WebElement elePopupClose = locateElement("Xpath", "//button[@class='_2AkmmA _29YdH8']");
		click(elePopupClose);

		WebElement eleTV = locateElement("Xpath", "//li/a[@title='TVs & Appliances']/span");
		WebElement eleSamsung = locateElement("Xpath", "(//a[@title='Samsung'])[2]");
		Actions builder =new Actions(driver);
		builder.moveToElement(eleTV).pause(3000).click(eleSamsung).perform();

		WebElement eleMin = locateElement("class", "fPjUPw");
		selectDropDownUsingVisibleText(eleMin, "₹25000");

		WebElement eleMax = locateElement("Xpath", "(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingVisibleText(eleMax, "₹60000");

		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement eleScreenSize = locateElement("Xpath", "//div[text()='Screen Size']");
		/*WebDriverWait ec=new WebDriverWait(driver, 10);
		ec.until(ExpectedConditions.textToBe(By.xpath("//div[text()='Screen Size']"), "SCREEN SIZE"));
		pageDown();
		*/
		clickWithJS(eleScreenSize);
		
		/*WebDriverWait ec=new WebDriverWait(driver, 10);
		ec.until(ExpectedConditions.textToBe(By.xpath("//div[text()='Screen Size']"), "SCREEN SIZE"));
		*/
		WebElement eleScreenSizeSelection = locateElement("Xpath", "//div[text()='48 - 55']");
		clickWithJS(eleScreenSizeSelection);
		
		WebElement ele1St = locateElement("Xpath", "(//a[@class='_31qSD5'])[1]");
		clickWithJS(ele1St);
		
		switchToWindow(1);
		
		WebElement eletv1 = locateElement("class", "_1vC4OE _3qQ9m1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = getText(eletv1);
		text.split("₹");
		
		switchToWindow(0);
		WebElement eletv = locateElement("Xpath", "(//div[@class='_1vC4OE _2rQ-NK'])[1]");
		String text1 = getText(eletv);
		text.split("₹");
		
		if(text==text1) {
			
			System.out.println("Value is same");
			
		}
		else {
			
			System.out.println("different");
		}
		
		
		
	}
	}
