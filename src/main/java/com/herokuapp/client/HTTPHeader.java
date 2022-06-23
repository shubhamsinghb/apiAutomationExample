package com.herokuapp.client;

import java.util.HashMap;
import java.util.List;

public class HTTPHeader {

    private HashMap<String, String> headerMap;

    public HTTPHeader(){
        headerMap= new HashMap<>();
    }

    public void setHeader(String key, String value){
        headerMap.put(key,value);
    }

    public HashMap<String, String> getHeaderMap(){
        return headerMap;
    }
}
