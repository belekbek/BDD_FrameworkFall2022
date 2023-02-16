package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.LoginPage;

public class ScenarioOutlineStep {

    LoginPage loginPage = new LoginPage();
    @Given("enter in username field {string}")
    public void enter_in_username_field(String string) {
        loginPage.usernameInput.sendKeys(string);
       
    }
    @Given("enter in password field {string}")
    public void enter_in_password_field(String string) {
        loginPage.passwordInput.sendKeys(string);
       
    }
    @Then("login not successful")
    public void login_not_successful() {
        System.out.println("Login is not successful");
       
    }
}
