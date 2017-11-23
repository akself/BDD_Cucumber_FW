        package com.dca.objects;

        import com.dca.config.TestConfiguration;
        import gherkin.lexer.Ca;
        import net.sourceforge.htmlunit.corejs.javascript.regexp.SubString;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import com.dca.config.TestConfiguration;
        import com.dca.utilities.Actions;
        import com.dca.utilities.Screenshots;
        import cucumber.api.java.gl.E;
        import org.openqa.selenium.By;
        import org.openqa.selenium.JavascriptExecutor;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import java.sql.Connection;
        import java.sql.DriverManager;
        import java.sql.ResultSet;
        import java.sql.Statement;
        import java.util.List;
        import org.openqa.selenium.support.ui.Select;


        /**
         * Created by Mahendra.Singh on 7/12/2017.
         */
        public class Installation_Page extends TestConfiguration {
            public static String Oradriver = "oracle.jdbc.driver.OracleDriver";
            //public static String SITURL = "jdbc:oracle:thin:@cdtsdcpt-scan.rxcorp.com:1521/TDCPAD00.world";
            public static String UATURL = "jdbc:oracle:thin:@cdtsdcpu-scan.rxcorp.com:1521/UDCPAD00";
            public static String username = "DCA_DATA";
            public static String password = "DCA_DATA";

            WebDriver driver = getDriver();
            WebDriverWait wait = new WebDriverWait(driver,30);


            @FindBy (xpath = "//translate[contains(.,'DCA Installations')]")
            private WebElement installationPage;

            @FindBy (xpath = "//translate[contains(.,'Add New')]")
            private WebElement addNewInstallation;

            @FindBy (xpath = "//translate[contains(.,'Add New Installation')]")
            private WebElement newInstallationPage;

            @FindBy (xpath = "//select[@name='confCountry']")
            private WebElement installationCountry;

            @FindBy (xpath = "//select[@name='confOrganisation']//option")
            //private WebElement installationOrgNm;
            private List<WebElement> installationOrgNm;

            @FindBy (xpath = "//select[@name='confOrgLocation']")
            private WebElement installationOrgLoc;

            @FindBy (xpath = "//select[@name='confDataDomain']")
            private WebElement installationOrgDmn;

            @FindBy (xpath = "//button[contains(.,' Start Configuration ')]")
            private WebElement startConfigBtn;

            @FindBy (xpath = "//translate[contains(.,'Modify DCA Installation And Configuration')]")
            private WebElement modifyInstallPage;

            @FindBy (xpath = "//a[contains(.,'Environment Details')]")
            private WebElement envDetailsTab;

            @FindBy (xpath = "//select[@name='osProvider']")
            private WebElement osProvider;

            @FindBy (xpath = "//select[@name='os']")
            private WebElement os;

            @FindBy (xpath = "//select[@name='osType']")
            private WebElement osType;

            @FindBy (xpath = "//select[@name='serverType']")
            private WebElement serverTyp;

            @FindBy (xpath = "//select[@name='serverLocationCountry']")
            private WebElement serverLocCntry;

            @FindBy (xpath = "//input[@name='relationOrganisation']")
            private WebElement serverCity;

            @FindBy (css = ".space-before.ng-pristine.ng-valid.ng-not-empty.ng-touched")
            private WebElement workingHrs;

            @FindBy (xpath = "//a[contains(.,'Environment Configuration')]")
            private WebElement envConfigTab;

            @FindBy (xpath = "//input[@name='numOfCores']")
            private WebElement coresNumber;

            @FindBy (xpath = ".//*[@id='content']/div/div/div/div[2]/ui-view/div/div[2]/div[1]/form/div[1]/div[2]/ims-input-select/div/div/input")
            private WebElement clockRate;

            @FindBy (xpath = ".//*[@id='content']/div/div/div/div[2]/ui-view/div/div[2]/div[1]/form/div[1]/div[3]/ims-input-select/div/div/input")
            private WebElement allocMemory;

            @FindBy (xpath = ".//*[@id='content']/div/div/div/div[2]/ui-view/div/div[2]/div[1]/form/div[1]/div[4]/ims-input-select/div/div/input")
            private WebElement allocDisc;

            @FindBy (xpath = "//select[@name='antivirusVendor']")
            private WebElement antivirusvendor;

            @FindBy (xpath = "//select[@name='antivirusVersion']/option")
            private List<WebElement> antivirusVersion;

            @FindBy (xpath = "//a[contains(.,'Installation Details')]")
            private WebElement installationDetailstab;

            @FindBy (xpath = "//select[@name='installerVersion']")
            private WebElement installerVersion;

            @FindBy (xpath = "//select[@name='installationPartyType']")
            private WebElement installerParty;

            @FindBy (xpath = "//select[@name='installationPartyName']")
            private WebElement installerPartyName;

            @FindBy (xpath = "//a[contains(.,'Template')]")
            private WebElement templateTab;

            @FindBy (xpath = "//select[@name='template']/option")
            private List<WebElement> template;

            @FindBy(xpath = ".//h4/a/span/div[2]/select")
            private WebElement dataTransfer;

            @FindBy (xpath = ".//*[@id='content']/div/div/div/div[3]/ui-view/div/button[1]")
            private WebElement saveInstallation;

            @FindBy (xpath = "//translate[contains(.,'Preview DCA Installation And Configuration')]")
            private WebElement previewInstallation;

            @FindBy(xpath = "//button[contains(.,' Cancel ')]")
            private WebElement CancelBtn;

            @FindBy (xpath = "//h3/small/span[1]")
            //private WebElement CreatedinstallationId;
            public static WebElement CreatedinstallationId;

            @FindBy (xpath = "//select[@name='country']")
            private WebElement searchCountry;

            @FindBy (xpath = "//input[@ims-input='Organisation Name']")
            private WebElement searchOrg;

            @FindBy (xpath = "//input[@ims-input='Installation Location']")
            private WebElement searchInstallLoc;

            @FindBy (xpath = "//button[contains(.,' Search  ')]")
            private WebElement searchButton;

            @FindBy (xpath = "//table/tbody/tr/td[6]")
            private WebElement SearchResultOrgName;

            public Installation_Page(WebDriver driver) {
                this.driver = driver;
                PageFactory.initElements(driver, this);
            }

            public void setInstallationPage() throws Exception {
                String text = installationPage.getText();
                String title = "DCA Installations";
                System.out.println("=======================================================================");
                System.out.println((title.equals(text)) ? "Navigated to DCA Installations page " : "Could not Navigated to DCA Installations page");
                System.out.println("=======================================================================");

            }

            public void setAddNewInstallation() throws Exception {
                addNewInstallation.click();
            }

            public void setNewInstallationPage() throws Exception {
                String text = newInstallationPage.getText();
                String title = "Add New Installation";
                System.out.println("=======================================================================");
                System.out.println((title.equals(text)) ? "Navigated to Add New Installation page " : "Could not Navigated to Add New Installation page");
                System.out.println("=======================================================================");

            }

            public void setInstallationCountry(String country) throws Exception {
               com.dca.utilities.Actions.selectDDLVisibletext(installationCountry,country);
            }

            public void setInstallationOrgNm(String orgname) throws Exception {


                List<WebElement> droporgs = installationOrgNm;

                for(WebElement el : droporgs)
                {
                    if(el.getText().contains(orgname))
                    {
                        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", el);
                        el.click();
                    }

                }

            }

            public void setInstallationOrgLoc(String location) throws Exception {
                com.dca.utilities.Actions.selectDDLVisibletext(installationOrgLoc,location);

            }

            public void setInstallationOrgDmn(String domain) throws Exception {
                com.dca.utilities.Actions.selectDDLVisibletext(installationOrgDmn,domain);
            }

            public void setStartConfigBtn() throws Exception {
                startConfigBtn.click();

            }

            public void setModifyInstallPage() throws Exception {
                String text = modifyInstallPage.getText();
                String title = "Modify DCA Installation And Configuration";
                System.out.println("=======================================================================");
                System.out.println((title.equals(text)) ? "Navigated to Modify DCA Installation And Configuration page " : "Could not Navigated to Modify DCA Installation And Configuration page");
                System.out.println("=======================================================================");

            }

            public void setEnvDetailsTab() throws Exception {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", envDetailsTab);
                envDetailsTab.click();

            }

            public void setOsProvider(String provider) throws Exception {
                  com.dca.utilities.Actions.selectDDLVisibletext(osProvider,provider);
            }

            public void setOS(String operSys) throws Exception {
                com.dca.utilities.Actions.selectDDLVisibletext(os,operSys);

            }

            public void setOsType(String ostyp) throws Exception {
                com.dca.utilities.Actions.selectDDLVisibletext(osType,ostyp);

            }

            public void setServerTyp(String serverType) throws Exception {
                com.dca.utilities.Actions.selectDDLVisibletext(serverTyp,serverType);

            }

            public void setServerLocCntry(String serverLoc) throws Exception {
                com.dca.utilities.Actions.selectDDLVisibletext(serverLocCntry,serverLoc);

            }

            public void setServerCity(String serverCty) throws Exception {
                serverCity.sendKeys(serverCty);

            }

            public void setWorkingHrs() throws Exception {
                workingHrs.click();

            }

            public void setEnvConfigTab() throws Exception {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", envConfigTab);
                envConfigTab.click();

            }

            public void setCoresNumber(String cores) throws Exception {
                coresNumber.sendKeys(cores);

            }

            public void setClockRate(String clkrate) throws Exception {
                clockRate.sendKeys(clkrate);

            }

            public void setAllocMemory(String allocMem) throws Exception {
                allocMemory.sendKeys(allocMem);

            }

            public void setAllocDisc(String allocDsc) throws Exception {
                allocDisc.sendKeys(allocDsc);

            }

            public void setAntivirusvendor(String antivirusven) throws Exception {
                com.dca.utilities.Actions.selectDDLVisibletext(antivirusvendor,antivirusven);

            }

            public void setAntivirusVersion(String antivirusvr) throws Exception {

                List<WebElement> versionsDrop = antivirusVersion;

                for(WebElement ele : versionsDrop)
                {
                    if(ele.getText().contains(antivirusvr))
                    {
                        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
                        ele.click();
                    }

                }

            }

            public void setInstallationDetailstab() throws Exception {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", installationDetailstab);
                installationDetailstab.click();

            }

            public void setInstallerVersion(String installVrs) throws Exception {
                com.dca.utilities.Actions.selectDDLVisibletext(installerVersion,installVrs);

            }

            public void setInstallerParty(String installPrty) throws Exception {
                com.dca.utilities.Actions.selectDDLVisibletext(installerParty,installPrty);

            }

            public void setInstallerPartyName(String installPrtyNm) throws Exception {
                com.dca.utilities.Actions.selectDDLVisibletext(installerPartyName,installPrtyNm);

            }

            public void setTemplateTab() throws Exception {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", templateTab);
                templateTab.click();

            }

            public void setTemplate(String tmplate) throws Exception {

                List<WebElement> templates = template;

                for(WebElement templateList : templates)
                {
                    if(templateList.getText().contains(tmplate))
                    {
                        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", templateList);
                        templateList.click();
                    }

                }
            }

            public void setDataTransfer(String dtType) throws Exception{
                com.dca.utilities.Actions.selectDDLVisibletext(dataTransfer,dtType);
            }

            /*public void setDataTransfer(String dtType) throws Exception {

                List<WebElement> DTtypes = dataTransfer;

                for(WebElement element : DTtypes)
                {
                    if(element.getText().equals(dtType))
                    {
                        element.click();
                    }

                }
            }*/

            public void setSaveInstallation() throws Exception {

                saveInstallation.click();

            }

            public void setPreviewInstallation() throws Exception {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", previewInstallation);
                String text = previewInstallation.getText();
                String title = "Preview DCA Installation And Configuration";
                System.out.println("=======================================================================");
                System.out.println((title.equals(text)) ? "Navigated to Preview DCA Installation And Configuration page " : "Could not Navigated to Preview DCA Installation And Configuration page");
                System.out.println("=======================================================================");
                Screenshots.captureScreenShot(driver, "19.New Installation Created");

            }

            public void setCancelBtn() throws Exception{
                CancelBtn.click();
            }

            public String setCreatedinstallationId() {//throws Exception {
                String InsID = CreatedinstallationId.getText();
                String createdInsID = InsID.substring(17,InsID.length());
                System.out.println("Created installation id->" +createdInsID );
                return createdInsID;
            }

            public void setSearchCountry(String srchCountry) throws Exception {
                com.dca.utilities.Actions.selectDDLVisibletext(searchCountry,srchCountry);

            }

            public void setSearchOrg(String srchOrg) throws Exception {
                searchOrg.sendKeys(srchOrg);

            }

            public void setSearchInstallLoc(String srchInstallLoc) throws Exception {
                searchInstallLoc.sendKeys(srchInstallLoc);

            }

            public void setSearchButton() throws Exception {
                searchButton.click();
            }

            public void setSearchResultOrgName(String srchOrg) throws Exception {
                String newInstallOrg=srchOrg.toString();
                String text = SearchResultOrgName.getAttribute("innerHTML");
                System.out.println("Searched Installed orgName : " + text );
                System.out.println("Newly Installed orgName : " + newInstallOrg);
                System.out.println((text.contains(newInstallOrg)) ? "New Installation Searched " : "Could not create new Installation");
                Screenshots.captureScreenShot(driver, "20.New Installation search");

            }

            public void Oracle_installation_Validation() throws Exception {
                System.out.println("*--Validating the newly created Installation from the DataBase--*");
                Class.forName(Oradriver);
                Connection conn = DriverManager.getConnection(UATURL, username, password);
                System.out.println("Connected to the Database");
                Statement st = conn.createStatement();
                String id = CreatedinstallationId.getText();
                String installation_id=id.substring(17,id.length());
                String sqlStr = "select * from DC_DCA_INSTALLATION where INSTALLATION_ID='" + installation_id + "'";
                //System.out.println(sqlStr);
                ResultSet rs = st.executeQuery(sqlStr);
                while (rs.next()){
                    String db_INSTALLATION_ID = rs.getString("INSTALLATION_ID");
                    System.out.println("The INSTALLATION_ID of the newly created INSTALLATION from DataBase is " + db_INSTALLATION_ID);
                    System.out.println("======================================================");
                }
            }
        }
