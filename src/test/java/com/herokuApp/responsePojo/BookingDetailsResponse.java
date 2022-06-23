package com.herokuApp.responsePojo;

import lombok.Data;

@Data
public class BookingDetailsResponse {

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;

    private BookingDates bookingdates;
    private String additionalneeds;


@Data
    class BookingDates{
        String checkin;
        String checkout;
    }
}
