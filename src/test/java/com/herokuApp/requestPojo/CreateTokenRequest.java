package com.herokuApp.requestPojo;

import lombok.Data;
import lombok.Setter;

@Data
public class CreateTokenRequest {

    private String username;
    private String password;

}
