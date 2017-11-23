package com.dca.objects;

import com.dca.config.TestConfiguration;
import com.dca.utilities.Screenshots;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by akbar.ayubkhan on 10/28/2016.
 */
public class User_Page extends TestConfiguration {
    WebDriver driver = getDriver();

    @FindBy(xpath = "//translate[text()='Users']")
    private WebElement user_text;

    @FindBy (xpath = "//translate[contains(.,'Add New')]")
    private WebElement addUserBtn;

    @FindBy(name = "country")
    private WebElement country_dropdown;

    @FindBy(xpath = "//input[@ims-input='Organisation Name']")
    private WebElement srchOrgName;

    @FindBy(css = ".fa.fa-search")
    private WebElement search_Btn;

    @FindBy(xpath = "//table/tbody/tr[1]/td[4]")
    private WebElement srchUsrEmail;

    @FindBy(xpath = "(//translate[text()='Details'])[1]")
    private WebElement details_Btn;

    @FindBy(xpath = "(//td)[9]")
    private WebElement capture_text;

    @FindBy(xpath = "//translate[text()='Add']")
    private WebElement add_Btn;


    public User_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUser_home() throws Exception {
        System.out.println(" User is under User's home page\n" );
    }

    public void setUser_text() throws Exception {
        System.out.println("======================================================\n");
        System.out.println(user_text.getText() + " is displayed under the user's page\n");
        System.out.println("======================================================");
        Thread.sleep(1000);
    }

    public void setCountry_dropdown(String country) {
        Select sct = new Select(country_dropdown);
        sct.selectByVisibleText(country);
    }

    public void setSrchOrgName(String orgName) throws Exception{
        srchOrgName.sendKeys(orgName);

    }

    public void setSearch_Btn() {
        search_Btn.click();
    }

    public void search_result() throws Exception {
        System.out.println("==User Search results are displayed==\n");
        System.out.println("=====================================\n");
    }

    public void setSrchUsrEmail(String useremail)throws Exception{
        String newUsrEmail=useremail.toString();
        String text = srchUsrEmail.getAttribute("innerHTML");
        System.out.println("Searched User email : " + newUsrEmail );
        System.out.println("Newly Created user email orgName : " + text);
        System.out.println((text.equalsIgnoreCase(newUsrEmail)) ? "New user search successfull \n" : "New user search failed\n");
    }

    public void setDetails_Btn() throws Exception {
        Thread.sleep(1500);
        details_Btn.click();
    }

    public void setCapture_text() throws Exception {
        Thread.sleep(1500);
        System.out.println(capture_text.getText() + " is displayed under the search results menu \n");
        System.out.println("======================================================\n");
        Screenshots.captureScreenShot(driver, "12.User Search Results");
    }

    public void setAdd_Btn() throws Exception {
        add_Btn.click();
        Thread.sleep(1000);
        Screenshots.captureScreenShot(driver, "13.Add new User page");
    }

    public void setAddUserBtn() throws Exception{
        addUserBtn.click();
    }
}
