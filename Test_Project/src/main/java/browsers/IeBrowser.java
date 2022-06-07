package browsers;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import automation.config.TestConfig;

public class IeBrowser extends InternetExplorerDriver{

	public static IeBrowser configuredIeBrowser() throws Throwable
	{
	DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
	caps.setCapability("ignoreZoomSetting", true);
	String IEDriverPath = System.getProperty("user.dir") + TestConfig.valueFor("WebDriverIeDriverPath");
	System.setProperty("webdriver.ie.driver", IEDriverPath);
	IeBrowser browser = new IeBrowser(caps);
	return browser;
	}
	private IeBrowser(final DesiredCapabilities capabilities)
	{
		super(capabilities);
	}
}
