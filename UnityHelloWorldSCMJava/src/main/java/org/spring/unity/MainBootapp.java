package org.spring.unity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Created by preethipadmanaban on 7/12/16.
 */
@SpringBootApplication

public class MainBootapp implements CommandLineRunner{

    @Autowired
   private UnitySunrise unity ;
    public static void main(String[] args)
    {

        SpringApplication app = new SpringApplication(MainBootapp.class);
        app.run(args);

    }

    @Override
    public void run(String... arg0) throws Exception {
        unity.test();
    }



}
