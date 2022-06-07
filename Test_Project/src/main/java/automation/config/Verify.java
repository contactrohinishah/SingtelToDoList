package automation.config;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Verify {

	
	public void that(String actual, String expected)
	{
		 Assert.assertEquals(expected, actual);
	}

	public void that(boolean actual, boolean expected)
	{
		 Assert.assertEquals(expected, actual);
	}
	
	public void that(Object actual, Object expected)
	{
		 Assert.assertEquals(expected, actual);
	}
}
