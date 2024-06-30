package de.etool7.Webserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Webserver {

    public static void runWebserver(String[] args) {
        //Starte Springboot
        SpringApplication.run(Webserver.class, args);
    }

}
