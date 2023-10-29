package com.herokuApp.seleniumRev;

import org.testng.annotations.Test;

public class DataProvidertest {

    @Test(dataProviderClass = ExamplaDataProviderclass.class , dataProvider = "dataProExample")
    public void testDataPro(String name, int age, String company){
        System.out.println(name+ " aged "+ age + " works at " + company );
    }
}
