package com.lib.step_definitions;

import com.lib.pages.Home_page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class US_2_step_definitions {
    Home_page home = new Home_page();

    @And("user clicks on userName")
    public void userClicksOnUserName() {
        home.rightNavBar.click();
    }

    @Then("users click to logout button")
    public void usersClickToLogoutButton() {
     home.logOutButton.click();
    }


}


