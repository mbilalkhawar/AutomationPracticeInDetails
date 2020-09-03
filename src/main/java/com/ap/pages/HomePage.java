package com.ap.pages;

import com.ap.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

   public HomePage(){
        PageFactory.initElements(dr, this);
    }

    @FindBy(xpath = "//a[@class = 'login']")
    WebElement signInButton;

    public void signPg(){
        signInButton.click();
    }
}
