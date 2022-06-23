package com.herokuapp.client;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostClient {

    public Response postCall(HTTPHeader header, String baseUrl, String baseUri, String requestBody){
        RequestSpecification spec = RestAssured.given().basePath("");
        Response response = RestAssured.
                given().
                headers(header.getHeaderMap()).
                body(requestBody).
                basePath(baseUrl).
                baseUri(baseUri).then().log().all().
                when().
                post().then().extract().response();

        return response;

    }

}
