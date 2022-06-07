package browsers;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import automation.config.TestConfig;

public class FirefoxBrowser extends FirefoxDriver{

	public static FirefoxBrowser configuredFirefoxBrowser() throws Throwable
	{
	String geckoDriver = System.getProperty("user.dir") + TestConfig.valueFor("GeckoDriverPath");
	System.setProperty("webdriver.gecko.driver", geckoDriver);
	FirefoxProfile profile = new FirefoxProfile();
	profile.setAcceptUntrustedCertificates(true);
	profile.setAssumeUntrustedCertificateIssuer(false);
	profile.setPreference("dom.max_chrome_script_run_time", 0);
	profile.setPreference("dom.max_script_run_time", 0);
	profile.setPreference("intl.accept_langues", "");
	profile.setPreference("devtools.jsonview_enabled", false);
	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
	capabilities.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
	capabilities.setCapability(FirefoxDriver.PROFILE, profile);
	capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	capabilities.setCapability("marionetter", false);
	FirefoxOptions options = new FirefoxOptions().setProfile(profile);
	FirefoxBrowser browser = new FirefoxBrowser(options);
	browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return browser;
	}
	private FirefoxBrowser(FirefoxOptions options)
	{
		super(options);
	}
}
