package org.stepdefin.par;

import org.basepar.BaseClassp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClassp{
	@Given("User in on Facebook page")
	public void user_in_on_Facebook_page() {
    launchBrowser();
		driver.get("https://www.facebook.com/");
	  
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String s1, String s2) {
		driver.findElement(By.id("email")).sendKeys(s1);
		driver.findElement(By.id("pass")).sendKeys(s2);
		//driver.findElement(By.id("loginbutton")).click();
	}

	@Then("User should click login button")
	public void user_should_click_login_button() {
	 //driver.close();
	}

}
