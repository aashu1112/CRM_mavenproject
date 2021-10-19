package com.crm.contactTest;

import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void parameterSampletest()
	{
		String URL = System.getProperty("url");
		System.out.println(URL);
	}
	

}
