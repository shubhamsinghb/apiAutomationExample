package com.herokuApp.seleniumRev;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class UserNameAndPasswordAllignmrntTest {


    @Test
    public void alignmentTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement element= driver.findElement(By.xpath("//input[@placeholder='Username']"));
        int y_co_username= element.getLocation().getX();
        WebElement element_p= driver.findElement(By.xpath("//input[@placeholder='Password']"));
        int y_co_pass = element_p.getLocation().getX();
        System.out.println(y_co_username + "   " + y_co_pass);
        SoftAssert as= new SoftAssert();
        as.assertEquals(y_co_username,y_co_pass);


    }

    @Test
    public void checkBoolArr(){
        boolean[] arr= new boolean[3];
        System.out.println(arr[1]);
    }
}
