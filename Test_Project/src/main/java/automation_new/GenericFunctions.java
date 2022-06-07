package automation_new;

import static org.junit.Assert.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import browsers.SharedDriver;

public class GenericFunctions {

	private static final Logger log = LoggerFactory.getLogger(GenericFunctions.class);
	public static WebDriver current_Driver;
	FluentWait<WebDriver> wait;
	
	public GenericFunctions()
	{
		this.current_Driver = SharedDriver.getDriver();
		wait = new FluentWait<WebDriver>(this.current_Driver).withTimeout(50,TimeUnit.SECONDS)
				.pollingEvery(1,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	}
	
	public void navigateToUrl(final String url) throws Throwable
	{
		GenericFunctions.log.info("Navigating to url==> "+url);
		this.current_Driver.manage().window().maximize();
		this.current_Driver.get(url);
	}
	
	public void waitUntilPageTitleIs(final String pageName)
	{
		try
		{
			wait.until(ExpectedConditions.titleContains(pageName));
		}
		catch(Exception e)
		{
			GenericFunctions.log.error("Unable to wait for page title...");
			GenericFunctions.log.error(e.getMessage());
		}
	}
	
	public void clickOnElementFromTheListWhichMathesText(final List<WebElement> listOfElement, final String text)
	{
		for(WebElement element : listOfElement) {
			if(element.getText().equals(text))
			{
				GenericFunctions.log.info("Now clicking on the element matching text..."+text);
				element.click();
				break;
			}
		}
		
	}
	
	public WebElement find(By by)
	{
		return this.current_Driver.findElement(by);
	}
	
	public List<WebElement> findList(By by)
	{
		return this.current_Driver.findElements(by);
	}
	public void click(By by)
	{
		find(by).click();
	}
	public WebElement getElementWhichMatchesValueForAttribute(final List<WebElement> listOfElement, final String attribute,
			final String expectedValue)
	{
		WebElement target_element = null;
		for(WebElement element : listOfElement) {
			if(element.getAttribute(attribute).equals(expectedValue))
			{
				target_element = element;
				break;
			}
		}
		return target_element;
	}
	
	public WebElement getElementWhoesAttributeIsNotNull(final List<WebElement> listOfElement, final String attribute)
	{
		WebElement source_element = null;
		for(WebElement element : listOfElement) {
			if(element.getAttribute(attribute) != null)
			{
				source_element = element;
				break;
			}
		}
		return source_element;
	}
	
	public String getAttributeOfElement(final WebElement element, final String attribute)
	{
		return element.getAttribute(attribute);
	}
	
	public void enterText(By by,String text) throws InterruptedException
	{
		Thread.sleep(10000);
		find(by).sendKeys(text);
		find(by).sendKeys(Keys.ENTER);
	}
	
	public String getText(By by)
	{
		return find(by).getText();
	}
	
	public void closeBrowser()
	{
		this.current_Driver.close();
	}
}
