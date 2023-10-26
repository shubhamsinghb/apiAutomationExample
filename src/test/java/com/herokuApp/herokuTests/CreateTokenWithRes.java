package com.herokuApp.herokuTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CreateTokenWithRes {


    public Response  directResponse(){

        String body= "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        Response res= RestAssured.given()
                .body(body)
                .header("Content-Type","application/json")
//                .basePath(")
//                .baseUri("/auth").then().log().all()
                .when()
                .post("https://restful-booker.herokuapp.com/auth")
                .then()
                .extract().response();
        System.out.println(res.asString());

        System.out.println(res.body());
        return res;
    }

    @Test
    public void testIt(){
        CreateTokenWithRes re= new CreateTokenWithRes();
        Response res= re.directResponse();

        System.out.println(res.toString());
        System.out.println(res.body());
        System.out.println("yo");
        System.out.println(res.getBody());
    }



}
