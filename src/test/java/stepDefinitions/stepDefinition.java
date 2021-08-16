package stepDefinitions;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
public class stepDefinition {

//    @Given("^User is on Netbanking login page$")
//    public void user_is_on_netbanking_login_page() throws Throwable {
//        
//        System.out.println("hai");
//    }
//
//    @When("^User login to application with username and password$")
//    public void user_login_to_application_with_username_and_password() throws Throwable {
//        
//        System.out.println("hello");
//    }
//
//    @Then("^Home page is populated$")
//    public void home_page_is_populated() throws Throwable {
//        
//        System.out.println("bye");
//    }
//
//    @And("^Cards are displayed$")
//    public void cards_are_displayed() throws Throwable {
//        
//        System.out.println("hellooo");
//    }



	@Given("User is on Netbanking login page")
	public void user_is_on_netbanking_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hai 1");
	}
	@When("User login to application with {string} and password {string}")
	public void user_login_to_application_with_and_password(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);
	    System.out.println(string2);

	}

	@Then("Home page is populated")
	public void home_page_is_populated() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hai 3 ");
	}
	@Then("Cards displayed are {string}")
	public void cards_displayed_are(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(string);

	}






	
	
	
	
}