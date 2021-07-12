package com.lib.pages;

import com.lib.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

    public Login_page() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="inputEmail")
    public WebElement emailField;

    @FindBy(xpath="//input[@id='inputPassword']")
    public WebElement passwordField;


    @FindBy(xpath ="//*[text()='Sign in']")
    public WebElement submit;


}
