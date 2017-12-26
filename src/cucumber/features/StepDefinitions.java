package cucumber.features;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	@When("^I click on the adoption link$")
	public void shouldClickOnAdoption() throws Throwable {
		System.out.println("Executed the click on adoption method");
	}

	@Then("^I check to see that no animals are available$")
	public void checkAnimalStringVisible() throws Throwable {
		System.out.println("Checked that the no animals string was visible");

	}
}
