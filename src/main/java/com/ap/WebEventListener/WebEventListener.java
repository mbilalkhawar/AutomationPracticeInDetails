package com.ap.WebEventListener;

import com.ap.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.Reporter;

public class WebEventListener extends BaseClass implements WebDriverEventListener {
    @Override
    public void beforeAlertAccept(WebDriver webDriver) {
        System.out.println("alert is present");
        Reporter.log("alert is present");
    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {
        System.out.println("alert is accepted");

        Reporter.log("alert is accepted");
    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {
        System.out.println("after alert is dismissed");

        Reporter.log("after alert is dismissed");
    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {
        System.out.println("before alert is dismissed");

        Reporter.log("before alert is dismissed");
    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Before Navigating to"+ s);

        Reporter.log("Before Navigating to"+ s);
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("After Navigating to"+ s);

        Reporter.log("After Navigating to"+ s);
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {
        System.out.println("Trying to find element");

        Reporter.log("Trying to find element");
    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {

    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {

    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {

    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {

    }
}
