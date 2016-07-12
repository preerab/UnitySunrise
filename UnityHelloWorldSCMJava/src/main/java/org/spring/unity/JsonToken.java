package com.spring.unity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by preethipadmanaban on 7/11/16.
 */

    @Component

    public class JsonToken {
    private String Username;
    private String password;

   /*  @JsonValue
    public String getJToken(String Username,String Password) {

        return  "{\"Username\":\"" + Username+"\"," +
                "\"Password\":\""+Password+"\"}";

    }*/

    public void test()
    {
        System.out.println("TEST");
    }

}
