/**
 * Created by husiq on 7/7/2016.
 */
import com.sun.org.apache.xerces.internal.util.URI;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.net.MalformedURLException;

public class RemoteHelloWorld {
    public static void main(String[] argv)throws MalformedURLException{
        DesiredCapabilities ffDesiredcap = DesiredCapabilities.firefox();
//        DesiredCapabilities chromeDesiredcap = DesiredCapabilities.chrome();
//        DesiredCapabilities ieDesiredcap = DesiredCapabilities.internetExplorer();
        ffDesiredcap.setCapability("firefox_binary","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
        WebDriver wd = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),ffDesiredcap);
        wd.get("http://www.so.com");
//        Thread.sleep(1200);
        System.out.println(wd.getCurrentUrl());
        wd.quit();
    }
}
