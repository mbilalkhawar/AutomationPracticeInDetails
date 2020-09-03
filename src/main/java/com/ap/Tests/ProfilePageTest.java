package com.ap.Tests;

import com.ap.baseclass.BaseClass;
import com.ap.pages.HomePage;
import com.ap.pages.ProfilePage;
import com.ap.pages.SignInPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProfilePageTest extends BaseClass {
    ProfilePage ppG;
    SignInPage ssP;
    HomePage hhG;
    @BeforeTest
    public void LaunchingBrowser(){
        initialization();
        ppG = new ProfilePage();
        ssP = new SignInPage();
        hhG = new HomePage();

    }

    @Test
    public void profilePageTest()
    {
        hhG.signPg();
        ssP.enteringEmAndPswd(propt.getProperty("username"), propt.getProperty("password") );
        ssP.signIn();
        ppG.clickOnWomenAndFetchTheResults();
    }

    @AfterTest
    public void tearDown(){
        dr.quit();
    }
}
