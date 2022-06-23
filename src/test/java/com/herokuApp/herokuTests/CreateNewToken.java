package com.herokuApp.herokuTests;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.herokuApp.client.HerokuClient;
import com.herokuApp.responsePojo.BookingDetailsResponse;
import com.herokuApp.responsePojo.CreateTokenResponse;
import org.testng.annotations.Test;

public class CreateNewToken {


    @Test
    public void token() throws JsonProcessingException {
        HerokuClient herokuClient = new HerokuClient();
        CreateTokenResponse cr = herokuClient.createNewToken("admin","password123","https://restful-booker.herokuapp.com","/auth");
        System.out.println(cr.toString());
    }


    @Test
    public void getIt() throws JsonProcessingException {
        HerokuClient herokuClient = new HerokuClient();
        BookingDetailsResponse bookingDetailsResponse = herokuClient.getBooking("1836","https://restful-booker.herokuapp.com");
        System.out.println(bookingDetailsResponse.toString());
    }
}
