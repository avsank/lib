package com.lib.step_definitions;

import com.lib.pages.Login_page;
import com.lib.utilities.BrowserUtils;
import com.lib.utilities.ConfigurationReader;
import com.lib.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_1_step_definitions {

    Login_page login = new Login_page();

    @Given("the user login as a {string} and {string}")
    public void the_user_login_as_a_and(String userName, String password) {
        login.emailField.sendKeys(ConfigurationReader.getProperty(userName));
        login.passwordField.sendKeys(ConfigurationReader.getProperty(password));
        BrowserUtils.wait(5);
    }



    @When("user click on submit button")
    public void user_click_on_submit_button() {
        login.submit.click();

    }
    @Then("the user on {string}")
    public void the_user_on(String page) {
        BrowserUtils.wait(5);
        String actualPage= Driver.getDriver().getCurrentUrl().substring(37);
        Assert.assertEquals(actualPage,page);
        BrowserUtils.wait(5);


    }


















    /*@Given("the user login as a role")
    public void the_user_login_as_a_role() {
    login.emailField.sendKeys(ConfigurationReader.getProperty("student"));
    login.passwordField.sendKeys(ConfigurationReader.getProperty("password14"));
    login.submit.click();
    BrowserUtils.wait(5);
    }



    @Then("the user on books")
    public void the_user_on_books() {
    String expectedUrl = "https://library2.cybertekschool.com/#books";
    String actualUrl= Driver.getDriver().getCurrentUrl();
    BrowserUtils.wait(5);
    }


    @Given("the user login as a librarian")
    public void the_user_login_as_a_librarian() {
        login.emailField.sendKeys("librarian21");
        login.passwordField.sendKeys("password21");
        login.submit.click();
        BrowserUtils.wait(5);
    }




    @Then("the user on Dashboard")
    public void the_user_on_dashboard() {
        String expectedUrl = "https://library2.cybertekschool.com/#dashboard";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        BrowserUtils.wait(5);

    }*/
//comment
}
