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

public class StepDefinition {
	
	WebDriver driver;

	@Given("^Launch the URL$")
	public void Launch_the_URL() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
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
	
	@Then("^Clicking the login button$")
	public void Clicking_the_login_button() {
		
	WebElement login = driver.findElement(By.id("loginbutton"));
	login.click();
	}
	
}
