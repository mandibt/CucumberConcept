package cucumber.features;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions2 {

	@Given("^I navigate to the zoo website$")
	public void shouldNavigateToZoo() throws Throwable {
		System.out.println("Executed the navigate to zoo method");
	}

	@When("^I click on the about link$")
	public void shouldClickOnAbout() throws Throwable {
		System.out.println("Executed the click on about method");
	}
}
