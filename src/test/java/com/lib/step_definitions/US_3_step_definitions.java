package com.lib.step_definitions;

import com.lib.pages.Dashboard_page;
import com.lib.utilities.BrowserUtils;
import com.lib.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US_3_step_definitions {
    Dashboard_page board = new Dashboard_page();

 @Given("the student on the home page")
    public void the_student_on_the_home_page() {
       board.emailField.sendKeys(ConfigurationReader.getProperty("student"));
       board.passwordField.sendKeys(ConfigurationReader.getProperty("password"));
        board.submit.click();
        BrowserUtils.wait(3);
    }
    @Then("the student should see following modules")
    public void the_student_should_see_following_modules(List<String>modules) {
        List<String>actualText=BrowserUtils.getElementsText(board.dashBoard);
        Assert.assertTrue(actualText.equals(modules));
    }


    @Given("the librarian on the home page")
    public void the_user_login_as_a_and1() {
        board.emailField.sendKeys(ConfigurationReader.getProperty("librarian"));
        board.passwordField.sendKeys(ConfigurationReader.getProperty("password2"));
        board.submit.click();

    }


    @Then("the librarian should see following modules")
    public void the_librarian_should_see_following_modules(List<String> modules) {
        List<String> actualText = BrowserUtils.getElementsText(board.dashBoard2);
        Assert.assertTrue(actualText.equals(modules));


    }
}



