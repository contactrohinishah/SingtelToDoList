package browsers;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import cucumber.api.java.After;

import static browsers.BrowserFactory.configuredBrowser;

public class SharedDriver  extends EventFiringWebDriver{
	private static WebDriver sharedDriver;
	private static WebDriver REAL_DRIVER = null;

	private static final Thread CLOSED_THREAD = new Thread() {
	@Override
	public void run()
	{
		SharedDriver.REAL_DRIVER.quit();
	}
	};

	static 
	{
		try {
			REAL_DRIVER = configuredBrowser();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public SharedDriver() {
		super(SharedDriver.REAL_DRIVER);
	}

	public static WebDriver getDriver()
	{
		if(SharedDriver.REAL_DRIVER !=null)
		{
			SharedDriver.sharedDriver = SharedDriver.REAL_DRIVER;
		}
		return SharedDriver.sharedDriver;
	}
	
	@Override
	public void close()
	{
		if(Thread.currentThread() != SharedDriver.CLOSED_THREAD)
		{
			throw new UnsupportedOperationException("You should close this webdriver");
		}
		super.quit();
	}
	
	
}
