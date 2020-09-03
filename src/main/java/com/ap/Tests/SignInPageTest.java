package com.ap.Tests;

import com.ap.baseclass.BaseClass;
import com.ap.pages.HomePage;
import com.ap.pages.ProfilePage;
import com.ap.pages.SignInPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SignInPageTest extends BaseClass {
    HomePage hhG;
    SignInPage ssG;
    @BeforeTest
    public void LaunchingBrowser(){

        initialization();
        hhG = new HomePage();
        ssG = new SignInPage();
    }

    @Test(priority = 0)
    public void ssN()
    {
        hhG.signPg();
        ssG.enteringEmAndPswd(propt.getProperty("username"), propt.getProperty("password") );
    }

    @Test(priority = 1)
    public void ppPage()
    {
        ssG.signIn();
    }

    @AfterTest
    public void tearDown(){
        dr.quit();}

}
