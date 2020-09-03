package com.ap.baseclass;

import com.ap.WebEventListener.WebEventListener;
import com.ap.utilities.Utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;
    public static Properties propt;
    public static WebEventListener eventListener;
    public static EventFiringWebDriver dr;

    public BaseClass() {
        propt = new Properties();
        try {
            FileInputStream ipa = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\ap\\files\\config.properties");
            propt.load(ipa);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void initialization(){
        String browserName = propt.getProperty("browser");
        if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\19174\\Desktop\\PreParation\\IntelliJProjects\\ChromeDriver\\chromedriver_win32_final\\chromedriver.exe");
            driver = new ChromeDriver();
            dr = new EventFiringWebDriver(driver);
            eventListener = new WebEventListener();
            dr.register((WebDriverEventListener) eventListener);

        }

        dr.manage().window().maximize();
        dr.manage().deleteAllCookies();
        dr.manage().timeouts().pageLoadTimeout(Utilities.PAGE_TIMEOUT, TimeUnit.SECONDS);
        dr.manage().timeouts().implicitlyWait(Utilities.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
        dr.get(propt.getProperty("url"));
    }
}
