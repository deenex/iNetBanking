package com.inetbanking.TestCases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {

		driver.get(baseURL);

		LoginPage lpage = new LoginPage(driver);

		lpage.setUserName(userName);

		lpage.setPassword(passWord);

		lpage.clickSubmit();

		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);

		}

	}

}
