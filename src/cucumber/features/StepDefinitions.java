package cucumber.features;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	WebDriver driver = new ChromeDriver();
	
	@Given("^I am on my zoo website$")
	public void shouldNavigateToZooSite() throws Throwable {
		driver.navigate().to("http://www.thetestroom.com/webapp/index.html");
	}

	@When("^I click on the contact link$")
	public void shouldClickOnContactLink() throws Throwable {
		driver.findElement(By.id("contact_link")).click();
	}

	@And("^populate the contact form$")
	public void shouldPopulateContactForm() throws Throwable {
		driver.findElement(By.name("name_field")).sendKeys("Santa Clause");
		driver.findElement(By.name("address_field")).sendKeys("Merry Christmas 1/1");
		driver.findElement(By.name("postcode_field")).sendKeys("7000");
		driver.findElement(By.name("email_field")).sendKeys("zoo@test.com");
		driver.findElement(By.id("submit_message")).click();
	}

	@Then("^I should be on the contact confirmation page$")
	public void checkOnContactConfirmationPage() throws Throwable {
		Assert.assertTrue("Not on contact confirmation page", 
				driver.getTitle().equals("Contact Confirmation"));
	}
}
