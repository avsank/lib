package com.lib.pages;

import com.lib.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page extends Login_page{

    public Home_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "navbarDropdown")
    public WebElement rightNavBar;


   @FindBy(className = "dropdown-item")
    public WebElement logOutButton;

}
