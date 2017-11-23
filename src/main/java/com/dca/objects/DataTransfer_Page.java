package com.dca.objects;

import com.dca.config.TestConfiguration;
import com.dca.utilities.Actions;
import com.dca.utilities.Screenshots;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class DataTransfer_Page extends TestConfiguration {

    WebDriver driver = getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 5);

    @FindBy(xpath = "//translate[contains(.,'Organisation Preview')]")
    private  WebElement orgPreviewPage;

    @FindBy (xpath = "//i[@class='fa fa-pencil']")
    private WebElement editPencil;

    @FindBy(xpath = "//a[text()='Data Transfers']")
    private WebElement dataTransferTab;

    @FindBy(xpath = "//translate[contains(.,'Modify Organisation')]")
    private WebElement modifyOrgText;

    @FindBy(name = "dataDomain")
    private WebElement dataDomainDD;

    @FindBy(xpath = "//select[@ims-input='Panel Status']")
    private WebElement panelStatusDD;

    @FindBy(xpath = "//div[1]/div[2]/div[1]/div[3]/div/div/translate")
    private WebElement addBtn;

    @FindBy(xpath = "//select[@ims-input='Domain With Associated Panel Status']")
    private WebElement domainStatusDD;

    @FindBy(xpath = "//select[@name='dataType']")
    private WebElement dataTypeDD;

    @FindBy(xpath = "//label[contains(.,'Data Type')]")
    private WebElement dataTypeLbl;

    @FindBy(xpath = "//translate[contains(.,'Start Data Transfer Configuration')]")
    private WebElement startConfigBtn;

    @FindBy(xpath = "//translate[text()='Modify Organisation']")
    private WebElement addOrgtitle;

    @FindBy(name = "dataOwner")
    private WebElement dataOwnerBox;

    @FindBy(xpath = "//ul/li/a[contains(text(),'Singh')]")
    private WebElement userText;

    @FindBy(name = "dataCollectionMethod")
    private WebElement dataCollectionDD;

    @FindBy(name = "transferDirectionType")
    private WebElement transferDirectionDD;

    @FindBy(name = "schedulerStartDate")
    private WebElement startDate;

    @FindBy(xpath =".//*[@id='content']/div/div/ui-view/div/div[3]/form/div/div/div/div[1]/div/ng-form/div[3]/div/scheduler/div/ng-form/div/div[2]/div[1]/div[2]/div[1]/label/span/input")
    private WebElement SchdendDate;

    @FindBy(name = "schedulerType")
    private WebElement transferScheduleDD;

    @FindBy(name="schedulerTimeZone")
    private  WebElement timezoneDD;

    @FindBy (name="schedulerInterval")
    private WebElement schedulerInterval;

    @FindBy(xpath = "//a[contains(.,'File Transfer Details')]")
    private WebElement fileTransferDetailsTab;

    @FindBy(name = "primaryTransferMethod")
    private WebElement primaryTransferDD;

    @FindBy(xpath = "(//div[1]/div[2]/div/select)[2]")
    private WebElement alternateTransferDD;

    @FindBy(name = "primaryTransferMethodFtpHostProvider")
    private WebElement FTPhostproviderDD;

    @FindBy(name = "senderSoftwareType")
    private WebElement dataTransferTypeDD;

    @FindBy(name = "mftDomain")
    private WebElement mftDD;

    @FindBy(name = "mftCountry")
    private WebElement mftcountryDD;

    @FindBy(name = "mftWorkflow")
    private WebElement mftWorkflowDD;

    @FindBy(name = "primaryTransferMethodProtocolType")
    private WebElement FTPTypeDD;

    @FindBy(xpath = "//translate[text()='Add SSH keypair']")
    private WebElement addSSHBtn;

    @FindBy(xpath = "(//div/textarea)[1]")
    private WebElement publicKey;

    @FindBy(xpath = "(//div/textarea)[2]")
    private WebElement privatekey;

    @FindBy(xpath = "//div/button[text()='OK']")
    private WebElement OKBtn;

    @FindBy(xpath = "//span[contains(.,'Alternate Transfer Method - Email')]")
    private WebElement AlternateMethod;

    @FindBy(name = "alternateTransferMethodEmail")
    private WebElement emailText;

    @FindBy(name = "alternateTransferMethodEmailConfirm")
    private WebElement emailConfirmText;

    @FindBy(xpath = "//a[contains(.,'File Specification')]")
    private WebElement fileSpecTab;

    @FindBy(xpath = "//select[@name='specificationTemplate']/option")
    private List<WebElement> specTemplate;

    @FindBy(xpath = "//translate[contains(.,'File Encryption')]")
    private WebElement fileEncryptChek;

    @FindBy(name = "fileEncryptorType")
    private WebElement EncryptedBy;

    @FindBy(xpath = "//a[contains(.,'Activation Details')]")
    private WebElement ActivationDetailsTab;

    @FindBy(xpath = "//translate[contains(.,'Activate Immediately')]")
    private WebElement activateImmediate;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div/ui-view/div/div[3]/form/div/div/div/div[4]/div/ng-form/div[3]/div[2]/div/div/label/translate")
    private WebElement endDate;

    @FindBy(name = "activationEndDate")
    private WebElement activationendDate;

    @FindBy(xpath = ".//*[@id='content']/div/div/ui-view/div/div[4]/div/button[1]")
    private WebElement saveBtn;

    @FindBy(xpath = "//h3/small/span")
    private WebElement getId;

    @FindBy(xpath = ".//*[@id='content']/div/div/ui-view/ng-form/div/div[4]/div/div[1]/translate")
    private WebElement saveOrg;


    public DataTransfer_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setOrgPreviewPage() throws Exception {
        String text = orgPreviewPage.getText();
        String title = "Organisation Preview";
        System.out.println("Org preview page"+ text);
        System.out.println((title.equals(text)) ? "Navigated to Organisation Preview page " : "Could not Navigated to Organisation Preview page");
    }

    public  void  setEditPencil () throws Exception {
        editPencil.click();
    }

    public void setDataTransferTab() throws Exception {
        Thread.sleep(1000);
        //dataTransferTab.click();
        ((JavascriptExecutor) this.driver).executeScript("return arguments[0].click();", dataTransferTab);
    }

    public void setModifyOrgText() {
        System.out.println( modifyOrgText.getText() + " is displayed under the modify page ");
        System.out.println("===============================================================");
    }

    public void setDataDomainDD(String dataDomain) {

        com.dca.utilities.Actions.selectDDLVisibletext(dataDomainDD, dataDomain);
    }

    public void setPanelStatusDD(String PanelStatus) {
        com.dca.utilities.Actions.selectDDLVisibletext(panelStatusDD, PanelStatus);
    }

    public void setAddBtn() throws Exception {
        Thread.sleep(2000);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath ("//translate[contains(.,'Add')]")));
        addBtn.click();
        //((JavascriptExecutor) this.driver).executeScript("arguments[0].click();", addBtn);
    }

    public void setDomainStatusDD(String DomainStatus) throws Exception {
        Thread.sleep(2000);
        com.dca.utilities.Actions.selectDDLVisibletext(domainStatusDD, DomainStatus);
    }

    public void settimezoneDD(String TimeZone) throws Exception {
        Thread.sleep(2000);
        com.dca.utilities.Actions.selectDDLVisibletext(timezoneDD, TimeZone);
    }

    public void setschedulerInterval(String hours)throws Exception {
        schedulerInterval.sendKeys(hours);
    }

    public void setdataTypeLbl(){
        dataTypeLbl.click();
    }

    public void setDataTypeDD(String DataType) {
        com.dca.utilities.Actions.selectDDLVisibletext(dataTypeDD, DataType);
    }

    public void setStartConfigBtn() {
        startConfigBtn.click();
    }

    public void setAddOrgtitle() {
        System.out.println(addOrgtitle.getText() + " is displayed under Modify organisation page");
        System.out.println("======================================================");
    }

    public void setDataOwnerBox(String DataOwner) throws Exception {
        dataOwnerBox.sendKeys(DataOwner);
        Thread.sleep(2000);
    }

    public void setUserText() throws Exception {
        userText.click();
    }

    public void setDataCollectionDD(String DataCollection) {
        com.dca.utilities.Actions.selectDDLVisibletext(dataCollectionDD, DataCollection);
    }

    public void setTransferDirectionDD(String TransferDirection) {
        com.dca.utilities.Actions.selectDDLVisibletext(transferDirectionDD, TransferDirection);
    }

    public void setStartDate(String StartDate) {
        startDate.sendKeys(StartDate);
    }

    public void setSchdendDate(){SchdendDate.click();}

    public void setTransferScheduleDD(String TransferSchedule) {
        com.dca.utilities.Actions.selectDDLVisibletext(transferScheduleDD, TransferSchedule);
    }

    public void setFileTransferDetailsTab() throws Exception {
        Thread.sleep(500);
        fileTransferDetailsTab.click();
    }

    public void setPrimaryTransferDD(String PrimaryTransfer) {
        com.dca.utilities.Actions.selectDDLVisibletext(primaryTransferDD, PrimaryTransfer);
    }

    public void setAlternateTransferDD(String AlternateTransfer) {
        com.dca.utilities.Actions.selectDDLVisibletext(alternateTransferDD, AlternateTransfer);
    }

    public void setFTPhostproviderDD(String FTPhostProvider) {
        com.dca.utilities.Actions.selectDDLVisibletext(FTPhostproviderDD, FTPhostProvider);
    }

    public void setDataTransferTypeDD(String DataTransferType) {
        com.dca.utilities.Actions.selectDDLVisibletext(dataTransferTypeDD, DataTransferType);
    }

    public void setMftDD(String MFT) {
        com.dca.utilities.Actions.selectDDLVisibletext(mftDD, MFT);
    }

    public void setMftcountryDD(String MFTCountry) {
        com.dca.utilities.Actions.selectDDLVisibletext(mftcountryDD, MFTCountry);
    }

    public void setMftWorkflowDD(String MFTWorkFlow) {
        com.dca.utilities.Actions.selectDDLVisibletext(mftWorkflowDD, MFTWorkFlow);
    }

    public void setFTPTypeDD(String FTPType) {
        com.dca.utilities.Actions.selectDDLVisibletext(FTPTypeDD, FTPType);
    }

    public void setAlternateMethod() {

        //AlternateMethod.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AlternateMethod);
        AlternateMethod.click();
    }

    public void setEmailText(String email) {
        emailText.sendKeys(email);
    }

    public void setEmailConfirmText(String emailconfirm) {
        emailConfirmText.sendKeys(emailconfirm);
    }

    public void setFileSpecTab() throws Exception {
        Thread.sleep(500);
        //fileSpecTab.click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fileSpecTab);
        fileSpecTab.click();
    }

    /*public void setSpecTemplate(String SpecificationTemplate) {
        com.dca.utilities.Actions.selectDDLVisibletext(specTemplate, SpecificationTemplate);
    }*/

    public void setSpecTemplate(String SpecificationTemplate) throws Exception {

        List<WebElement> templates = specTemplate;

        for(WebElement templateList : templates)
        {
            if(templateList.getText().contains(SpecificationTemplate))
            {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", templateList);
                templateList.click();
            }

        }
    }


    public void setFileEncryptChek() {
        fileEncryptChek.click();
    }

    public void setEncryptedBy(String Encrypt) throws Exception{
        Actions.selectDDLVisibletext(EncryptedBy, Encrypt);
    }

    public void setActivationDetailsTab() throws Exception {
        Thread.sleep(500);
        ActivationDetailsTab.click();
    }

    public void setActivateImmediate() throws Exception {
        activateImmediate.click();
    }

    public void setEndDate() throws Exception{
        endDate.click();
    }

    public void setActivationendDate(String ActivationEndDate)  throws Exception{
        activationendDate.sendKeys(ActivationEndDate);
    }

    public void setSaveBtn() throws Exception {
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",saveBtn);
        saveBtn.click();
        Screenshots.captureScreenShot(driver,"9.DT created");
    }

    public void setsaveOrg() throws Exception {
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",saveOrg);
        saveOrg.click();
    }

    public void setGetId() throws Exception {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getId);
        String Txt = getId.getText();
        System.out.println(Txt);
        System.out.println(" Organisation modified successfully ");
        System.out.println("The ID of modified organisation is " + Txt);
        System.out.println("======================================================");
        //String actualOrgId= GDP.toString().substring(18,23);
    }

    public void setScreenshot() throws Exception {
        Screenshots.captureScreenShot(driver, "10.DataTransferPage");
    }

    public void setModifyPage() throws Exception {
        setSaveBtn();
        Thread.sleep(2000);
        Screenshots.captureScreenShot(driver, "11.Modified Organisation Page");
    }
}
