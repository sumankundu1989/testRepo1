package com.tt.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class jan1 {
	
	WebDriver driver;
	
	@Given("^As a user i want to login yahoo\\.com$")
	public void as_a_user_i_want_to_login_yahoo_com() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
	    driver = new ChromeDriver();
	    driver.get("https://login.yahoo.com/");
	}

	@When("^i enter user id and valid password$")
	public void i_enter_user_id_and_valid_password() throws Throwable {
	    driver.findElement(By.name("username")).sendKeys("sumankundu99@yahoo.com");
	}

	@When("^i click on submit button$")
	public void i_click_on_submit_button() throws Throwable {
		driver.findElement(By.id("login-signin")).click();
	}

	@Then("^i login succesfully$")
	public void i_login_succesfully() throws Throwable {
	    
	}
}
