package tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FixMyBugs {

@Test
public void main() throws InterruptedException {

	// launch the browser
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.myntra.com/");

	// Mouse Over on Men
	Actions builder = new Actions(driver);
	builder.moveToElement(driver.findElementByLinkText("Men")).perform();

	// Click on Jackets
	driver.findElementByXPath("//a[@href='/men-jackets']").click();


	// Find the count of Jackets
	String leftCount = 
			driver.findElementByXPath("//input[@value='Jackets']/following-sibling::span")
			.getText()
			.replaceAll("\\D", "");
	System.out.println(leftCount);


	// Click on Jackets and confirm the count is same
	driver.findElementByXPath("//label[text()='Jackets']").click();

	// Wait for some time
	Thread.sleep(5000);

	// Check the count
	String rightCount = 
			driver.findElementByXPath("//h1[text()='Mens Jackets']/following-sibling::span")
			.getText()
			.replaceAll("\\D", "");
	//System.out.println(rightCount.replaceAll("\\", replacement));

	// If both count matches, say success
	if(leftCount.equals(rightCount)) {
		System.out.println("The count matches on either case");
	}else {
		System.err.println("The count does not match");
	}

	// Click on Offers
	driver.findElementByXPath("//h4[text()='Offers']").click();

	// Find the costliest Jacket
	List<WebElement> productsPrice = driver.findElementsByXPath("//span[@class='product-discountedPrice']");
	List<String> onlyPrice = new ArrayList<String>();

	for (WebElement productPrice : productsPrice) {
		onlyPrice.add(productPrice.getText().replaceAll("//D", ""));
	}

	// Sort them 
	String max = Collections.max(onlyPrice);

	// Find the top one
	System.out.println(max);
	


	// Print Only Allen Solly Brand Minimum Price
	driver.findElementByXPath("//input[@value='Allen Solly']/following-sibling::div").click();

	// Find the costliest Jacket
	List<WebElement> allenSollyPrices = driver.findElementsByXPath("//span[@class='product-discountedPrice']");

	onlyPrice = new ArrayList<String>();

	WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//span[@class='product-discountedPrice']"), 44));
	for (WebElement productPrice : productsPrice) {
		wait.until(ExpectedConditions.invisibilityOf(driver.findElementByXPath("//span[@class='product-discountedPrice']")));
		Thread.sleep(1000);
		//driver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
		
		onlyPrice.add(productPrice.getText().replaceAll("//D", ""));
	}

	// Get the minimum Price 
	String min = Collections.min(onlyPrice);

	// Find the lowest priced Allen Solly
	System.out.println(min);


}

}