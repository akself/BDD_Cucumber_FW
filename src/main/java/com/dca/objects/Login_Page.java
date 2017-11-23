package com.dca.objects;

import com.dca.config.TestConfiguration;
import com.dca.utilities.GetData;
import com.dca.utilities.Screenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by akbar.ayubkhan on 10/28/2016.
 */
public class Login_Page  extends TestConfiguration {
    WebDriver driver = getDriver();

    @FindBy(id = "j_username")
    private WebElement userNameTextbox;

    @FindBy(name = "j_password")
    private WebElement passTextbox;

    @FindBy(xpath = "//button[@id='loginBtn']")
    private WebElement sign_inBtn;

    public Login_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setLogin(String un, String pwd) throws Exception {
        Screenshots.captureScreenShot(driver, "1.LoginPage");
        userNameTextbox.sendKeys(un);
        passTextbox.sendKeys(pwd);
    }

    public void setSign_inBtn() {
        sign_inBtn.click();
    }

}
