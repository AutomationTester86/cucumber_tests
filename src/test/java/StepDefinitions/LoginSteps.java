package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is login on page")
    public void user_is_login_on_page() {
        System.out.println("user is login on page");
    }
    @When("user entered login and password")
    public void user_entered_login_and_password() {
        System.out.println("user is login on page");
    }
    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("user is login on page");
    }
    @Then("user is navigate to home page")
    public void user_is_navigate_to_home_page() {
        System.out.println("user is login on page");
    }
}
