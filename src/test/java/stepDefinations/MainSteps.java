package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

public class MainSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("given block");
	}

	@When("user login into application with {string} and password {string} combinations")
	public void user_enters_valid_user1_and_pass1(String username, String password) {
		System.out.println(username + "password is " + password);
	}

	@Then("user is navigated to home page")
    public void user_is_navigated_to_home_page() {
        System.out.println("then table");
    }
}
