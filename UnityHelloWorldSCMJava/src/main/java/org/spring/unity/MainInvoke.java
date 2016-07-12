package com.spring.unity;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by preethipadmanaban on 7/12/16.
 */

@SpringBootApplication
public class MainInvoke implements CommandLineRunner {

   /* @Autowired
   */ private UnityHelloWorldSCM UnityHelloWorldSCM;


    public static void main(String args[]) {
        SpringApplication.run(MainInvoke.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        UnityHelloWorldSCM.readSettings( "unity-example.properties" );

    }

   /* //@Override
    public void test(String... arg0) throws Exception {
        UnityHelloWorldSCM.readSettings( "unity-example.properties" );
    }*/


}
