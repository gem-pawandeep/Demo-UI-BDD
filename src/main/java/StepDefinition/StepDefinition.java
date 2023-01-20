package StepDefinition;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.gemini.generic.ui.utils.DriverAction;
import com.gemini.generic.ui.utils.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import Locators.locator;
import java.util.ArrayList;

public class StepDefinition {
    @Given("^user clicks on logIn button$")
    public void logIn() {
        DriverAction.waitUntilElementAppear(locator.logIn,20);
        DriverAction.click(locator.logIn, "Login");
        DriverAction.waitUntilElementAppear(locator.close,20);
        DriverAction.click(locator.close,"Close");
    }

    @Then("^enter (.+) and (.+)")
    public void loginPage(String Username, String Password) {
        DriverAction.click(locator.logIn,"Login");
        DriverAction.waitUntilElementAppear(locator.username,20);
        DriverAction.typeText(locator.username, Username, "User-Name");
        DriverAction.waitUntilElementAppear(locator.password,20);
        DriverAction.typeText(locator.password, Password,"Password");
        DriverAction.click(locator.eye, "Eye button");
        DriverAction.waitUntilElementAppear(locator.eyeclose,20);
        DriverAction.click(locator.eyeclose, "Close eye button");
    }

    @Then("^user navigates back after loggin in$")
    public void logout() {
        DriverAction.waitUntilElementAppear(locator.LoginButton,20);
        DriverAction.click(locator.LoginButton,"Login");
        GemTestReporter.addTestStep("Login Validation", " Successfully logged in", STATUS.PASS, DriverAction.takeSnapShot());
        DriverAction.navigateBack();
    }

    @Given("^validating url of jewel (.+)$")
    public void jewelurl(String expectedUrl) {
        String s1 = DriverAction.getCurrentURL();
        if (s1.equals(expectedUrl)) {
            GemTestReporter.addTestStep("Url Validation", "Successful<br>Expected URL: " + expectedUrl + "<br>Actual URL: " + s1, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Url Validation", "Unsuccessful<br>Expected URL: " + expectedUrl + "<br>Actual URL: " + s1, STATUS.PASS);
        }
    }

    @Then("^click on pricing$")
    public void pricing() {
        DriverAction.waitUntilElementAppear(locator.pricing,20);
        DriverAction.click(locator.pricing, "Pricing");
    }

    @Then("^validate pricing url (.+)$")
    public void pricingurl(String expectedPurl){
        String s2 = DriverAction.getCurrentURL();
        if (s2.equals(expectedPurl)) {
            GemTestReporter.addTestStep("Pricing Url Validation", "Successful<br>Expected URL: " + expectedPurl + "<br>Actual URL: " + s2, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Pricing Url Validation", "Unsuccessful<br>Expected URL: " + expectedPurl + "<br>Actual URL: " + s2, STATUS.FAIL);
        }
    }

    @Given("^clicking on pricing and checking for main heading (.+)$")
    public void clickpricing(String pricingHead) {
        DriverAction.waitUntilElementAppear(locator.pricing,20);
        DriverAction.click(locator.pricing,"Pricing");
        String s3 = DriverAction.getElementText(locator.pricingheading);
        if (s3.equals(pricingHead)) {
            GemTestReporter.addTestStep("Pricing heading validation", "Successful<br>Expected heading: " + pricingHead + "<br>Actual heading: " + s3, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Pricing heading validation", "Unsuccessful<br>Expected heading: " + pricingHead + "<br>Actual heading: " + s3, STATUS.FAIL);
        }
    }

    @Then("^checking for subheading (.+)$")
    public void subheading(String pricingSubHead) throws Exception {
        String s4 = DriverAction.getElementText(locator.pricingsubheading);
        if (s4.equals(pricingSubHead)) {
            GemTestReporter.addTestStep("Pricing sub-heading validation", "Successful<br>Expected sub-heading: " + pricingSubHead + "<br>Actual sub-heading: " + s4, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Pricing sub-heading validation", "Unsuccessful<br>Expected sub-heading: " + pricingSubHead + "<br>Actual sub-heading: " + s4, STATUS.FAIL);
        }
    }

    @Then("^checking for text (.+)$")
    public void text(String Text){
        String s4 = DriverAction.getElementText(locator.pricingcontent);
        if (s4.equals(Text)) {
            GemTestReporter.addTestStep("Pricing content validation", "Successful <br>Expected content: " + Text + "<br>Actual content: " + s4, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Pricing content validation", "Unsuccessful <br>Expected content: " + Text + "<br>Actual content: " + s4, STATUS.FAIL);
        }
    }

    @Given("^clicking on jewel again validating main heading (.+)$")
    public void jewelhead(String mainHeading) {
        DriverAction.waitUntilElementAppear(locator.jewelheading,20);
        String s5 = DriverAction.getElementText(locator.jewelheading);
        if (s5.equals(mainHeading)) {
            GemTestReporter.addTestStep("Jewel heading validation", "Successful<br>Expected heading: " + mainHeading + "<br>Actual heading: " + s5, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Jewel heading validation", "Unsuccessful<br>Expected heading: " + mainHeading + "<br>Actual heading: " + s5, STATUS.FAIL);
        }
    }

    @Then("^validating subheading of jewel (.+)$")
    public void jewelShead(String subHeading) {
        String s6 = DriverAction.getElementText(locator.jewelsubheading);
        if (s6.equals(subHeading)) {
            GemTestReporter.addTestStep("Jewel content validation", "Successful<br>Expected content: " + subHeading + "<br>Actual content: " + s6, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Jewel content validation", "Unsuccessful<br>Expected content: " + subHeading + "<br>Actual content: " + s6, STATUS.FAIL);
        }
    }

    @Given("^validating whatisjewel (.+)$")
    public void whatisjewel(String whatisjewel) throws Exception {
        DriverAction.pageScroll(500, 500);
        DriverAction.waitUntilElementAppear(locator.whatisjewel,20);
        String s7 = DriverAction.getElementText(locator.whatisjewel);
        if (s7.equals(whatisjewel)) {
            GemTestReporter.addTestStep("Heading validation", "Successful<br>Expected heading: " + whatisjewel + "<br>Actual heading: " + s7, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Heading validation", "Unsuccessful<br>Expected heading: " + whatisjewel + "<br>Actual heading: " + s7, STATUS.FAIL);
        }
    }

    @Then("^validating about us (.+)$")
    public void aboutus(String aboutus) {
        String s8 = DriverAction.getElementText(locator.aboutus);
        if (s8.equals(aboutus)) {
            GemTestReporter.addTestStep("About-us validation", "Successful<br>Expected content: " + aboutus + "<br>Actual content: " + s8, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("About-us validation", "Unsuccessful<br>Expected content: " + aboutus + "<br>Actual content: " + s8, STATUS.PASS);
        }
    }

    @Then("^validating content (.+)$")
    public void content(String content) {
        String s9 = DriverAction.getElementText(locator.content);
        if (content.contains(s9)) {
            GemTestReporter.addTestStep("Content validation", "Successful<br>Expected content: " + content + "<br>Actual content: " + content, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Content validation", "Unsuccessful<br>Expected content: " + content + "<br>Actual content: " + s9, STATUS.FAIL);
        }
    }

    @Given("^validating view report (.+)$")
    public void viewreport(String viewreport) {
        DriverAction.pageScroll(500, 500);
        DriverAction.waitUntilElementAppear(locator.viewreport,20);
        String s10 = DriverAction.getElementText(locator.viewreport);
        if (s10.contains(viewreport)) {
            GemTestReporter.addTestStep("View report validation", "Successful<br>Expected heading: " + s10 + "<br>Actual content: " + s10, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("View report validation", "Unsuccessful<br>Expected heading: " + s10 + "<br>Actual content: " + s10, STATUS.FAIL);
        }
    }

    @Then("^validating view reportC (.+)$")
    public void viewcontent(String viewcontent) {
        String s11 = DriverAction.getElementText(locator.viewreportcontent);
        s11 = s11.replace("\n", "");
        if (viewcontent.contains(s11)) {
            GemTestReporter.addTestStep("View report validation", "Successful<br>Expected content: " + viewcontent + "<br>Actual content: " + viewcontent, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("View report validation", "Unsuccessful<br>Expected content: " + viewcontent + "<br>Actual content: " + s11, STATUS.FAIL);
        }
    }

    @Given("^validating run test (.+)$")
    public void runtest(String runtest) {
        DriverAction.pageScroll(1000, 1000);
        String s12 = DriverAction.getElementText(locator.runtest);
        if (s12.equals(runtest)) {
            GemTestReporter.addTestStep("Run Test-suite validation", "Successful<br>Expected content: " + s12 + "<br>Actual content: " + s12, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Run Test-suite validation", "Unsuccessful<br>Expected content: " + s12 + "<br>Actual content: " + s12, STATUS.FAIL);
        }
    }

    @Then("^validating run testC (.+)$")
    public void runsuite(String runcontentC) {
        String s13 = DriverAction.getElementText(locator.runtestc);
        s13 = s13.replace("\n", "");
        if (runcontentC.contains(s13)) {
            GemTestReporter.addTestStep("Run Test-suite content validation", "Successful<br>Expected content: " + s13 + "<br>Actual content: " + s13, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Run Test-suite content validation", "Unsuccessful<br>Expected content: " + s13 + "<br>Actual content: " + runcontentC, STATUS.FAIL);
        }
    }

    @Given("^click on facebook logo validate url (.+)$")
    public void facebook(String facebook) throws Exception {
        DriverAction.pageScroll(2000, 2000);
        DriverAction.click(locator.facebook,"Facebook");
        ArrayList<String> newTb = new ArrayList<>(DriverAction.getWindowHandles());
        DriverAction.switchToWindow(newTb.get(1));
        DriverAction.waitSec(2);
        GemTestReporter.addTestStep("Current-Page","Facebook",STATUS.PASS,DriverAction.takeSnapShot());
        String s15 = DriverAction.getCurrentURL();
        if (s15.contains("facebook")) {
            GemTestReporter.addTestStep("Facebook Url Validation", "Successful<br>Expected URL: " + facebook + "<br>Actual URL: " + facebook, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Facebook Url Validation", "Unsuccessful<br>Expected URL: " + facebook + "<br>Actual URL: " + s15, STATUS.FAIL);
        }
        DriverManager.getWebDriver().close();
        GemTestReporter.addTestStep("Closing current Tab", "Successful", STATUS.PASS);
        DriverAction.switchToWindow(newTb.get(0));

    }

    @Given("click on twitter logo and validate url (.+)$")
    public void twitter(String twitter){
        DriverAction.pageScroll(2000, 2000);
        DriverAction.waitUntilElementAppear(locator.twitter,20);
        DriverAction.click(locator.twitter,"Twitter");
        ArrayList<String> newTb1 = new ArrayList<>(DriverAction.getWindowHandles());
        DriverAction.switchToWindow(newTb1.get(1));
        DriverAction.waitSec(2);
        GemTestReporter.addTestStep("Current-Page","Twitter",STATUS.PASS,DriverAction.takeSnapShot());
        String s16 = DriverAction.getCurrentURL();
        if (s16.contains(twitter)) {
            GemTestReporter.addTestStep("Twitter Url Validation", "Successful<br>Expected URL: " + twitter + "<br>Actual URL: " + twitter, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Twitter Url Validation", "Unsuccessful<br>Expected URL: " + twitter + "<br>Actual URL: " + s16, STATUS.FAIL);
        }
        DriverManager.getWebDriver().close();
        DriverAction.waitSec(2);
        GemTestReporter.addTestStep("Close current tab", "Successful", STATUS.PASS);
        DriverAction.switchToWindow(newTb1.get(0));
    }

    @Given("^click on instagram logo and validate url (.+)$")
    public void instagram(String insta) {
        DriverAction.pageScroll(2000, 2000);
        DriverAction.click(locator.instagram,"Instagram");
        ArrayList<String> newTb2 = new ArrayList<>(DriverAction.getWindowHandles());
        DriverAction.switchToWindow(newTb2.get(1));
        DriverAction.waitSec(2);
        GemTestReporter.addTestStep("Current-Page","Instagram",STATUS.PASS,DriverAction.takeSnapShot());
        String s17 = DriverAction.getCurrentURL();
        if (s17.contains(insta)) {
            GemTestReporter.addTestStep("Instagram Url Validation", "Successful<br>Expected URL: " + insta + "<br>Actual URL: " + insta, STATUS.PASS);
        } else {
            GemTestReporter.addTestStep("Instagram Url Validation", "Unsuccessful<br>Expected URL: " + insta + "<br>Actual URL: " + s17, STATUS.FAIL);
        }
        DriverManager.getWebDriver().close();
        GemTestReporter.addTestStep("Close current tab", "Successful", STATUS.PASS);
        DriverAction.switchToWindow(newTb2.get(0));
    }
}





