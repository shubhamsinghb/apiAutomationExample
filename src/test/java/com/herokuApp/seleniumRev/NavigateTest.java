package com.herokuApp.seleniumRev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateTest {


    @Test
    public void navigateTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.navigate().to("https://demo.actitime.com/login.do");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("pwd")).sendKeys("manager");
        driver.findElement(By.id("loginButton")).click();
        Thread.sleep(50000);
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();
        driver.close();

    }
}
