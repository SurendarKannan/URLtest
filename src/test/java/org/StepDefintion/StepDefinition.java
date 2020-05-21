package org.StepDefintion;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	WebDriver driver;

	@Given("^Launch the URL$")
	public void Launch_the_URL() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();		
		
	}
	
	@When("^Input the user credentials$")
	public void Input_the_user_credentials() {
		WebElement uname = driver.findElement(By.id("email"));
		uname.sendKeys("surenjack1@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("Surenjack@12345");
	}
	
	@And("^Clicking the login button$")
	public void Clicking_the_login_button() {
		
	WebElement login = driver.findElement(By.id("loginbutton"));
	login.click();
	}
	
	@Then("^Home Page$")
	public void Home_Page() {
		
		Assert.assertEquals("(2) Facebook", driver.getTitle());
	}
}
