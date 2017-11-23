package com.dca.utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Akbar.AyubKhan on 10/13/2016.
 */

public class Screenshots {
    public static String captureScreenShot(WebDriver driver, String name) throws Exception {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);


        try {
            FileUtils.copyFile(src, new File("./ScreenShots/" + name + ".png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return name;
    }
}



