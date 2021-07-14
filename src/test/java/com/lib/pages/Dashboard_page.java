package com.lib.pages;

import com.lib.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Dashboard_page extends Home_page{

   public Dashboard_page(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

@FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement booksModule;

    @FindBy(xpath = "(//span[@class='title'])[2]")
    public WebElement booksBorrowModule;


  @FindBy(xpath = "//span[@class='title']")
  public List<WebElement> dashBoard;

@FindBy(xpath ="//span[@class='title']" )
  public  List<WebElement>dashBoard2;
}
