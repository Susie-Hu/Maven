/**
 * Created by husiq on 7/5/2016.
 */
package com.selenium.Glen;

import com.sun.org.apache.xerces.internal.util.URI;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.SystemClock;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestHelloWorld {
    public static void main(String[] argv){
//        System.setProperty ( "webdriver.firefox.bin" , "E:/Program Files/Mozilla Firefox/firefox.exe" );
//        WebDriver driver = new InternetExplorerDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\husiq\\Documents\\software\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.windowsMaximize();
        driver.get("http://www.baidu.com/");
        WebElement keyword = driver.findElement(By.id("kw"));
        keyword.sendKeys("selenium123");
        keyword.submit();
        System.out.println("Page title is : "+ driver.getTitle());

        (new WebDriverWait(driver,10)).until(new ExpectedCondition<Boolean>(){
            public Boolean apply(WebDriver d){
                return d.getTitle().toLowerCase().startsWith("selenium123");
            }
        });
        System.out.println("Page title is : "+ driver.getTitle());
        driver.quit();

    }
}
