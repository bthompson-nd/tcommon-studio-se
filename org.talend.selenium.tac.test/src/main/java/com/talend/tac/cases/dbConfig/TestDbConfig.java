package com.talend.tac.cases.dbConfig;

import static org.testng.Assert.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestDbConfig extends DbConfig {

	@Test(groups = { "initDB" })
	@Parameters( { "db.url", "db.userName", "db.userPassWd", "db.driver",
			"license.file.path","license.fileInvalid.path"})
	public void testDbConfig(String url, String userName, String userPassWd,
			String driver, String license,String invalidLicense) {

		this.DbConfigProcess(url, userName, userPassWd, driver);
		waitForCheckConnectionStatus("//div[text()='OK']",4);
		// simulate clicking ENTER to make button enabled.
		selenium.keyDown("idDbConfigDriverInput", "\\13");
		selenium.keyUp("idDbConfigDriverInput", "\\13");
		selenium.click("idDbConfigSaveButton");

		// if the parameter is saved successfully ,the save button will turn
		// gray.
		selenium
				.waitForCondition(
						"selenium.isElementPresent(\"//table[contains(@class,'disabled')]//button[@id='idDbConfigSaveButton']\")",
						"30000");
		waitForCheckConnectionStatus("//div[text()='OK']",4);
		//if no license, load the license from a file.
	
		//No license	
		selenium.click("//button[text()='Set new license']");
		selenium.click("//button[text()='Upload']");
		selenium.waitForCondition("selenium.isTextPresent(\"Invalid license key\")", WAIT_TIME*1000+"");
		clickWaitForElementPresent("//button[text()='Ok']");
		this.clickWaitForElementPresent("//span[text()='New license set']/preceding-sibling::div//div");//close window
			
		//incorrect licence
		selenium.click("//button[text()='Set new license']");
		selenium.type("//button[contains(text(),'Browse')]/ancestor::table[1]/preceding-sibling::input[1]", invalidLicense);
		selenium.click("//button[text()='Upload']");
		selenium.waitForCondition("selenium.isTextPresent(\"Invalid license key\")", WAIT_TIME*1000+"");
		clickWaitForElementPresent("//button[text()='Ok']");
		this.clickWaitForElementPresent("//span[text()='New license set']/preceding-sibling::div//div");//close window
			
		//correct licnese
		selenium.click("//button[text()='Set new license']");
		selenium.type("//button[contains(text(),'Browse')]/ancestor::table[1]/preceding-sibling::input[1]", license);
		selenium.click("//button[text()='Upload']");
		selenium.waitForCondition("selenium.isTextPresent(\"New license set\")", WAIT_TIME*1000+"");
		clickWaitForElementPresent("//button[text()='Ok']");
		waitForCheckConnectionStatus("//div[text()='OK']",5);

		selenium.click("idDbConfigLogoutButton");
		waitForElementPresent("idLoginInput", WAIT_TIME);
	}

	@AfterTest
	public void killBrowser() {
		selenium.stop();
	}

}
