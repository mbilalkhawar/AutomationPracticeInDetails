package com.ap.pages;

import com.ap.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProfilePage extends BaseClass {

    public ProfilePage(){
        PageFactory.initElements(dr, this);
    }

    @FindBy(xpath = "//input[@name = 'search_query']")
    WebElement searchBar;

    @FindBy(xpath = "//button[@name = 'submit_search']")
    WebElement searchButton;

    @FindBy(xpath = "//a[@title = 'Women'][@class = 'sf-with-ul']")
    WebElement womenOption;

    @FindBy(xpath = "//ul[@class = 'product_list grid row']")
    List<WebElement> allTheResults;

    public void clickOnWomenAndFetchTheResults(){
        womenOption.click();
        System.out.println(allTheResults.get(0).getText());
        allTheResults.get(0).findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
       /* for(WebElement ash: allTheResults){
            System.out.print(ash.getText());
        }*/
    }
}
