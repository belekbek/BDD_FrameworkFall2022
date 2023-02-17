package steps;

import common.ConfigReader;
import driverManager.Driver;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pojo.UserDetails;

import java.util.List;
import java.util.Map;

public class DataTableSteps {
    LoginPage loginPage = new LoginPage();
    WebDriver driver = Driver.getDriver();

    @DataTableType
    public UserDetails userDetails(Map<String, String> row) {
        return new UserDetails(
                row.get("firstname"),
                row.get("lastname"),
                row.get("email"),
                row.get("username"),
                row.get("password"),
                row.get("bio")
        );

    }

    @Given("user should login with valid credentials")
    public void user_should_login_with_valid_credentials() {
        loginPage.usernameInput.sendKeys(ConfigReader.getProperty("username"));
        loginPage.passwordInput.sendKeys(ConfigReader.getProperty("password"));
        loginPage.submitLoginBtn.click();
    }

    @Then("user should click add user button")
    public void user_should_click_add_user_button() {
        loginPage.addUserBtn.click();

    }

    @Then("user should land to create new user page")
    public void user_should_land_to_create_new_user_page() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://nuta1bema.talentlms.com/user/create");

    }

//    @Given("create new user with following data")
//    public void create_new_user_with_following_data(DataTable dataTable) {
//        List<List<String>> userDetails = dataTable.asLists();
//        System.out.println(userDetails.get(1).get(0));
//    }


    @Given("create new user with following data")
    public void create_new_user_with_following_data(List<UserDetails> userDetails) {
        System.out.println(userDetails.get(3).getBio());
    }
}
