package com.herokuapp.client;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.ArrayList;
import java.util.List;

public class GetClient {

    public Response getCall(String basePath, String baseUrl, String paramName, String param){
        Response response = RestAssured.given()
                .basePath("")
                .baseUri(baseUrl)
                //.pathParam(paramName,param)
                .log().all()
                .when()
                .get("booking"+"/1836")
                .then()
                .extract().response();

        return response;



    }
}
