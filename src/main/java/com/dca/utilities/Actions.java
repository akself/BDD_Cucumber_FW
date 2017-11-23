package com.dca.utilities;

        import org.openqa.selenium.Alert;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.Select;

/**
 * Created by Akbar.AyubKhan on 10/14/2016.
 */

public class Actions
{
    public static void selectDDLByIndex(WebElement ddl, int index)
    {
        Select sct = new Select(ddl);
        sct.selectByIndex(index);
    }
    public static void selectDDLByValue(WebElement ddl, String value)
    {
        Select sct = new Select(ddl);
        sct.selectByValue(value);
    }
    public static void selectDDLVisibletext(WebElement ddl, String text)
    {
        Select sct = new Select(ddl);
        sct.selectByVisibleText(text);
    }
    public static void deSelectDDLByIndex(WebElement ddl, int index)
    {
        Select sct = new Select(ddl);
        sct.deselectByIndex(index);
    }
    public static void deSelectDDLByValue(WebElement ddl, String value)
    {
        Select sct = new Select(ddl);
        sct.deselectByValue(value);
    }
    public static void deSelectDDLVisibletext(WebElement ddl, String text)
    {
        Select sct = new Select(ddl);
        sct.deselectByVisibleText(text);
    }
    public static void deSelectDDLAll(WebElement ddl)
    {
        Select sct = new Select(ddl);
        sct.deselectAll();
    }
    public static boolean verifyDDLIsMultiple(WebElement ddl)
    {
        Select sct = new Select(ddl);
        boolean status = sct.isMultiple();
        return status;
    }
    public static void acceptAlert(WebDriver driver)
    {
        Alert alt = driver.switchTo().alert();
        alt.accept();
    }
    public static void dismissAlert(WebDriver driver)
    {
        Alert alt = driver.switchTo().alert();
        alt.dismiss();
    }
    public static String getAlertText(WebDriver driver)
    {
        Alert alt = driver.switchTo().alert();
        String altMsg = alt.getText();
        return altMsg;
    }
    public static void enterTextToAlert(WebDriver driver, String text)
    {
        Alert alt = driver.switchTo().alert();
        alt.sendKeys(text);
    }

}
