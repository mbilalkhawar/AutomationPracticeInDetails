package com.ap.Tests;

import com.ap.baseclass.BaseClass;
import com.ap.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {
    HomePage hmPg;
    /*public HomePageTest()
    {
        super();
    }*/

    @BeforeTest
    public void LaunchingBrowser(){
        initialization();
        hmPg = new HomePage();
    }

    @Test
    public void checkSignIn() {
        Assert.assertEquals("My LB Store", driver.getTitle());
        hmPg.signPg();
    }

    @AfterTest
    public void tearDown(){
        dr.quit();
    }
}
