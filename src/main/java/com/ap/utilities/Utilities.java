package com.ap.utilities;

import com.ap.baseclass.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Utilities extends BaseClass {
    public static int IMPLICIT_TIMEOUT = 20;
    public static int PAGE_TIMEOUT = 20;

    public static void screenShotOnFailedTestCase(String methodName){
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("C:\\Users\\19174\\Desktop\\PreParation\\IntelliJProjects\\AutomationPracticeInDetails\\repo"+methodName+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
