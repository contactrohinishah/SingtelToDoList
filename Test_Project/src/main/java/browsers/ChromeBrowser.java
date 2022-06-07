package browsers;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import automation.config.TestConfig;

public class ChromeBrowser extends ChromeDriver{

	public static ChromeBrowser configuredChromeBrowser() throws Throwable
	{
	String chromerDriverPath = System.getProperty("user.dir") + TestConfig.valueFor("WebDriverChromeDriverPath");
	System.setProperty("webdriver.chrome.driver", chromerDriverPath);
	ChromeBrowser browser = new ChromeBrowser();
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return browser;
	}
	private ChromeBrowser()
	{
		super();
	}
}
