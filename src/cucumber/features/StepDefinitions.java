package cucumber.features;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
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
	public void shouldPopulateContactForm(DataTable table) throws Throwable {	
		List<List<String>> data = table.raw();
		System.out.println(data.get(1).get(1));
		
		driver.findElement(By.name("name_field")).sendKeys(data.get(1).get(1));
		driver.findElement(By.name("address_field")).sendKeys(data.get(2).get(1));
		driver.findElement(By.name("postcode_field")).sendKeys(data.get(3).get(1));
		driver.findElement(By.name("email_field")).sendKeys(data.get(4).get(1));
		driver.findElement(By.id("submit_message")).click();
	}

	@Then("^I should be on the contact confirmation page$")
	public void checkOnContactConfirmationPage() throws Throwable {
		Assert.assertTrue("Not on contact confirmation page", 
				driver.getTitle().equals("Contact Confirmation"));
	}
	
	@When("^I navigate to \"([^\"]*)\"$")
	public void shouldClickOnLink(String link) throws Throwable {
		driver.findElement(By.id(link)).click();
	
	}

	@Then("^I check page title is \"([^\"]*)\"$")
	public void checkPageTitle(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
	}

	@And("^I close the browser$")
	public void closeBrowser() throws Throwable {
		driver.close();
	}

	
	
}
