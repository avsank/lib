package com.lib.pages;

import com.lib.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_page extends Home_page {

    public User_page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(id = "navbarDropdown")
    public WebElement rightNavigationBAr;

    @FindBy(className = "dropdown-item")
    public WebElement logOutButton;

/*    @FindBy(xpath = "/span[text()='Test Student 14']")
    public WebElement userName;

    @FindBy(xpath = "/a[@class='dropdown-item']")
    public WebElement logOutButton;*/


    /*@FindBy(xpath = "//span[text()='Test Librarian 21']")
    public WebElement libUserName;

    @FindBy(xpath = "/a[@class='dropdown-item']")
    public WebElement logOutButton2;*/
//We offer various benefits related to insurance as well as paid holidays, vacation and sick time, which you will learn more about as you complete your new hire paperwork.
}
