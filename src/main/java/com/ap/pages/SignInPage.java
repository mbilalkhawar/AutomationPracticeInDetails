package com.ap.pages;

import com.ap.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SignInPage extends BaseClass {

    public SignInPage(){
        PageFactory.initElements(dr, this); // it is used to register all the elements so that they can be used in other classes
    }

    @FindBy(xpath = "//input[@id = 'email']")
    WebElement emailField;

    @FindBy(xpath = "//input[@id = 'passwd']")
    WebElement passwordField;

    @FindBy(xpath = "//button[@name = 'SubmitLogin']" )
    WebElement loginButton;


    public void enteringEmAndPswd(String emailAddress, String password)
    {
        emailField.sendKeys(emailAddress);
        passwordField.sendKeys(password);
    }

    public ProfilePage signIn()
    {
        loginButton.click();
        return new ProfilePage();
    }
}
