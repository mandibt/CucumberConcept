package cucumber.features;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	@After 
	public void tearDown() {
		driver.quit();
	}
	
	@Before("@web")
	public void setUpWeb() {
		System.out.println("before web tag method");
//		driver = new ChromeDriver();
	}
	
	@After("@web") 
	public void tearDownWeb() {
		System.out.println("after web tag method");
//		driver.quit();
	}
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

	@And("^Check for an available animal$")
	public void check_for_an_available_animal() throws Throwable {
		driver.findElement(By.id("check_btn_02")).click();
	}

	@And("^Populate the form$")
	public void populate_the_form() throws Throwable {
		driver.findElement(By.name("name_field")).sendKeys("Rudolph");
		driver.findElement(By.name("address_field")).sendKeys("111 Forest St.");
		driver.findElement(By.name("postcode_field")).sendKeys("B 22222");
		driver.findElement(By.name("email_field")).sendKeys("red@nose.deer");
		driver.findElement(By.id("submit_adoption")).click();
	}

	@Then("^There should be a confirmation message$")
	public void there_should_be_a_confirmation_message() throws Throwable {
		Assert.assertTrue(driver.findElement(By.tagName("p")).getText().contains("YOUR ADOPTION HAS BEEN SET UP")) ;
	}


	
}
