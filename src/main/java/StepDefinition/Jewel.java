package StepDefinition;

import com.gemini.generic.exception.GemException;
import com.gemini.generic.ui.utils.DriverManager;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Jewel {
    @Before
    public void start() throws GemException, MalformedURLException {
        /*if (GemJarGlobalVar.browserInTest.equals("grid")) {
            String remoteURL = GemJarUtils.getGemJarKeyValue("remoteDriverUrl");
            ChromeOptions options = new ChromeOptions();
            options.setHeadless(true);
            options.setAcceptInsecureCerts(true);
//            options.setCapability("resolution", "1296x696");
            WebDriver driver = new RemoteWebDriver(new URL(remoteURL), options);
            DriverManager.setWebDriver(driver);
            DriverAction.launchUrl(GemJarUtils.getGemJarConfigData(GemJarConstants.LAUNCH_URL));
//        DriverAction.launchUrl("https://www.amazon.com/");
            DriverAction.refresh();
            DriverAction.maximizeBrowser();
            DriverAction.setBrowserSize(1296,696);
            DriverAction.setImplicitTimeOut(Long.parseLong(GemJarGlobalVar.implicitTime));
            DriverAction.setPageLoadTimeOut(Long.parseLong(GemJarGlobalVar.pageTimeout));
            DriverAction.setScriptTimeOut(Long.parseLong(GemJarGlobalVar.scriptTimeout));
        } else {
            DriverManager.setUpBrowser();
            DriverAction.setBrowserSize(1296,696);
        }*/
        DriverManager.setUpBrowser();

    }
}
