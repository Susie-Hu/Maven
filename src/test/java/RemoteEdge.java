/**
 * Created by husiq on 7/22/2016.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;


public class RemoteEdge {
    public static void main(String[] argv)throws MalformedURLException {
        //remote
        DesiredCapabilities edgeDesiredcap = DesiredCapabilities.edge();
        edgeDesiredcap.setCapability("webdriver.edge.driver","C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
//        edge.setVersion("2.0.0.0");
        RemoteWebDriver wd = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),edgeDesiredcap);
        wd.get("www.so.com");
        System.out.println(wd.getCurrentUrl());
        wd.quit();
        //local
//        System.setProperty("webdriver.edge.driver","C:\\Program Files (x86)\\Microsoft Web Driver\\MicrosoftWebDriver.exe");
//        EdgeOptions options = new EdgeOptions();
//        options.setPageLoadStrategy("Eager");
//        WebDriver driver = new EdgeDriver();
//        driver.get("http://www.so.com");
//        System.out.println(driver.getCurrentUrl());
//        driver.quit();

    }
}
