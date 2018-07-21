package lib.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import lib.listeners.WebDriverListener;

public class WebDriverServiceImpl extends WebDriverListener implements WebDriverService{

	public WebElement locateElement(String locator, String locValue) {

		try {
			switch (locator) {
			case "id": return driver.findElement(By.id(locValue));

			case "class": return driver.findElement(By.className(locValue));

			case "link" : return driver.findElement(By.linkText(locValue));

			case "Tag" : return driver.findElement(By.tagName(locValue));

			case "name" : return driver.findElement(By.name(locValue));

			case "plink" : return driver.findElement(By.partialLinkText(locValue));

			case "css" : return driver.findElement(By.cssSelector(locValue));

			case "Xpath":return driver.findElement(By.xpath(locValue));

			default:
				break;
			}
		} catch (NoSuchElementException e ) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new RuntimeException("Element Not found");

		}
		catch (StaleElementReferenceException e ) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new RuntimeException("Element Not found in dom");

		}

		return null;
	}

	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
		} catch (InvalidElementStateException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element "+ele+"is not ready for typing");
			throw new RuntimeException(" Unable to send keys to the Element");
		}		
	}

	public void clickWithJS(WebElement ele) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			driver.executeScript("arguments[0].click();", ele);
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The Element "+ele+"is not clickable");
			throw new RuntimeException(" Unable to click Element");

		}		


	}
	public void click(WebElement ele) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele)).click();
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The Element "+ele+"is not clickable");
			throw new RuntimeException(" Unable to click Element");

		}		


	}
	public void actionsMouseOver(WebElement ele) {
		Actions builder=new Actions(driver);

		builder.moveToElement(ele);
	}
	public void pageDown() {
		driver.getKeyboard().sendKeys(Keys.PAGE_DOWN);
	}

	public String getText(WebElement ele) {
		// TODO Auto-generated method stub
		String text = ele.getText();
		System.err.println(text);
		return text ;
		//System.out.println(text);
	}

	public void selectDropDownUsingVisibleText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select s=new Select(ele);
			s.selectByVisibleText(value);
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The Element "+ele+"is not visible");
			throw new RuntimeException(" Drop down not visible ");

		}

	}

	public void selectDropDownUsingValue(WebElement ele, String value) {
		// TODO Auto-generated method stub
		try {
			Select s=new Select(ele);
			s.selectByValue(value);
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The Element "+ele+"is not visible");
			throw new RuntimeException(" Drop down not visible ");

		}

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub

		try {
			Select s=new Select(ele);
			s.selectByIndex(index);
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The Element "+ele+"is not visible");
			throw new RuntimeException(" Drop down not visible ");

		}
	}

	public boolean verifyExactTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyPartialTitle(String expectedTitle) {
		// TODO Auto-generated method stub
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub

		try {
			if(ele.getText().equals(expectedText)) {				
				System.out.println("The text is verified");				
			}
			else {
				System.out.println("Text is not Verified");
			}
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		try {
			String text = ele.getText();
			/*Assert.assertEquals(true, text.contains(expectedText),"custom message")*/
			if(text.contains(expectedText)) {
				System.out.println("The text is verified");

			}
			else {
				System.out.println("Text is not Verified");
			}
		} catch (ElementNotVisibleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}}


	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub

	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		//getText(ele);

	}
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		try {
			Set<String> windowswitch = driver.getWindowHandles();
			//list is an interface so object cannot be created for it ,we r using array list
			List<String> w1=new ArrayList<String>();
			w1.addAll(windowswitch);
			driver.switchTo().window(w1.get(index));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("The window with the index "+index+" is not present");
			throw new RuntimeException("No such window");
		}


	}

	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().frame(ele);
		} catch (NoSuchFrameException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("No Such Frame "+ele);
			throw new RuntimeException("Frame is not present");
		}
	}

	public void acceptAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new RuntimeException("Alert is not present");


		}

	}

	public void dismissAlert() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().accept();
		} catch (UnhandledAlertException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new RuntimeException("Alert is not present");


		}

	}

	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void closeActiveBrowser() {
		// TODO Auto-generated method stub
		try {
			driver.quit();
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Unable to close the tab");
		}
	}

	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		try {
			driver.close();
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("Unable to close the browser");
		}
	}
	public void clear(WebElement ele) {
		try {
			driver.unregister(this);
			ele.clear();
			reportSteps("The data in element"+ele+"is cleared successfully", "pass");
			driver.register(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportSteps("The data in element"+ele+"is not cleared successfully", "fail");
		}
	}



}
