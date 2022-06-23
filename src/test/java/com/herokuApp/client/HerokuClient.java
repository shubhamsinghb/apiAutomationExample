package com.herokuApp.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.herokuApp.requestPojo.CreateTokenRequest;
import com.herokuApp.responsePojo.BookingDetailsResponse;
import com.herokuApp.responsePojo.CreateTokenResponse;
import com.herokuapp.client.GetClient;
import com.herokuapp.client.HTTPHeader;
import com.herokuapp.client.PostClient;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.apache.http.Header;

public class HerokuClient {

    public CreateTokenResponse createNewToken(String name, String password, String basePath, String baseUrl) throws JsonProcessingException {
        HTTPHeader header = new HTTPHeader();
        header.setHeader("Content-Type","application/json");
        CreateTokenRequest createTokenRequest = new CreateTokenRequest();
        createTokenRequest.setPassword(password);
        createTokenRequest.setUsername(name);
        PostClient postClient = new PostClient();
        ObjectMapper mapper = new ObjectMapper();
        String payload= mapper.writeValueAsString(createTokenRequest);
        Response response= postClient.postCall(header,baseUrl,basePath,payload);
        CreateTokenResponse response1= mapper.readValue(response.getBody().asString(),CreateTokenResponse.class);
    return response1;
    }

    public BookingDetailsResponse getBooking(String id,String baseUrl) throws JsonProcessingException {
        GetClient getClient = new GetClient();

        Response response= getClient.getCall("",baseUrl,"booking",id);

        System.out.println(response.getBody().asString());
        return new ObjectMapper().readValue(response.getBody().asString(),BookingDetailsResponse.class);
    }
}
