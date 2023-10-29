package com.herokuApp.seleniumRev;

import org.testng.annotations.DataProvider;

public class ExamplaDataProviderclass {

    @DataProvider
    public Object[][] dataProExample(){
        return new Object[][]{{"Shubham" , 33, "Toplyne"},
                {"Satya" , 34, "Concentrix"}};
    }

}
