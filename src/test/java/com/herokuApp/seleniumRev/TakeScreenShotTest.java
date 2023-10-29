package com.herokuApp.seleniumRev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class TakeScreenShotTest {

    @Test
    public void takeScreenShot() throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().window().maximize();
        TakesScreenshot ts= (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);

        File destFile= new File("ScreenShot.png");
        FileUtils.copyFile(srcFile,destFile);
        driver.close();
    }
}
