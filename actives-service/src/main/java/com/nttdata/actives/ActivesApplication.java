package com.nttdata.actives;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivesApplication {

  public static void main(String[] args) {
    System.setProperty("jdk.tls.client.protocols", "TLSv1.2"); // esto debido a que la version
                                                               // actual de JDK 11.02 ejecuta TLS <
                                                               // 1.2
    SpringApplication.run(ActivesApplication.class, args);
  }

}
