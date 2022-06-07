package browsers;

import org.junit.runners.Parameterized.AfterParam;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import automation.config.TestConfig;
import automation_new.GenericFunctions;

public class BrowserFactory {
	private static final Logger log = LoggerFactory.getLogger(BrowserFactory.class);
	public static WebDriver selectedDriver;
//	@cucumber.api.java.Before
	public static WebDriver configuredBrowser() throws Throwable {
		String desiredBrowser = System.getProperty("browser", TestConfig.valueFor("Browser"));
		System.out.println("Browser Selected is " + desiredBrowser);
		return runonLocal(desiredBrowser);
	}
	

	private static WebDriver runonLocal(String desiredBrowser) throws Throwable {
//		WebDriver selectedDriver;
		switch (desiredBrowser) {
		case "ie":
			selectedDriver = IeBrowser.configuredIeBrowser();
			break;
		case "chrome":
			selectedDriver = ChromeBrowser.configuredChromeBrowser();
			break;
		default:
			BrowserFactory.log.info("Default browser - firefox is picked");
			selectedDriver = FirefoxBrowser.configuredFirefoxBrowser();
		}
		selectedDriver.manage().window().maximize();
		return selectedDriver;
	}

	
}
