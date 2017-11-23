package com.dca.stepDefinitions;

import com.dca.config.TestConfiguration;
import com.dca.objects.Home_Page;
import com.dca.objects.Login_Page;
import com.dca.utilities.GetData;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by akbar.ayubkhan on 10/28/2016.
 */

public class Login_Test extends TestConfiguration {
    WebDriver driver = getDriver();
    Login_Page login_page = new Login_Page(driver);
    Home_Page home_page = new Home_Page(driver);

    @Given("^User Navigates to IMSHealth Login Page$")
    public void userNavigatesToIMSLoginPage() {
        System.out.println("User navigates to IMS Login Page");
        String url = GetData.fromProperties("./Test Data/config.properties", "url");
        driver.get(url);
    }

    @When("^User Enters valid username and password$")
    public void userEnterValidUNandPWD() throws Exception {
        String un = GetData.fromProperties("./Test Data/config.properties", "un");
        String pwd = GetData.fromProperties("./Test Data/config.properties", "pwd");
        login_page.setLogin(un, pwd);
    }

    @And("^Click sign-in$")
    public void userClicksOnSigninButton() {
        login_page.setSign_inBtn();
    }

    @Then("^Home page should be displayed$")
    public void homePageShouldBeDisplayed() throws Exception {
        home_page.get_title();
    }

    @Then("^take picture$")
    public void takePicture() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
